<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="code" uri="http://www.acube.com/jsp/tags/core" %>
<%@ taglib prefix="customTag" tagdir="/WEB-INF/tags" %>

<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>

<script type="text/javascript">
$(function(e) {
	
	pageSetUp(); //Default Call function
	pagefunction();
	loadScript(baseScriptUrl + '/co/form.custom.validator.js');
	function pagefunction() {
		
		  
		$("#saveBtn").click(function(e){ 
			e.preventDefault();
			
			if(!$('#authorityRegForm').formValidate()){
				return ;
			}
			var message = {   authName : $("#authorityRegForm #authName").val()
							, authType 	 : $("#authorityRegForm #authType").val()
							, description 	 : $("#authorityRegForm #description").val()
						  };
			$("#regFormProfileAuthority").loading();
			$.ajax({
				type : "POST",  
				async : true,
				url : '<s:url value="/authority/"/>' + $("#authorityRegForm #authName").val(), 
				data : message,
				//contentType: "application/json",
				dataType : 'json',
				success : function(data) { 
					if(data.resultCode == 'FAIL'){
						MessageBox.error(data.resultMsg);
					}else{
						MessageBox.info("Saved!", function(){
							if('${param.callBack}' != '' && eval("window.${param.callBack}") != null){
								var funcName = eval("window.${param.callBack}");
								funcName();
								Dialog.close('#${param.dialogName}');
							}else{
								alert('${param.callBack} function is not defined!');
							}
						});	
					}
									
				},	error:function(data){
					MessageBox.error(data, "<s:message code="err.500"/>");
				}, complete:function(jqXHR, textStatus){
					$("#regFormProfileAuthority").complete();
				}
			});
		});
		$("#closeBtn").click(function(e){ 
			e.preventDefault();
			Dialog.close('#${param.dialogName}');			
		});
		
	}// end pageFunction
	
});	
</script>

<section class="">
	<!-- row -->
	<div class="row" id="authorityRegForm" >
		<!-- NEW WIDGET START -->
		<article class="col-sm-12 col-md-12 col-lg-12">

			<!-- Widget ID (each widget will need unique ID)-->
			
				
				
				<!-- widget div-->
				<div>
					<div class="jarviswidget-editbox">
						<!-- This area used as dropdown edit box -->

					</div>
					<!-- widget content -->
					<div class="widget-body">
						
						<form class="form-horizontal">
							<fieldset>
								<div class="form-group">
									<label class="col-md-4 control-label">Authority Name </label>
									<div class="col-md-8">
										<input class="form-control required" placeholder="" type="text" id ="authName" required="required">
									</div>
								</div>
								<div class="form-group">
									<label class="col-md-4 control-label">Description</label>
									<div class="col-md-8">
										<textarea class="form-control required" placeholder="" id ="description" rows="4" required="required"></textarea>
									</div>
								</div>
								<div class="form-group">
									<label class="col-md-4 control-label">Authority Type</label>
									<div class="col-md-8">
										<select id="authType" name="authType" class="form-control" disabled>
											<option value="A" ${param.profileType eq 'A' ? 'selected' : ''}>Auth</option> 
											<option value="O" ${param.profileType eq 'O' ? 'selected' : ''}>Object</option>
										</select>
									</div>
								</div>
							</fieldset>
						</form>
					</div>
				</div>
			
			<div class="form-actions">
				<div class="row">
					<div class="col-md-12">
						<customTag:button label="Save" id="saveBtn" css="success" size="xs"/>
						<customTag:button label="Close" id="closeBtn" css="success" size="xs"/>
					</div>
				</div>	
			</div>
		</article>
	</div>
</section>