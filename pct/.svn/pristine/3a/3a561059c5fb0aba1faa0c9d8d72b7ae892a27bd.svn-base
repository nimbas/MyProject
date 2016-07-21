var Dialog = {};
var dialogTitleAppId = "";
var dialogTitleMyMenuId ="";
var divMaskObj = "body" ;
Dialog.open = function(dialogOpt){
	
	var favoriteBtns = null ;
	var sourceDivId = dialogOpt.div.replace("#","");
	$("#"+sourceDivId).unmask();
			
	if(typeof(dialogOpt.url) == "string"){
		if($('body').find("[id="+sourceDivId+"]").length>0){
			$('body').find("[id="+sourceDivId+"]").remove(); 	
		}
		$('body').append($("<div id="+sourceDivId+"></div>"));
		$("#"+sourceDivId).append("<div id='"+sourceDivId+"_source'></div>");
		 
		if(sourceDivId == 'dialogContent'){
			var title = "" ; //"<span class='btns3_16 save'><input type='button' alt='Add My Memu' value='+' id='addFavoriteMenuBtn' onClick='javascript:addFavorite(\""+dialogTitleMyMenuId+"\" );' /></span>"; 
			    title +=  dialogOpt.title ; 
			dialogOpt.title =  title ; 
			dialogTitleAppId = "" ;
			dialogTitleMyMenuId ="";
		} 
		var modal = dialogOpt.modal;
		if(modal == null){
			modal = true; 
		}
		// dialog를 먼저 Open 한다.
		$("#"+sourceDivId).dialog({
			autoOpen: false,
			width: dialogOpt.width,
			height:dialogOpt.height,
			modal : modal,
			title : dialogOpt.title, 		  
			resizable : false,  
			closeOnEscape : false 
		}); 
		
		$("#"+sourceDivId).dialog('open');
		
		//로딩바 처리
		var maxZindexDialog = getTopDialog();
		if(maxZindexDialog){
			divMaskObj = maxZindexDialog ;
		}
		$("#"+sourceDivId).parent().mask('Loading...'); 
		
		var dialogUrl = dialogOpt.url  ;
		if(dialogUrl.indexOf('?') != -1){
			dialogUrl += '&dialogName=' + sourceDivId  ;
		}else{
			dialogUrl += '?dialogName=' + sourceDivId  ;
		}
		// 실제 화면 로딩 처리		
		if(dialogOpt.method != null && dialogOpt.method == 'post'){ 
			$.ajax({
				type : "POST",  
				async : true, 
				url : dialogUrl,
				contentType: "application/json",
				data : dialogOpt.data,
				dataType : 'html',
				success : function(data) {
					try{
						$("#"+sourceDivId).find("[id="+sourceDivId+"_source]").empty().append(data);	
					}catch(e){
						console.log(e);
					}		
				},	error:function(data){
					//서버 비정상 동작시 구현
					//MessageBox.error(data, "err.500");
				}, complete:function(jqXHR, textStatus){					
					$("#"+sourceDivId).parent().unmask(); 
				} 
			});
		}else{
			$.ajax({
				type : "GET",  
				async : true ,
				url : dialogUrl,
				dataType : 'html',
				success : function(data) {
					//console.log(data);
					//$("#"+sourceDivId).find("[id="+sourceDivId+"_source]").empty().append(data);
					try{
						$("#"+sourceDivId).find("[id="+sourceDivId+"_source]").empty().append(data);	
					}catch(e){
						console.log(e);
					}
				},	error:function(data){
					//서버 비정상 동작시 구현
					//MessageBox.error(data, "err.500");
				}, complete:function(jqXHR, textStatus){
					$("#"+sourceDivId).parent().unmask();
				} 
			}); 			
		}

		//X버튼에 대한 이벤트 바인딩 처리
		$("#"+sourceDivId).prev().css({'background': '#428bca'});
		$("#"+sourceDivId).prev().find('.ui-dialog-titlebar-close').css({'margin-top': '-10px'});
		$("#"+sourceDivId).bind("dialogclose", function(){
			emptyDialogContent(sourceDivId); 
		});
		
	}
	
	if(dialogOpt.close == false ){
		$(".ui-dialog-titlebar-close").hide();
	}
};

Dialog.close = function(dialogOpt){
	var sourceDivId = dialogOpt.replace("#","");
	if($('body').find("[id="+sourceDivId+"]").length>0){
		emptyDialogContent(sourceDivId); 	
		$("#"+sourceDivId).dialog('close');
	} 
};
function emptyDialogContent(sourceDivId){
	$('body').find("[id="+sourceDivId+"]").empty().remove(); 	
}

function getTopDialog(){
	var maxDialog = null;
	var maxZ = Math.max.apply(null,$.map($('.ui-dialog'), function(e,n){
        if($(e).css('position')=='absolute'){
        	maxDialog = $(e);
            return parseInt($(e).css('z-index'))||1 ;		            	
        }	
	}));
	return maxDialog;  
}