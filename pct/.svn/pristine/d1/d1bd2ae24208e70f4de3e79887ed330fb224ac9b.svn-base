//배열과 배열 또는 배열 아닌것과 배열과 또는 배열아닌것과 배열 아닌것 
//주의 다만 형태가 같은 거만...같은 그리드에 대해서만 작업 수행할 필요 있음
var combineArrayData = function(orgJsonData, newJsonData){
	var newRetData = new Array();
	if(typeof(orgJsonData) == 'undefined' || orgJsonData == null || orgJsonData == ''){
		
		if(newJsonData != "" && newJsonData != null && typeof(newJsonData.length) != "undefined"){ // json 데이타가 배열 일때
			for(var i=0 ; i < newJsonData.length ; i++){
				newRetData.push(newJsonData[i]);//추가한다
			}
		}else{
			newRetData.push(newJsonData);
		}
	}else{
		
		if(orgJsonData != "" && orgJsonData != null && typeof(orgJsonData.length) != "undefined"){ // json 데이타가 배열 일때
			newRetData = orgJsonData ; 
			for(var i=0 ; i < newJsonData.length ; i++){
				newRetData.push(newJsonData[i]);//추가한다
			}
		}else{
			newRetData.push(orgJsonData);
		}
		
	}
	//alert('body data after set '+JSON.stringify(newRetData));
	return newRetData;
};
(function($){
	
	function isLocalDatatype(target){
		var datatype = $(target).getGridParam('datatype');
		var rowNum = $(target).getGridParam('rowNum');
		if(datatype != 'local' && rowNum != '-1'){
			//alert('JQGrid\'s datatype param value is not local [datatype is '+datatype+']!! \nThis function is available when datatype is local.');
			//return false;
			return true ;
		}
		return true;
	}
	
	
	//body에 데이타 임시 저장용..
	//사용하지 말것.. 잘 안됨... $('body').data(gName) ==> 요게 잘 안됨. 되다 안되다 함..
	$.fn.setArrayData = function(gName, jsonData){
		var tData = $('body').data(gName); 
		//alert('current body data '+ gName+'=='+ JSON.stringify(tData));
		if(typeof(tData) == 'undefined' || tData == null || tData == ''){
			var aData = new Array();
			if(jsonData != "" && jsonData != null && typeof(jsonData.length) != "undefined"){ // json 데이타가 배열 일때
				for(var i=0 ; i < jsonData.length ; i++){
					aData.push(jsonData[i]);//추가한다
				}
			}else{
				aData.push(jsonData);
			}
			$('body').data(gName, aData);
		}else{
			if(jsonData != "" && jsonData != null && typeof(jsonData.length) != "undefined"){ // json 데이타가 배열 일때
				for(var i=0 ; i < jsonData.length ; i++){
					tData.push(jsonData[i]);//추가한다
				}
			}else{
				tData.push(jsonData);//추가한다
			}
			$('body').data(gName, tData);
		}
		//alert('body data after set '+JSON.stringify($('body').data(gName)));
	};
	//기본적으로 그리드 상위영역의 width로 설정한다.  
	$.fn.resizeGridWidth = function(gridWidth){
		var args = arguments.length ;
		var parentOfGrid = $(this).parent().parent().parent().parent().parent();
		var width = parentOfGrid.width();
		
		//alert('width='+width + ', '+ parentOfGrid.html()); 
		var shrinkToFit = $(this).getGridParam('shrinkToFit');
		if(gridWidth != null){
			//alert('width='+width +', gridWidth='+gridWidth);
			width = gridWidth ;
			shrinkToFit = false ;
		}
		if(width != null){
			$(this).jqGrid('setGridWidth', width, shrinkToFit); //shrinkToFit flag
		}
		return $(this);
	};
	
	//선택된 그리드 row 반환 : return : [{name : value}...] or {name : value}
	$.fn.selGridData = function(){
		var args = arguments.length ;
		var addKeyId = true;
		if(args==1){
			addKeyId = arguments[0];	
		}
		var retJson = null ;
		var selectedRowArray = null;
		var multiselect = $(this).jqGrid('getGridParam','multiselect');
		if(multiselect == true){
			retJson = new Array();
			selectedRowArray = $(this).jqGrid('getGridParam','selarrrow');
			for ( var i = 0; i < selectedRowArray.length; i++) {
				var data = $(this).getRowData(selectedRowArray[i]) ;
				if(addKeyId == true || addKeyId == 'true'){
					data.keyId= selectedRowArray[i];
				}else{
					delete data['keyId'] ;
				}
				retJson.push(data);
			}
			if(retJson.length == 0){
				retJson = null;
			}
		}else{
			selectedRowArray = $(this).jqGrid('getGridParam','selrow');
			var selectedRows = selectedRowArray;
			var data = $(this).getRowData(selectedRows) ;
			if(selectedRowArray != null){
				data.keyId = selectedRows;
				if(addKeyId == true || addKeyId == 'true'){
					data.keyId= selectedRows;
				}else{
					delete data['keyId'] ;
				}
			}else{
				data = null;
			}
			retJson = data ;
		}
		
		return retJson;
	};
	
		
	//그리드의 모든 row 반환 : return : [{name : value}...]
	$.fn.allGridData = function(){
		var args = arguments.length ;
		var addKeyId = true;
		if(args==1){
			addKeyId = arguments[0];	
		}
		var retJson = new Array();
		var allRowArray = $(this).jqGrid('getDataIDs') ;
		for ( var i = 0; i < allRowArray.length; i++) {
			var data = $(this).getRowData(allRowArray[i]) ;
			
			if(addKeyId == true || addKeyId == 'true'){
				data.keyId= allRowArray[i];
			}else{
				delete data['keyId'] ;
			}
			retJson.push(data);
		}
		if(retJson.length == 0){
			retJson = null;
		}
		return retJson;
	};
	
	//그리드에 있는 마지막 rowid 구하기 
	function gf_getMaxIndex(jqGridName){
		var gridListIds = $(jqGridName).jqGrid('getDataIDs') ;
		if(gridListIds == "" || gridListIds == null || gridListIds.length ==0) {
			return 0;
		}
		else {
			return gridListIds.maxGridIndex(); 
		}
	}
	//그리드에 row 추가 : input data type = [{name : value},{name : value}] or {name : value} 
	$.fn.addGridData = function (jsonData){
		var jqGridName = $(this);
		var lastKeyId ;
		if(!isLocalDatatype($(this))){
			return ;
		}
		if(jsonData != "" && jsonData != null && typeof(jsonData.length) != "undefined"){ // json 데이타가 배열 일때
			var rowid = parseInt(gf_getMaxIndex(jqGridName));
			for(var i=0 ; i < jsonData.length ; i++){
				lastKeyId = ++rowid ;
				$(jqGridName).jqGrid('addRowData', lastKeyId, jsonData[i], 'first'); 
			}
		}else if(jsonData != "" && jsonData != null){ //json 데이타가 배열이 아닐때
			var rowid = parseInt(gf_getMaxIndex(jqGridName));		
			lastKeyId = ++rowid ;
			$(jqGridName).jqGrid('addRowData', lastKeyId, jsonData, 'first');
		}
		$(jqGridName).jqGrid('setSelection', lastKeyId, true);
		console.log('new rowid=' + lastKeyId);
		//$(jqGridName).trigger("reloadGrid"); 
		return $(this);
	};
	
	$.fn.compareGridData = function(){
		var argLen = arguments.length ;
		var compareColumnId, compareColumnId2, jsonData ;
		if(argLen == 2){
			compareColumnId = arguments[0];//현재 그리드의 id
			compareColumnId2 = arguments[0];//json쪽의 id
			jsonData = arguments[1];
		}else if(argLen == 3){
			compareColumnId = arguments[0];//현재 그리드의 id
			compareColumnId2 = arguments[1];//json쪽의 id
			jsonData = arguments[2];
		}
		
		var jqGridName = $(this);
		if(jsonData != "" && jsonData != null && typeof(jsonData.length) != "undefined"){ // json 데이타가 배열 일때
			for(var i=0 ; i < jsonData.length ; i++){
				var allRowArray = $(this).jqGrid('getDataIDs') ;
				for ( var k = 0; k < allRowArray.length; k++) {
					var data = $(this).getRowData(allRowArray[k]) ;
					if(data[compareColumnId] && data[compareColumnId] == jsonData[i][compareColumnId2]){
						alert('Aleady exist data!');
						return true ;
					}
				}
			}
		}else if(jsonData != "" && jsonData != null){ //json 데이타가 배열이 아닐때
			var allRowArray = $(this).jqGrid('getDataIDs') ;
			for ( var i = 0; i < allRowArray.length; i++) {
				var data = $(this).getRowData(allRowArray[i]) ;
				if(data[compareColumnId] && data[compareColumnId] == jsonData[compareColumnId2]){
					alert('Aleady exist data!');
					return true ;
				}
			}
		}
		return false ;
	};
	//gridData update
	$.fn.updateGridData = function(){
		
		var args = arguments.length ;
		var rowid, jsonData ;
		if(args==1){
			jsonData = arguments[0];
			if(typeof(jsonData.keyId) == 'undefined'){
				alert('KeyId not found in json!');
				return ;
			}
			rowid = jsonData.keyId ;
			
		}else if(args==2){
			rowid = arguments[0];	
			jsonData = arguments[1];	
		}
		$(this).jqGrid('setRowData', rowid, jsonData); 
		return $(this);
	};
	
	//gridDataList delete 하기
	$.fn.deleteGridData = function(){
		if(!isLocalDatatype($(this))){
			return ;
		}
		var args = arguments.length ;
		if(args==1){//rowid 있는 경우
			var rowid = arguments[0];	
			$(this).jqGrid('delRowData', rowid);
		}else{//rowid 없는 경우
			
			var delRowId = [];
			var multiselect = $(this).jqGrid('getGridParam','multiselect');
			if(multiselect == true){
				var selIds = $(this).getGridParam("selarrrow");
				
				if (selIds != '' && selIds != null){
					for(var k=0; k < selIds.length; k++){
						delRowId.push(selIds[k]);
					}
				}
			}else{
				var selIds = $(this).getGridParam("selrow");
				delRowId.push(selIds);
			}
			if (delRowId.length>0){
				for(var k=0; k < delRowId.length; k++){
					$(this).jqGrid('delRowData', delRowId[k]);
				}
			}
		}
		
		//$(this).trigger("reloadGrid");
		return $(this);
	};
	
	$.fn.saveAllGridRow = function(){
		var selIds = $(this).jqGrid('getDataIDs') ;
		if (selIds != '' && selIds != null){
			for(var k=0; k < selIds.length; k++){
				try{$(this).saveRow(selIds[k]);}catch(e){};
			}
		}
		return $(this);
	};
			
	//그리드 클리어 
	$.fn.clearGrid = function(){
		$(this).jqGrid("clearGridData", true);
		return $(this);
	};
	
	//그리드 Reload 
	$.fn.reloadGrid = function(){
		$(this).trigger("reloadGrid",[{page:1}]);
		return $(this);
	};
	//그리드의 속성에 해당하는 값이 있는 rowid 리턴
	$.fn.getRowIdByColumnInfo = function(columnName, columnValue){
		var selIds = $(this).jqGrid('getDataIDs') ;
		var retRowId = ''; 
		if (selIds != '' && selIds != null){
			for(var k=0; k < selIds.length; k++){
				var gridJsonData = $(this).jqGrid('getRowData', selIds[k]);
				$.each(gridJsonData, function(itemName, itemValue){
					if(itemName == columnName && itemValue == columnValue){
						retRowId = selIds[k];
						return false ;
					}
				});
				if(retRowId != ''){
					break ;
				}
			}
		}
		return retRowId; 
	};
	
	// 그리드의 속성에 해당하는 값이 있는 데이타 리턴 (columnName, columnValue, [true|false])
	$.fn.getGridDataByColumnInfo= function(){
		var columnName = null;
		var columnValue = null;
		var addKeyId = true;
		var args = arguments.length ;
		if(args==2){
			columnName = arguments[0];	
			columnValue = arguments[1];	
		}else if(args==3){
			columnName = arguments[0];	
			columnValue = arguments[1];		
			addKeyId = arguments[2];	
		} 
		
		var selIds = $(this).jqGrid('getDataIDs') ;
		var retRowData= null; 
		if (selIds != '' && selIds != null){
			for(var k=0; k < selIds.length; k++){
				var gridJsonData = $(this).jqGrid('getRowData', selIds[k]);
				$.each(gridJsonData, function(itemName, itemValue){
					if(itemName == columnName && itemValue == columnValue){
						if(addKeyId == true){
							gridJsonData.keyId= selIds[i];						 
						}
						retRowData = gridJsonData;
						return false ;
					}
				});
				if(retRowData != ''){
					break ;
				}
			}
		}
		return retRowData; 
	};
	
	$.fn.changeGridAttr = function(rowId, jqgridOption){
		if(jqgridOption != null){
			var colModels = $(this).jqGrid('getGridParam', 'colModel');
	        for (var celModel in colModels) { 
	        	var cellInfo = colModels[celModel] ;
	        	var cellName = cellInfo['name'];
	        	if(typeof(cellName) =='string' && cellName !=''){
	        		gf_console.log('cellName=' + rowId + ', '+cellName);
	        		$(this).jqGrid('setCell', rowId, cellName, '', jqgridOption);
	        	}
	        }
		}
		return $(this);
	};
	
	//그리드의 rowid에 해당하는 데이타 리턴
	$.fn.getGridDataByRowId= function(rowid){
		return $(this).jqGrid('getRowData', rowid);
	};
})(jQuery);	

Array.prototype.maxGridIndex = function() {
	return Math.max.apply(null, this);
};

Array.prototype.minGridIndex = function() {
  	return Math.min.apply(null, this);
};

var formatters = {
	"color": function(inValue) {
		if(inValue == "running " ) { // "running " 문자열 뒤에 공백 지우지 말것!!
			return "<div style='border-radius:25px; background: #99ff00; color: white; font-weight: bold; text-align:center;'>"+inValue+"</div>";
		} 
		else if(inValue == "initializing ") { // 문자열 뒤에 공백 지우지 말것!!
			return "<div style='border-radius:25px; background: yellow; color: white; font-weight: bold; text-align:center;'>"+inValue+"</div>";
		} 
		else {
			return "<div style='border-radius:25px; background: red; color: white; font-weight: bold; text-align:center;'>"+inValue+"</div>";
		}
	},
	"processColor": function(inValue) {
		
		if(!inValue) {
			return "";  // invalid values
		}
		
		if(inValue == "1" ) { 			// "running " 문자열 뒤에 공백 지우지 말것!!
			return "<div style='border-radius:25px; background: #99ff00; color: white; font-weight: bold; text-align:center;'>Running</div>";
		} else if(inValue == "0") { 	// stoped
			return "<div style='border-radius:25px; background: red; color: white; font-weight: bold; text-align:center;'>Stopped</div>";
		} else if(inValue == "9") {		// unknown
			return "<div style='border-radius:25px; background: yellow; color: blue; font-weight: bold; text-align:center;'>Unkown</div>";
		}
	},
	"bigNumber" : function(inValue) {
		var reverse = (""+inValue).split("").reverse(), fixed = [];
	    for(var i = 0, l = reverse.length; i < l; i++){
	    	if(i%3 == 0) fixed.push(",");
	    	fixed.push(reverse[i]);
	    }
		fixed.shift();
	    return fixed.reverse().join("");
	},
	"errColor": function(inValue) {		
		if(inValue > 0 ){
			this.customStyles.push("background: #99ff00; color: red; font-weight: bold; text-align: left ");
		}
		return inValue;
	 },
	"percent" : function(inValue) {
		return inValue + " %";
	},
	"colorAndPercent" : function(inValue) {
		if(inValue > 75){
			this.customStyles.push("color: red; font-weight: bold; text-align: left ");
		}
		return inValue + " %";
	},
	"userLevel" : function(inValue) {
		console.log("in userLevel formatter", inValue);
		if(!inValue || 0 === inValue.length)
		return "Wrong-value";
		
		if(inValue == "1" || inValue == "ADMIN") {
			return "ADMIN";
		} else if(inValue == "2" || inValue == "MEMBER") {
			return "MEMBER";
		} else {
			return "Wrong-value";
		}
	},
	"dateString" : function(inValue) {
		//db 컬럼이 스트링형인 날짜의 포맷팅 : 20141212 --> Date형 2014-12-12 변형
		if(inValue == null || inValue == "" || inValue == undefined) {
			return "";
		}
		/*var year        = inValue.substring(0,4);
		var month       = inValue.substring(4,6);
		var day         = inValue.substring(6,8);			

		return year +"-"+month+"-"+day +"00:00:00";*/
		if(inValue.length == 8){
			return inValue.replace(/^(\d{4})(\d\d)(\d\d)$/,'$1-$2-$3'); 
		}else{
			return inValue.replace(/^(\d{4})(\d\d)(\d\d)(\d\d)(\d\d)(\d\d)$/,'$1-$2-$3 $4:$5:$6'); 
		}
		
	},
	"dateTimeString" : function(inValue){
		//db 컬럼이 스트링형인 날짜의 포맷팅 : 20141212101010 --> Date형 2014-12-12 10:10:10 변형
		if(inValue == null || inValue == "" || inValue == undefined) {
			return "";
		}
		//return inValue.replace(/^(\d{4})(\d\d)(\d\d)(\d\d)(\d\d)(\d\d)$/,'$1-$2-$3 $4:$5:$6');
		return inValue.replace(/^(\d{4})(\d\d)(\d\d)(\d\d)(\d\d)(\d\d)$/,'$1-$2-$3 $4:$5');
	},
	"date" : function(inValue) {
		//db 컬럼이 Date형인 날짜의 포맷팅 - 문자열 : YYYY/MM/DD 형태 리턴
		if(inValue == null || inValue == "" || inValue == undefined) {
			return "";
		}
		var pattern = "-" ;
		var _date  = new Date(inValue);
		var _year  = _date.getFullYear();
		var _month = "" + (_date.getMonth() + 1);
		var _day   = "" + _date.getDate();
		
		if( _month.length == 1 ) _month = "0" + _month;
		if( ( _day.length ) == 1 ) _day = "0" + _day;
		
		var retDate = "" + _year + pattern + _month + pattern + _day;	

		return retDate;
	},
	"dateTime" : function(inValue){
		//db 컬럼이 Date형인 날짜의 포맷팅 - 문자열 : YYYY/MM/DD  HH24:MI:SS 형태 리턴
		if(inValue == null || inValue == "" || inValue == undefined) {
			return "";
		}
		var pattern = "-" ;
		var _date  = new Date(inValue);
		var _year  = _date.getFullYear();
		var _month = "" + (_date.getMonth() + 1);
		var _day   = "" + _date.getDate();
		var _hour  = "" + _date.getHours();
		//var _hour  = "" + _date.getUTCHours(); // 2013-08-01 16:10:44.997Z 이런 포맷일때는 현지 시각을 반영하지 못해서 변경함. 
		var _min  = "" + _date.getMinutes();
		var _sec  = "" + _date.getSeconds();
		
		if( _month.length == 1 ) _month = "0" + _month;
		if( ( _day.length ) == 1 ) _day = "0" + _day;
		if( ( _hour.length ) == 1 ) _hour = "0" + _hour;
		if( ( _min.length ) == 1 ) _min = "0" + _min;
		if( ( _sec.length ) == 1 ) _sec = "0" + _sec;
		
		//var retDate = "" + _year + pattern + _month + pattern + _day +" "+_hour+":"+_min+":"+_sec;
		var retDate = "" + _year + pattern + _month + pattern + _day +" "+_hour+":"+_min;
		return retDate ;
	},
	"time" : function(inValue) {
		//db 컬럼이 Date형인 날짜의 포맷팅  - 문자열 : HH24:MI 형태 리턴
		if(inValue == null || inValue == "" || inValue == undefined) {
			return "";
		}
		var pattern = "-" ;
		var _date  = new Date(inValue);
		var _year  = _date.getFullYear();
		var _month = "" + (_date.getMonth() + 1);
		var _day   = "" + _date.getDate();
		var _hour  = "" + _date.getHours();
		//var _hour  = "" + _date.getUTCHours(); // 2013-08-01 16:10:44.997Z 이런 포맷일때는 현지 시각을 반영하지 못해서 변경함. 
		var _min  = "" + _date.getMinutes();
		var _sec  = "" + _date.getSeconds();
		
		if( _month.length == 1 ) _month = "0" + _month;
		if( ( _day.length ) == 1 ) _day = "0" + _day;
		if( ( _hour.length ) == 1 ) _hour = "0" + _hour;
		if( ( _min.length ) == 1 ) _min = "0" + _min;
		if( ( _sec.length ) == 1 ) _sec = "0" + _sec;
		
		var retDate = _hour+":"+_min;
		return retDate ;
	},
	"timeSecond" : function(inValue) {
		//db 컬럼이 Date형인 날짜의 포맷팅  - 문자열 : HH24:MI:SS 형태 리턴
		if(inValue == null || inValue == "" || inValue == undefined) {
			return "";
		}
		var pattern = "-" ;
		var _date  = new Date(inValue);
		var _year  = _date.getFullYear();
		var _month = "" + (_date.getMonth() + 1);
		var _day   = "" + _date.getDate();
		var _hour  = "" + _date.getHours();
		//var _hour  = "" + _date.getUTCHours(); // 2013-08-01 16:10:44.997Z 이런 포맷일때는 현지 시각을 반영하지 못해서 변경함. 
		var _min  = "" + _date.getMinutes();
		var _sec  = "" + _date.getSeconds();
		
		if( _month.length == 1 ) _month = "0" + _month;
		if( ( _day.length ) == 1 ) _day = "0" + _day;
		if( ( _hour.length ) == 1 ) _hour = "0" + _hour;
		if( ( _min.length ) == 1 ) _min = "0" + _min;
		if( ( _sec.length ) == 1 ) _sec = "0" + _sec;
		
		var retDate = _hour+":"+_min+":"+_sec;
		return retDate ;
	},
	"removePattern" : function(inValue) {
		// - or / or . or :
		return inValue.replace(/\-/g, '').replace(/\./g, '').replace(/\//g, '').replace(/\:/g, '');
	}
};
