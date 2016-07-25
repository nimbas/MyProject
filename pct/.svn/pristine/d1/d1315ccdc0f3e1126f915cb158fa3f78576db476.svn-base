/*
 * Copyright (c) Abacus. All rights reserved.
 */
package com.acube.common.pagination;

/**
 *
 * @author bsyang
 * @since
 *
 */
public class OracleDialect extends  Dialect{

	/* (non-Javadoc)  
     * @see org.mybatis.extend.interceptor.IDialect#getLimitString(java.lang.String, int, int)  
     */   
    @Override   
    public  String getLimitString(String sql,  int  offset,  int  limit) {  
  
        sql = sql.trim();  
        StringBuffer pagingSelect = new  StringBuffer(sql.length() +  100 );  
        pagingSelect.append("SELECT * FROM ( SELECT row_.*, ROWNUM rowNumber , count(*) OVER() AS totalCount FROM ( \n" );  
        pagingSelect.append(sql + "\n");  
        pagingSelect.append(" ) row_ ) WHERE rowNumber > " ).append(offset).append( " AND rowNumber <= " ).append(offset + limit);  
        return  pagingSelect.toString();  
    }  

}
