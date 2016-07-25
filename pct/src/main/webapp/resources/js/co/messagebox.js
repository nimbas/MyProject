var MessageBox = {} ;
var __callFunction = null ;
var __cancelFunction = null;
var messageFunction = function(mod, arguments){
var _errorMessage="";
	var _errorMessageParam = ""; 
	__callFunction = null;
	var args = arguments.length ;
	if(args==1){
		_errorMessage = arguments[0];	
	}else if(args==2){
		_errorMessage = arguments[0];	
		_errorMessageParam = arguments[1];	
		if(typeof(_errorMessageParam) == 'function'){
			__callFunction = _errorMessageParam ;
		}
	}else if(args==3){
		_errorMessage = arguments[0];	
		_errorMessageParam = arguments[1];	
		__callFunction = arguments[2];	
	}
	
	
	var msgCode ;
	try{
		msgCode = eval(_errorMessage.replace(".", "_"));
		if(msgCode != null){
			_errorMessage = msgCode ;
		}
	}catch(exception){
		//alert(exception);
		msgCode= null ;
	}
	if(typeof(_errorMessageParam) != 'function' && _errorMessageParam != null && _errorMessageParam != ''){
		for(var i=0; i < _errorMessageParam.length ; i++){
			_errorMessage = _errorMessage.replace('%'+i, _errorMessageParam[i]) ;
		}
	}		
	
	if(_errorMessage != ""){		
		//attach message box division to body 
		if(mod == 'alert'){
			attachMessageBox('Alert');
		}else if(mod == 'Info'){
			attachMessageBox('Information');
		}else{
			attachMessageBox('Notification');
		}
		// Dialog			
		$('#dialogMessagebox').dialog({
			autoOpen: false,
			modal : true,
			width: 300,
			closeOnEscape : false, 
			buttons: {
				"Ok": function() {
					$('#dialogMessagebox').dialog("close"); 
					removeMessageBox();
					if(__callFunction != null){
						setTimeout(__callFunction, 100);
					}
				}
		
			}
		});
		_errorMessage = _errorMessage.replace("com.acube.unitel.common.exception.AcubeException:", "");
		_errorMessage = _errorMessage.replace("com.acube.unitel.common.exception.AcubeCommonException:", "");
		$('#dialogMessagebox').find("#message")
								.empty()
								.append(_errorMessage);
		$('#dialogMessagebox').dialog("open");
		$('#dialogMessagebox').prev().find("a").hide();
	}
}	

MessageBox.alert = function (){
	messageFunction('alert', arguments);
};

MessageBox.info = function (){
	messageFunction('info', arguments);
};

MessageBox.noti = function (){
	messageFunction('noti', arguments);
};

MessageBox.error = function (){

	var _errorMessage = null ;	
	var args = arguments.length ;
	var data = null;
	var err500 = null;
	if(args==1){
		err500 = arguments[0];	
	}else if(args==2 && typeof(arguments[1]) != 'function'){
		data = arguments[0];	
		err500 = arguments[1];	
	}else if(args==2 && typeof(arguments[1]) == 'function'){
		err500 = arguments[0];	
		__callFunction = arguments[1];	
	}
	
	var refresh = false ;
	//alert('loginActionUrl='+loginActionUrl+', '+ data.status +', ' + data.responseText.indexOf(loginActionUrl));
	//alert(JSON.stringify(data));
	if(data != null){
		if(data.status == '0'){
			_errorMessage = "Sorry. Server is down!.<br>Please use after the server has been normalized." ;	
		}
		else if(data.status == '200' && data.responseText.indexOf(loginActionUrl) != -1){
			_errorMessage = "Session is invalidated!" ;	
			refresh = true ;	
		}
		
	}else{
		_errorMessage = err500 ;
	}
	//attach message box division to body 
	attachMessageBox('Error');
	// Dialog			
	$('#dialogMessagebox').dialog({
		autoOpen: false,
		modal : true,
		width: 300,
		closeOnEscape : false, 
		buttons: {
			"Ok": function() {
				$('#dialogMessagebox').dialog("close"); 
				removeMessageBox();
				if(refresh){
					location.href = loginPageUrl ;
					//TODO :: reload event trigger		
				}
				if(__callFunction != null){
					setTimeout(__callFunction, 100);
				}
			}
	
		}
	});

	$('#dialogMessagebox').find("#message")
							.empty()
							.append(_errorMessage);
	$('#dialogMessagebox').dialog("open");
	$('#dialogMessagebox').prev().find("a").hide();
};

MessageBox.confirm = function (){
	__callFunction = null;
	__cancelFunction = null;
	
	var _errorMessage="";
	var args = arguments.length ;
	if(args==1){
		_errorMessage = arguments[0];	
	}else if(args==2){
		_errorMessage = arguments[0];	
		__callFunction = arguments[1];	
	}else if(args == 3){
		_errorMessage = arguments[0];	
		__callFunction = arguments[1];
		__cancelFunction = arguments[2];
	}
	
	
	var msgCode ;
	try{
		msgCode = eval(_errorMessage.replace(".", "_"));
		if(msgCode != null){
			_errorMessage = msgCode ;
		}
	}catch(exception){
		//alert(exception);
		msgCode= null ;
	}
		
	
	if(_errorMessage != ""){		
		//attach message box division to body 
		attachMessageBox('Confirm');
		// Dialog			
		$('#dialogMessagebox').dialog({
			autoOpen: false,
			modal : true,
			width: 300,
			closeOnEscape : false, 
			buttons: {
				"Confirm": function() {
					$('#dialogMessagebox').dialog("close"); 
					
					removeMessageBox();
					
					if(__callFunction != null){
						setTimeout(eval(__callFunction), 100);
					}
					
				} ,
		        "Cancel": function() {
		          $( this ).dialog( "close" );
		          removeMessageBox();
		          
			      	if(__cancelFunction != null){
						setTimeout(eval(__cancelFunction), 100);
					}
		          
		        }
		
			}
		});		
		$('#dialogMessagebox').find("#message")
								.empty()
								.append(_errorMessage);
		$('#dialogMessagebox').dialog("open");
		$('#dialogMessagebox').prev().find("a").hide();
	}
};

function attachMessageBox(msgTitle){
	var msgBox = "<div id='dialogMessagebox' title='"+msgTitle+"'><label id='message'></label></div>";
	$('body').append(msgBox);
}
function removeMessageBox(){
	$('body').find('#dialogMessagebox').remove();
}
