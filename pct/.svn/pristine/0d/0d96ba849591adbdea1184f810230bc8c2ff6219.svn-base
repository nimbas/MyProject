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
	
	function pagefunction() {
		
		var message = $("#neReqListGrid").selGridData();
		if(message != null){
			var jsonPretty = JSON.stringify(JSON.parse(message.message), null, 4);
			$("#modificationSection #pvReqSeqNo").val(message.pvReqSeqNo);
			$("#modificationSection #neSeqno").val(message.neSeqno);
			$("#modificationSection #message").val(jsonPretty);
		}
		  
		$("#saveBtn").click(function(e){ 
			e.preventDefault();
			var message = {   pvReqSeqNo : $("#modificationSection #pvReqSeqNo").val()
							, neSeqno 	 : $("#modificationSection #neSeqno").val()
							, message 	 : $("#modificationSection #message").val()
						  };
			$("#${param.dialogName}").loading();
			$.ajax({
				type : "POST",  
				async : true,
				url : '<s:url value="/op/provReq/modification"/>',
				data : message,
				//contentType: "application/json",
				dataType : 'json',
				success : function(data) { 
					if(data.resultCode == 'FAIL'){
						MessageBox.error(data.resultMsg);
					}else{
						MessageBox.info("Successfully saved!", function(){
							Dialog.close('#${param.dialogName}');						
						});	
					}
									
				},	error:function(data){
					MessageBox.error(data, "<s:message code="err.500"/>");
				}, complete:function(jqXHR, textStatus){
					$("#${param.dialogName}").complete();
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
	<div class="row" id="modificationSection" >
		<!-- NEW WIDGET START -->
		<article class="col-sm-12 col-md-12 col-lg-12">

			<!-- Widget ID (each widget will need unique ID)-->
			<div class="jarviswidget" id="wid-id-0" data-widget-colorbutton="false" data-widget-editbutton="false">
				<header>
					<%-- <span class="widget-icon"> <i class="fa fa-eye"></i> </span>
					<h2>Default Elements</h2> --%>

				</header>

				<!-- widget div-->
				<div>

					<!-- widget edit box -->
					<div class="jarviswidget-editbox">
						<!-- This area used as dropdown edit box -->

					</div>
					<!-- end widget edit box -->

					<!-- widget content -->
					<div class="widget-body">

						<form class="form-horizontal">
							<input type="hidden" id="neSeqno" value="${neSeqno }"/>
							<fieldset>
								<div class="form-group">
									<label class="col-md-3 control-label">Prove Req Seqno</label>
									<div class="col-md-9">
										<input class="form-control" placeholder="" type="text" id ="pvReqSeqNo" disabled>
									</div>
								</div>
								<div class="form-group">
									<label class="col-md-3 control-label">Message</label>
									<div class="col-md-9">
										<textarea class="form-control" placeholder="" id ="message" rows="10">${message }</textarea>
									</div>
								</div>
							</fieldset>
						</form>
					</div>
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