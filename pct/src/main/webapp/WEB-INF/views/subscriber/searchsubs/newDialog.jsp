<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="code" uri="http://www.acube.com/jsp/tags/core" %>
<%@ taglib prefix="customTag" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="c"         uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="fn"        uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="cug" uri="http://www.acube.com/jsp/tags/cug" %>

<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>

<!-- widget grid -->
<!-- widget grid -->
<section id="widget-grid" class="">
	<div class="row">
	<input type="hidden" name="forCBEntrNo" id="forCBEntrNo" class="cbs_field" value="${forCBEntrNo}" />
	<input type="hidden" name="forSysMemo" id="forSysMemo" class="cbs_field" value="${forSysMemo}" />
		<article class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
	        <div class="table-responsive">
			    <table class="table table-condensed table-bordered">
		            <colgroup>
		         	    <col width="40%">
		         		<col width="60%">
		         	</colgroup>
		         	<tr>
		         		<td class="bg-color-blue txt-color-white" align="right">
		         		Memo Type
		         		</td>
		         		<td>
		         		Subscriber
		         		</td>
		         	</tr>
		         	<tr>
		         	    <td class="bg-color-blue txt-color-white" align="right">
		         	    Memo Category
		         		</td>
		         		<td>
		         		Register User Memo
		         		</td>
		         	</tr>
		         	<tr>
		         	    <td class="bg-color-blue txt-color-white" align="right">
		         	    Product No
		         		</td>
		         		<td>
		         		    <select class="form-control" id="cbProductNo" name="cbProductNo" required="required">
		                    </select>
		         		</td>
		         	</tr>
		         	<tr>
		         	    <td class="bg-color-blue txt-color-white" align="right">
		         	    User Comment
		         		</td>
		         		<td>
		         		    <textarea id='taNDUserComment' name='taNDUserComment' style="width:100%; height:200px"></textarea>
		         		</td>
		         	</tr>
		         </table>
			</div>
			<div class="row" align="right">
   			    <div align="right" style="margin-right:15px; margin-top:-13px">
			        <button type="button" id="btNDSave" onclick="fclickSave()">Save</button>
				    <button type="button" id="btNDClose" onclick="fclickCloseND()">Close</button>
				</div>
			</div>
		</article>
	</div>
	<!-- end row -->		
</section>
<!-- end widget grid -->

<script type="text/javascript">
	$(function(){
		pageSetUp();
		pagefunction();
		
		setCbProductNo();
		
		function pagefunction() {
			loadScript('${BOOT_JS}/plugin/jquery-form/jquery-form.min.js');
		}
	});
	
	function fclickCloseND(){
		Dialog.close('#${param.dialogName}');
	}
	
	function setCbProductNo() {
		
		var value = $("#forCBEntrNo").val();
		var url = 'subscriber/getCbProductNo?entrNo='+value;	

		$.ajax({
			type : "GET",  
			async : false,
			url : url,
			dataType : 'json',
			data : '',
			success : function(data) {
				$("#cbProductNo").empty();
				if(data.list.length>0){
					$("#cbProductNo").removeAttr("disabled");
					for(var i=0; i<data.list.length; i++){
						var memoKdCdInfo = data.list[i];
						$("#cbProductNo").append("<option value="+memoKdCdInfo.custNo+">"+memoKdCdInfo.prodNo+"</option>");
					}
				}else{
					$("#cbProductNo").attr("disabled");
					$("#cbProductNo").append("<option value=''>::: No Data!!! :::</option>");
				}
			},
			error:function(data){
				MessageBox.error(data, "err.500"); 
			}, complete:function(jqXHR, textStatus){ 
				vFirstLoad = false;
			}
		});	 
	}
	
	function fclickSave(){
		var forSendProductNo =  $("#cbProductNo").text();
		var forSendSysMemo   =  $("#forSysMemo").val();
		var forSendUserMemo  =  $("#taNDUserComment").val();
		
		if(forSendSysMemo == null){
			forSendSysMemo = "";
		}
		
		var url = 'subscriber/insertUserMemo?productNo=' + forSendProductNo + '&sysMemo=' + forSendSysMemo + '&userComment=' + forSendUserMemo;	
		
		$.ajax({
			type : "GET",  
			async : false,
			url : url,
			dataType : 'json',
			data : '',
			success : function(data) {
				MessageBox.info("Insert Success!!!");
			},
			error:function(data){
				MessageBox.error(data, "err.500"); 
			}, complete:function(jqXHR, textStatus){ 
				vFirstLoad = false;
			}
		});
		
	}
</script>