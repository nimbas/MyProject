package com.acube.security.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.acube.common.domain.JsTree;
import com.acube.common.domain.code.LookupCode;
import com.acube.common.mapper.code.CodeRepository;

@Service
@Transactional
public class CodeMgtServiceImpl implements CodeMgtService{
	
	@Autowired
	CodeRepository codeRepository;

	@Override
	public List<LookupCode> getAllCodeList() {
		List<LookupCode> allCodeList = codeRepository.getAllCodeMgtList();
		return allCodeList;
	}

	@Override
	public List<LookupCode> getSingleCodeData(LookupCode lookupCode) {
		SimpleDateFormat transFormat = new SimpleDateFormat("yyyy-MM-dd");
		List<LookupCode> singleCodeDatas = codeRepository.getSingleCodeMgtData(lookupCode);
		
		for(LookupCode singleCodeData : singleCodeDatas){
			
			if(singleCodeData.getStartDateActive() != null){
				String strStartDateActive = transFormat.format(singleCodeData.getStartDateActive());
				singleCodeData.setStartDateActive_js(strStartDateActive);
			}
			if(singleCodeData.getEndDateActive() != null){
				String strEndDateActive = transFormat.format(singleCodeData.getEndDateActive());
				singleCodeData.setEndDateActive_js(strEndDateActive);
			}
			
		}
		return singleCodeDatas;
	}

	@Override
	public List<JsTree> getAllCodeListforTreeView(String language) {
		List<LookupCode> allCodeListforTreeView = codeRepository.getAllCodeMgtListforTreeView(language);
		List<JsTree> jsTreeList = new ArrayList<JsTree>();
		
		//HashSet <String> menuSet = new HashSet <String>();
		
		String ROOTID= "00";
		
		System.out.println("JG >>>> TEST >>>> allCodeListforTreeView.size() ::: "+allCodeListforTreeView.size());
						
		for (LookupCode e : allCodeListforTreeView) {
			
			JsTree jsTree = new JsTree();
			String treeID = "";
			
//			if(menuSet.contains(e.getCodeGroup()) == false){
//				jsTree.setParent("#");
//				treeID = ROOTID+"/"+e.getCodeGroup();
//				jsTree.setText(e.getCodeGroup()+" - "+ e.getParentMeaning());
//				menuSet.add(e.getCodeGroup());
//				jsTree.setId(treeID);
//				jsTree.setIcon("glyphicon glyphicon-book");
//				jsTreeList.add(jsTree);
//				
//				jsTree = new JsTree();
//				treeID = "";
//			}
			
			if(StringUtils.isEmpty(e.getParentMeaning())){
				jsTree.setParent("#");
				treeID = ROOTID+"/"+e.getCode();
				jsTree.setText(e.getCode()+" - "+ e.getMeaning());
				jsTree.setIcon("glyphicon glyphicon-book");
			}else{
				jsTree.setParent(ROOTID+"/"+e.getCodeGroup());
				treeID = e.getCodeGroup()+"/"+e.getCode();	
				jsTree.setText(e.getCode() + " - "+e.getMeaning());
				jsTree.setIcon("glyphicon glyphicon-leaf");
			}
			
			jsTree.setId(treeID);
			jsTreeList.add(jsTree);
			
		}
		return jsTreeList;
	}

	@Override
	public void addSingleCodeData(LookupCode lookupCode) {
		codeRepository.addSingleCodeMgtData(lookupCode);
		
	}

	@Override
	public void updateSingleCodeData(LookupCode lookupCode) {
		codeRepository.updateSingleCodeMgtData(lookupCode);
		
	}

	@Override
	public void deleteCodeData(LookupCode lookupCode) {
		codeRepository.deleteCodeMgtData(lookupCode);
	}

}
