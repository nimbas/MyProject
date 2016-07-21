/*
 * Copyright (c) Abacus. All rights reserved.
 */
package com.acube.common.pagination;

import java.sql.Connection;
import java.util.Properties;

import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.factory.DefaultObjectFactory;
import org.apache.ibatis.reflection.wrapper.DefaultObjectWrapperFactory;
import org.apache.ibatis.scripting.defaults.DefaultParameterHandler;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.RowBounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

import com.acube.common.domain.searchFilter.SearchFilter;

/**
 * 
 * @author bsyang
 * @since
 * 
 */
@Intercepts({ @Signature(type = StatementHandler.class, method = "prepare", args = { Connection.class }) })
public class PaginationInterceptor implements Interceptor {

	protected static Logger log = LoggerFactory.getLogger(PaginationInterceptor.class);

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.apache.ibatis.plugin.Interceptor#intercept(org.apache.ibatis.plugin
	 * .Invocation)
	 */
	@Override
	public Object intercept(Invocation invocation) throws Throwable {
		StatementHandler statementHandler = (StatementHandler) invocation.getTarget();
		MetaObject metaStatementHandler = MetaObject.forObject(statementHandler, new DefaultObjectFactory(), new DefaultObjectWrapperFactory());

		RowBounds rowBounds = (RowBounds) metaStatementHandler.getValue("delegate.rowBounds");
		if (rowBounds == null || rowBounds == RowBounds.DEFAULT) {
			//BoundSql boundSql = statementHandler.getBoundSql();
			String sql = processOrderingQuery(metaStatementHandler);
			log.debug("SQL : " + sql);
			//paging 처리는 없어도 ORDER BY가 있는 경우 처리한다.
			metaStatementHandler.setValue("delegate.boundSql.sql", sql);
			
			return invocation.proceed();
		}
		
		String originalSql = processOrderingQuery(metaStatementHandler);
		
		Dialect dialect = getDialect(metaStatementHandler);

		metaStatementHandler.setValue("delegate.boundSql.sql", dialect.getLimitString(originalSql, rowBounds.getOffset(), rowBounds.getLimit()));
		metaStatementHandler.setValue("delegate.rowBounds.offset", RowBounds.NO_ROW_OFFSET);
		metaStatementHandler.setValue("delegate.rowBounds.limit", RowBounds.NO_ROW_LIMIT);
		if (log.isDebugEnabled()) {
			BoundSql boundSql = statementHandler.getBoundSql();
			log.debug("SQL : " + boundSql.getSql());
		}
		return invocation.proceed();
	}

	//SearchFilter에 ORDER BY 파라미터가 있는 경우 ORDERING 처리
	private String processOrderingQuery(MetaObject metaStatementHandler) {
		String originalSql = (String) metaStatementHandler.getValue("delegate.boundSql.sql");
		
		@SuppressWarnings("unused")
		DefaultParameterHandler defaultParameterHandler = (DefaultParameterHandler) metaStatementHandler.getValue("delegate.parameterHandler");
		if(defaultParameterHandler.getParameterObject() instanceof SearchFilter){
			SearchFilter searchFilter = (SearchFilter)defaultParameterHandler.getParameterObject();
			String searchStr = "" ;
			if(searchFilter != null && !StringUtils.isEmpty(searchFilter.getSidx()) && !StringUtils.isEmpty(searchFilter.getSord())){
				searchStr = " ORDER BY " + searchFilter.getSidx() + " " + searchFilter.getSord() ;
				originalSql += searchStr ;
			}
		}
		return originalSql;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.apache.ibatis.plugin.Interceptor#plugin(java.lang.Object)
	 */
	@Override
	public Object plugin(Object target) {
		return Plugin.wrap(target, this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.apache.ibatis.plugin.Interceptor#setProperties(java.util.Properties)
	 */
	@Override
	public void setProperties(Properties arg0) {
		// TODO Auto-generated method stub

	}

	private Dialect getDialect(MetaObject metaStatementHandler) {
		
		Configuration configuration = (Configuration) metaStatementHandler.getValue("delegate.configuration");
		Dialect.Type databaseType = null;

		try {
			databaseType = Dialect.Type.valueOf(configuration.getVariables().getProperty("dialect").toUpperCase());
		} catch (Exception e) {
			// ignore
		}
		if (databaseType == null) {
			throw new RuntimeException("the value of the dialect property in configuration.xml is not defined : " + configuration.getVariables().getProperty("dialect"));
		}
		Dialect dialect = null;
		if ("MySQL".equalsIgnoreCase(databaseType.name())) {
			//dialect = new MySQLDialect();
		} else if ("MySQL5InnoDB".equalsIgnoreCase(databaseType.name())) {
			//dialect = new MySQLDialect();
		} else if ("MySQLMyISAM".equalsIgnoreCase(databaseType.name())) {
			//dialect = new MySQLDialect();
		} else if ("ORACLE".equalsIgnoreCase(databaseType.name())) {
			dialect = new OracleDialect();
		}else if ("ORACLE9I".equalsIgnoreCase(databaseType.name())) {
			dialect = new OracleDialect();
		} else if ("ORACLE10g".equalsIgnoreCase(databaseType.name())) {
			dialect = new OracleDialect();
		} else if ("ORACLE11g".equalsIgnoreCase(databaseType.name())) {
			dialect = new OracleDialect();
		}else if ("SqlServer2005".equalsIgnoreCase(databaseType.name())) {

		} else if ("SqlServer2008".equalsIgnoreCase(databaseType.name())) {

		} else if ("SqlServer".equalsIgnoreCase(databaseType.name())) {

		}
		return dialect;
	}
}
