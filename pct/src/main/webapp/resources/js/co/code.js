var CODE = {codeList : [], retCodeList : []}; 

//서버에서 조회해 온다.
CODE.sync = function(){ 
	var argSize = arguments.length ;
	if(argSize>0){
		CODE.codeList = [];
		for(var i=0 ; i<argSize; i++){
			//조회하고자 하는 코드가 메모리에 캐시되어 있는지 체크하여 있으면 쿼리대상에서 제외한다.
			var codeList = CODE.retCodeList[arguments[i]];
			if(typeof(codeList) == 'undefined' || codeList == null){
				CODE.codeList.push({"codeGroup":arguments[i]});
			}		
		}
	}
	//console.log('target code list = ' + JSON.stringify(CODE.codeList));
	if(CODE.codeList.length == 0){
		return ;
	}
	//console.log('Sending code group', CODE.codeList);
	$.ajax({
		type : "POST",  
		async: false,
		url: baseUrl + "/code/codeList",
		contentType: "application/json",
		data: JSON.stringify(CODE.codeList),
		dataType:"json",
		success : function(data) {
			for(var i=0; i<CODE.codeList.length ; i++){
				var codeGroupName = CODE.codeList[i].codeGroup;
				$.each(data, function(itemName,itemValue){
					if(codeGroupName == itemName){
						CODE.retCodeList[itemName] = itemValue ;
						return false ;
					}					
				});
			}
			//console.json('Final code group', CODE.retCodeList);
		},
		error:function(data){
			MessageBox.error("500 Err : Server Error");
		}
	});	
	
};

//조회된 데이타를 기준으로 코드명을 가져온다
CODE.name = function (codeGroup, code){
	var meaning = "" ;
	code = code + "";
	//console.json('CODE.name', CODE.retCodeList);
	if(CODE.retCodeList != null ){
		var codeList = CODE.retCodeList[codeGroup];
		if(typeof(codeList) != 'undefined' && codeList != null){
			for(var i=0; i < codeList.length; i++){
				if(code == codeList[i].code){
					meaning = codeList[i].meaning ;
					break ;
				}
			}
		}
	}
	return meaning; 
};

//조회된 데이타를 기준으로 json형태의 코드목록을 리턴한다.
CODE.list = function (codeGroup){
	//console.json('CODE.list', CODE.retCodeList);
	var codeList = [] ;
	if(CODE.retCodeList!= null ){
		codeList = eval("CODE.retCodeList."+codeGroup);
	}
	return codeList; 
};

//코드명으로 코드 가져오기
CODE.codeByName = function (codeGroup, codeName){
	var code = '';
	var codeList = [] ;
	if(CODE.retCodeList!= null ){
		codeList = eval("CODE.retCodeList."+codeGroup);
	}
	if(codeList.length >0){
		for(var i=0; i<codeList.length;i++){
			if(codeList[i]['meaning'] == codeName){
				code = codeList[i]['code'];
			}
		}
	}
	return code; 
};

//조회된 데이타를 기준으로 codeGroup으로 listbox 생성하여 리턴한다.
CODE.listbox = function (){
	var argSize = arguments.length ;
	var codeGroup = null;
	var code = null;
	if(argSize == 1){
		codeGroup = arguments[0];
	}else if(argSize == 2){
		codeGroup = arguments[0];
		code = arguments[1]; //디폴트 선택값 지정된 경우
	}
	var codeList = {} ;
	var retListBox = "" ;
	if(CODE.retCodeList != null ){
		codeList = eval("CODE.retCodeList."+codeGroup);
		for(var i=0; i < codeList.length; i++){
			var selected = "" ;
			if(code == codeList[i].code){
				selected = "selected" ;
			}
			retListBox += "<option value='"+codeList[i].code+"' "+selected+">"+codeList[i].meaning+"</option>" ; 
		}
	}
	 return retListBox ;
};

//조회하기 위해 push된 codeGroup 목록을 clear
CODE.clear = function(){
	CODE.codeList = [] ;
};

//코드명을 조회 하고자 하는 코드그룹 및 코드를 입력
CODE.push = function(){
	var argSize = arguments.length ;
	if(argSize>0){
		for(var i=0 ; i<argSize; i++){
			CODE.codeList.push({"codeGroup":arguments[i]});
		}
	}
};
//코드명을 조회 하고자 하는 코드그룹 및 코드의 JSON LIST를 입력
CODE.pushAll = function(codeJsonInfo){
	CODE.codeList = codeJsonInfo;
};