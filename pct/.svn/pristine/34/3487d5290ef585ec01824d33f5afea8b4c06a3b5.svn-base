(function($){
	//기본적으로 그리드 상위영역의 width로 설정한다.  
	$.fn.formValidate = function(){
		var trgt = $(this);
		var returnValue = true;
		//필수 항목만 체크
		$(trgt).find('[required=required]').each(function(e){
			var obj = $(this);
			var message = $(this).parent().prev() ;
			
			//message = $(trgt).find('label [for='+$(this).attr('id')+']').html();
			if(message.is('label')){
				message = $(this).parent().prev().html() ;
			}else{
				if($(this).parent().parent().prev().is('label')){
					message = $(this).parent().parent().prev().html() ;
				}else{
					message = $(this).parent().parent().parent().prev().html() ;
				}
			} 
			
			if($(this).is(":radio") || $(this).is(":checkbox")){
				var checkedTrgtLength = $(trgt).find('[name='+$(this).attr('name')+']:checked').length ;
				if(checkedTrgtLength == 0){
					MessageBox.alert("Please, Check " + message, function(){
						$(obj).focus();
					});
					returnValue = false ;
					return false;//break each loop
				}
			}else if($(this).is("select")){
				if($(this).val() == "" || $(this).val()=="X"){
					MessageBox.alert("Please, Select "+message, function(){
						$(obj).focus();
					});
					returnValue = false ;
					return false;//break each loop
				}
			}
			else{
				if($(this).val() == "" || $(this).val()=="X"){
					MessageBox.alert("Please, Input "+message, function(){
						$(obj).focus();
					});
					returnValue = false ;
					return false;//break each loop
				}
			}
			
		});
		
		//type = number 체크..
		$(trgt).find('input[type=number]').each(function(i, elm){
			var val = $(this).val();			
			var result = /[^0123456789]/g.test(val);
			if(val =='' || result ) {
				MessageBox.alert("The value is not number. Input only number.", function(){
					$(this).val('');
			   		$(this).focus();
				});
		   		returnValue = false ;
		   		return false;//break each loop
	   		}
			
		});
		
		//TODO : 필요시 향후 max/min size 체크
		return returnValue;
	};
	
	$.fn.bindingFormData = function(bindingJsonData){
		try{
			var bindingFormName = $(this);
			$.each(bindingJsonData, function(itemName,itemValue){
				itemName = itemName.replace(/[.]/g, '\\.');
				if($(bindingFormName).find("[id="+itemName+"]").length > 0){
					
					//설정하기전 기존 값을 해제함.
					$(bindingFormName).find("[id="+itemName+"]").each(function(e){
						if($(this).is(":radio") || $(this).is(":checkbox")){
							$(this).prop("checked", false);
						}else if($(this).is("select")){
							$(this).val("");
						}else if($(this).is("textarea") || $(this).is("input")){
							$(this).val("");	
						}else if($(this).is("div") || $(this).is("span") || $(this).is("label")){
							$(this).html('');	
						}
					});
					
					$(bindingFormName).find("[id="+itemName+"]").each(function(e){
						if($(this).is(":radio")){
							if($(this).val() == itemValue){
								console.log('radio ::: ' + $(this).val() +'=='+ itemValue);
								$(this).prop("checked", true); 
							}
						}else if($(this).is(":checkbox")){
							var chkValue = itemValue.split(',');
							for(var i=0; i<chkValue.length;i++){
								if($(this).val() == chkValue[i]){
									$(this).prop("checked", true);
								}	
							}					
						}else if($(this).is("textarea")){
							$(this).val(itemValue);	
						}else if($(this).is("input")){
							$(this).val(itemValue);	
						}else if($(this).is("select")){
							//TODO : multi select 시에는 별도처리 필요함.
							$(this).val(itemValue);	
						}else if($(this).is("div") || $(this).is("span") || $(this).is("label")){
							$(this).html(itemValue);	
						}
					});
				}
			});
		}catch(e){
			//alert(e);
		}
	}
})(jQuery);	


