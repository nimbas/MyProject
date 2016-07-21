/* 공통 스크립트 include  */
var baseUrl = getContextPath() ;
var baseScriptUrl = baseUrl + '/resources/js';
var bootstrapScriptUrl = baseUrl + '/resources/bootstrap/js';
var baseImageUrl = baseUrl + '/resources/image';
var bootstrapImageUrl = baseUrl + '/resources/bootstrap/img';
var loginActionUrl = 'j_spring_security_check';
var loginPageUrl = baseUrl + '/login';

/**
 * context path 얻기
 * */ 
function getContextPath(){
    var offset=location.href.indexOf(location.host)+location.host.length;
    var ctxPath=location.href.substring(offset,location.href.indexOf('/',offset+1));
    return ctxPath;
}
 
var gf_cmn_session_out = "Session is out!";
var gf_msg_loading = "Loading..." ;
var gf_msg_searching = "Searching..." ;
var gf_msg_processing = "Processing..." ;
