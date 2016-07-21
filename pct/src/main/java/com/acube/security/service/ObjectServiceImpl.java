/*
 * Copyright 2002-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.acube.security.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.acube.common.domain.JsTree;
import com.acube.common.domain.mbg.CoSecurityElements;
import com.acube.common.domain.mbg.CoSecurityElementsKey;
import com.acube.common.mapper.mbg.CoSecurityElementsMapper;
import com.acube.common.mapper.mbg.SeSecurityProfileInfoMapper;
import com.acube.security.domain.Elements;
import com.acube.security.mapper.ElementsRepository;
import com.acube.security.mapper.OrgRepository;
import com.acube.security.mapper.ProfileRepository;

@Service
@Transactional
public class ObjectServiceImpl implements ObjectService {

	private static final Logger logger = LoggerFactory.getLogger(ObjectServiceImpl.class);

	@Autowired
	private transient OrgRepository orgRepository;

	@Autowired
	private transient ElementsRepository elementsMapper;

	@Autowired
	private transient CoSecurityElementsMapper coSecurityElementsMapper;

	@Autowired
	private transient SeSecurityProfileInfoMapper seSecurityProfileInfoMapper;

	@Autowired
	private ProfileRepository profileRepository;

	@Override
	public List<JsTree> getAllElementsTree() {

		// Alternative format of the node (id & parent are required)
		/*
		 * { id : "string" // required parent : "string" // required text :
		 * "string" // node text icon : "string" // string for custom state : {
		 * opened : boolean // is the node open disabled : boolean // is the
		 * node disabled selected : boolean // is the node selected }, li_attr :
		 * {} // attributes for the generated LI node a_attr : {} // attributes
		 * for the generated A node }
		 */

		List<JsTree> jsTreeList = new ArrayList<JsTree>();

		List<Elements> elementsList = elementsMapper.getAllElementsTreeList();

		for (Elements e : elementsList) {
			JsTree jsTree = new JsTree();
			jsTree.setId(e.getId());

			if (StringUtils.isEmpty(e.getParent())) {
				jsTree.setParent("#");
			} else {
				jsTree.setParent(e.getParent());
			}

			jsTree.setText(e.getDescription());

			if (e.getRecordType().equalsIgnoreCase("C")) {
				jsTree.setIcon("glyphicon glyphicon-leaf");
			} else {
				jsTree.setIcon("glyphicon glyphicon-book");
			}

			jsTreeList.add(jsTree);
		}

		return jsTreeList;
	}

	/**
	 * <pre>
	 * 1. abstract : 
	 * 2. procedure :
	 * </pre>
	 * 
	 * @Method Name : getElementById
	 * @date : 2014. 12. 24.
	 * @author : ChoiKangYou
	 * @history :
	 *          ----------------------------------------------------------------
	 *          ------- change date developer change log -----------
	 *          ------------------- ---------------------------------------
	 *          2014. 12. 24. ChoiKangYou init.
	 *          ----------------------------------
	 *          -------------------------------------
	 * 
	 * @return
	 */
	@Override
	public CoSecurityElements getElementById(int id) {

		CoSecurityElementsKey key = new CoSecurityElementsKey();
		key.setSecurityNo(id);

		return coSecurityElementsMapper.selectByPrimaryKey(key);
	}

	/**
	 * <pre>
	 * 1. abstract : 
	 * 2. procedure :
	 * </pre>
	 * 
	 * @Method Name : updateObjectInfo
	 * @date : 2014. 12. 26.
	 * @author : ChoiKangYou
	 * @history :
	 *          ----------------------------------------------------------------
	 *          ------- change date developer change log -----------
	 *          ------------------- ---------------------------------------
	 *          2014. 12. 26. ChoiKangYou init.
	 *          ----------------------------------
	 *          -------------------------------------
	 * 
	 * @param obj
	 */
	@Override
	public void updateObjectInfo(CoSecurityElements obj) {
		logger.debug("====updateObjectInfo==\n" + obj.toString());

		coSecurityElementsMapper.updateByPrimaryKeySelective(obj);

	}

	/**
	 * <pre>
	 * 1. abstract : 입력값으로 insert후 key를 return
	 * 2. procedure :
	 * </pre>
	 * 
	 * @Method Name : insertObjectInfo
	 * @date : 2014. 12. 26.
	 * @author : ChoiKangYou
	 * @history :
	 *          ----------------------------------------------------------------
	 *          ------- change date developer change log -----------
	 *          ------------------- ---------------------------------------
	 *          2014. 12. 26. ChoiKangYou init.
	 *          ----------------------------------
	 *          -------------------------------------
	 * 
	 * @param obj
	 * @return
	 */
	@Override
	public int insertObjectInfo(CoSecurityElements obj) {

		String key = coSecurityElementsMapper.selectInsertKey();
		int securityNo = Integer.parseInt(key);

		obj.setSecurityNo(securityNo);
		coSecurityElementsMapper.insertSelective(obj);

		return securityNo;
	}

	/**
	 * <pre>
	 * 1. abstract : pk로 삭제 
	 * 2. procedure :
	 * </pre>
	 * 
	 * @Method Name : deleteElementById
	 * @date : 2014. 12. 26.
	 * @author : ChoiKangYou
	 * @history :
	 *          ----------------------------------------------------------------
	 *          ------- change date developer change log -----------
	 *          ------------------- ---------------------------------------
	 *          2014. 12. 26. ChoiKangYou init.
	 *          ----------------------------------
	 *          -------------------------------------
	 * 
	 * @param id
	 */
	@Override
	public void deleteObjectInfo(String id) {

		List<Elements> el = elementsMapper.selectObjectInfoByCascade(id);

		for (Elements e : el) {
			CoSecurityElementsKey key = new CoSecurityElementsKey();
			key.setSecurityNo(Integer.parseInt(e.getSecurityNo()));
			coSecurityElementsMapper.deleteByPrimaryKey(key);
		}

		CoSecurityElementsKey key = new CoSecurityElementsKey();
		key.setSecurityNo(Integer.parseInt(id));
		coSecurityElementsMapper.deleteByPrimaryKey(key);

	}

}
