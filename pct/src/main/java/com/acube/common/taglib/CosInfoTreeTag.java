package com.acube.common.taglib;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

import com.acube.pc.domain.Member;
import com.acube.sub.domain.CosInfoTree;
import com.acube.sub.service.CosInfoService;

public class CosInfoTreeTag extends TagSupport {

	private static final long serialVersionUID = -1737909799624833788L;

	private CosInfoService cosInfoService ; 
	
	private List<CosInfoTree> cosInfoTreeList;
	String userId;

	public CosInfoTreeTag() {
        super();
        init();
    }
	
	
	private void init() {
		cosInfoService = TagConfiguration.getInstance().getCosInfoService();
	}
    
    @Override
    public int doEndTag() throws JspException{
    	HttpSession httpSession = this.pageContext.getSession() ;
    	Member loginMember  = (Member)httpSession.getAttribute("ss_member");
    	
    	
    	if(loginMember != null)userId=loginMember.getUserId();
    	
    	cosInfoTreeList = cosInfoService.getCosInfoTree();
    	
    	if(cosInfoTreeList.size()<1)return EVAL_PAGE;
    	
    	StringBuffer htmlBuf = new StringBuffer();
		this.genCosInfoTreeHtml(htmlBuf);
    	JspWriter w = pageContext.getOut();
    	try {
			w.print(htmlBuf.toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new JspException(e.toString(), e);
		}
    	return super.doEndTag();
    	
    }
    
    private void genCosInfoTreeHtml(StringBuffer htmlBuf){
    	this.getLevel1CosTreeHtml(htmlBuf);
    }
    
    public List<CosInfoTree> getChildInfoList(String currentHposBizbrCd){
    	List newList = new ArrayList();
    	
    	for(int i=0; i<cosInfoTreeList.size(); i++){
    		CosInfoTree el = (CosInfoTree)cosInfoTreeList.get(i);
    		String hposBizbrCd = el.getHposBizbrCd();
    		if(currentHposBizbrCd.equals(hposBizbrCd)){
    			newList.add(el);
    		}
    	}
    	return newList;
    }
    
    public boolean hasChild(String currentSecurityNo){
    	List childList = getChildInfoList(currentSecurityNo);
    	return childList !=null && childList.size()>0;
    }
    
    public List<CosInfoTree> getCosTopLevelList(){
    	List newList = new ArrayList();
    	
    	for(int i=0;i<cosInfoTreeList.size();i++){
    		CosInfoTree el = (CosInfoTree)cosInfoTreeList.get(i);
    		String hposBizbrCd = el.getHposBizbrCd();
    		if(hposBizbrCd ==null || "".equals(hposBizbrCd)){
    			newList.add(el);
    		}
    	}
    	
    	return newList;
    }
    
     private void getLevel1CosTreeHtml(StringBuffer htmlBuf){
     	List topLevelList =  getCosTopLevelList();
     	for(int i=0;i<topLevelList.size();i++){
     		CosInfoTree el = (CosInfoTree)topLevelList.get(i);
//     		htmlBuf.append("<li><a href='#'	value='"+el.getDlrCd()+"' >"+el.getDlrNm());
     		htmlBuf.append("<li><span onclick=\'treeDlrCd(\""+el.getDlrCd()+"\" , \""+el.getDlrNm()+"\");\' >"+el.getDlrNm()+"</span>");
           	htmlBuf.append("<ul>");
           	getLevel2CosTreeHtml(htmlBuf,el.getDlrCd());
           	htmlBuf.append("</ul>");
           	htmlBuf.append("</li>");
     	}
    	
     }
     
     private void getLevel2CosTreeHtml(StringBuffer htmlBuf, String genSecurityNo){
    	List elementInfoList =  getChildInfoList(genSecurityNo);
		for(int i=0;i<elementInfoList.size();i++){
			CosInfoTree el = (CosInfoTree)elementInfoList.get(i);
			if(hasChild(el.getDlrCd())){
//				htmlBuf.append("<li><a href='#'	value='"+el.getDlrCd()+"' >");
				htmlBuf.append("<li><span onclick=\'treeDlrCd(\""+el.getDlrCd()+"\" , \""+el.getDlrNm()+"\");\' >"+el.getDlrNm()+"</span>");
//				htmlBuf.append(el.getDlrNm());
				htmlBuf.append("<ul>");
				getLevel3CosTreeHtml(htmlBuf,el.getDlrCd());
				htmlBuf.append("</ul>");
				htmlBuf.append("</a></li>");
			}else{
//				htmlBuf.append("<li><a href='#'	value='"+el.getDlrCd()+"' >"+el.getDlrNm()+"</a></li>");
				htmlBuf.append("<li><span onclick=\'treeDlrCd(\""+el.getDlrCd()+"\" , \""+el.getDlrNm()+"\");\' >"+el.getDlrNm()+"</span></li>");
			}
		}	
     }
     
     private void getLevel3CosTreeHtml(StringBuffer htmlBuf, String genSecurityNo){
    	List elementInfoList =  getChildInfoList(genSecurityNo);
    	for(int i=0;i<elementInfoList.size();i++){
			CosInfoTree el = (CosInfoTree)elementInfoList.get(i);
			if(hasChild(el.getDlrCd())){
//				htmlBuf.append("<li><a href='#'	value='"+el.getDlrCd()+"' >");
				htmlBuf.append("<li><span onclick=\'treeDlrCd(\""+el.getDlrCd()+"\" , \""+el.getDlrNm()+"\");\' >"+el.getDlrNm()+"</span>");
//				htmlBuf.append(el.getDlrNm());
				htmlBuf.append("<ul>");
				getLevel4CosTreeHtml(htmlBuf,el.getDlrCd());
				htmlBuf.append("</ul>");
				htmlBuf.append("</a></li>");
			}else{
//				htmlBuf.append("<li><a href='#'	value='"+el.getDlrCd()+"' >"+el.getDlrNm()+"</a></li>");
				htmlBuf.append("<li><span onclick=\'treeDlrCd(\""+el.getDlrCd()+"\" , \""+el.getDlrNm()+"\");\' >"+el.getDlrNm()+"</span></li>");
			}
		}	

     }
     
     
     private void getLevel4CosTreeHtml(StringBuffer htmlBuf, String genSecurityNo){
     	List elementInfoList =  getChildInfoList(genSecurityNo);
     	for(int i=0;i<elementInfoList.size();i++){
 			CosInfoTree el = (CosInfoTree)elementInfoList.get(i);
 			if(hasChild(el.getDlrCd())){
// 				htmlBuf.append("<li><a href='#'	value='"+el.getDlrCd()+"' >");
 				htmlBuf.append("<li><span onclick=\'treeDlrCd(\""+el.getDlrCd()+"\" , \""+el.getDlrNm()+"\");\' >"+el.getDlrNm()+"</span>");
// 				htmlBuf.append(el.getDlrNm());
 				htmlBuf.append("<ul>");
 				getLevel5CosTreeHtml(htmlBuf,el.getDlrCd());
 				htmlBuf.append("</ul>");
 				htmlBuf.append("</a></li>");
 			}else{
// 				htmlBuf.append("<li><a href='#'	value='"+el.getDlrCd()+"' >"+el.getDlrNm()+"</a></li>");
 				htmlBuf.append("<li><span onclick=\'treeDlrCd(\""+el.getDlrCd()+"\" , \""+el.getDlrNm()+"\");\' >"+el.getDlrNm()+"</span></li>");
 			}
 		}	

      }
     
     private void getLevel5CosTreeHtml(StringBuffer htmlBuf, String genSecurityNo){
      	List elementInfoList =  getChildInfoList(genSecurityNo);
      	for(int i=0;i<elementInfoList.size();i++){
  			CosInfoTree el = (CosInfoTree)elementInfoList.get(i);
  			if(hasChild(el.getDlrCd())){
//  			htmlBuf.append("<li><a href='#'	value='"+el.getDlrCd()+"' >");
  				htmlBuf.append("<li><span onclick=\'treeDlrCd(\""+el.getDlrCd()+"\" , \""+el.getDlrNm()+"\");\' >"+el.getDlrNm()+"</span>");
// 				htmlBuf.append(el.getDlrNm());
  				htmlBuf.append("<ul>");
  				getLevel6CosTreeHtml(htmlBuf,el.getDlrCd());
  				htmlBuf.append("</ul>");
  				htmlBuf.append("</a></li>");
  			}else{
// 				htmlBuf.append("<li><a href='#'	value='"+el.getDlrCd()+"' >"+el.getDlrNm()+"</a></li>");
  				htmlBuf.append("<li><span onclick=\'treeDlrCd(\""+el.getDlrCd()+"\" , \""+el.getDlrNm()+"\");\' >"+el.getDlrNm()+"</span></li>");
  			}
  		}	

       }
     
     private void getLevel6CosTreeHtml(StringBuffer htmlBuf,String genSecurityNo){
    	List elementInfoList =  getChildInfoList(genSecurityNo);
     	for(int i=0;i<elementInfoList.size();i++){
  			CosInfoTree el = (CosInfoTree)elementInfoList.get(i);
// 			htmlBuf.append("<li><a href='#'	value='"+el.getDlrCd()+"' >"+el.getDlrNm()+"</a></li>");
  			htmlBuf.append("<li><span onclick=\'treeDlrCd(\""+el.getDlrCd()+"\" , \""+el.getDlrNm()+"\");\' >"+el.getDlrNm()+"</span></li>");
  			
  		}
     }
    
    public void release() {
        super.release();
        init();
        
    }
}