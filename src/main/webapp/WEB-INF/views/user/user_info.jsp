<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="org.lanqiao.dxzf.entity.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title></title>
       	<%@include file="../include/link.jsp" %>
       	<script src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
       	<script>
       	
       	function showResult(){
       		$.ajax({
       			type:'post', 
       			url:'${pageContext.request.contextPath}/updateInfo.do',
       			data: {aname:$('#aname').val(),atel:$('#atel').val(),aemail:$('#aemail').val()},
       			success:function(result){
       				alert(result);
       			}
       		});
       	  }

       		
       	</script>
        <script language="javascript" type="text/javascript">
           
        </script>
        
    </head>
    <body>
        <!--Logo区域开始-->
		<%@include file="../include/header.jsp"%>
        <!--导航区域结束-->
        <!--主要区域开始-->
        <div id="main">            
            <!--保存操作后的提示信息：成功或者失败-->
            <div id="save_result_info" class="save_success">保存成功！</div><!--保存失败，数据并发错误！-->
            <form action="" method="" class="main_form">
                <div class="text_info clearfix"><span>管理员账号：</span></div>
                <div class="input_info"><input type="text" readonly="readonly" class="readonly" value="${sessionScope.admin.aaccount}" /></div>
                <div class="text_info clearfix"><span>角色：</span></div>
                <div class="input_info">
                    <input type="text" readonly="readonly" class="readonly width400" value="${admin.roles}" />
                </div>
                <div class="text_info clearfix"><span>姓名：</span></div>
                <div class="input_info">
                    <input type="text" name="aname" id="aname" value="${sessionScope.admin.aname}" />
                    <span class="required">*</span>
                    <div class="validate_msg_long error_msg" style="display: none;">20长度以内的汉字、字母的组合</div>
                </div>
                <div class="text_info clearfix"><span>电话：</span></div>
                <div class="input_info">
                    <input type="text" name="atel" id="atel" class="width200" value="${sessionScope.admin.atel}" />
                    <div class="validate_msg_medium">电话号码格式：手机或固话</div>
                </div>
                <div class="text_info clearfix"><span>Email：</span></div>
                <div class="input_info">
                    <input type="text" name="aemail" id="aemail" class="width200" value="${sessionScope.admin.aemail}" />
                    <div class="validate_msg_medium">50长度以内，符合 email 格式</div>
                </div>
                <div class="text_info clearfix"><span>创建时间：</span></div>
                <div class="input_info"><input type="text" readonly="readonly" class="readonly" value="${sessionScope.admin.acreate}"/></div>
                <div class="button_info clearfix">
                    <input type="button" value="保存" class="btn_save" onclick="showResult();" />
                    <input type="button" value="取消" class="btn_save" />
                </div>
                <div style="display: none"><input name="aid" value="${sessionScope.admin.aid}"/></div>
            </form>  
        </div>
        <!--主要区域结束-->
        <div id="footer">
          
        </div>
    </body>
</html>
