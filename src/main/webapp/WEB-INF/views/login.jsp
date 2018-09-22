<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title></title>
        <link type="text/css" rel="stylesheet" media="all" href="../css/global.css" />
        <link type="text/css" rel="stylesheet" media="all" href="../css/global_color.css" />
        <script src="../js/jquery.min.js"></script>
    	<script type="text/javascript">
			function login(){
				$('#form1').submit();
			}
    	</script>
    </head>
    <body class="index">
        <div class="login_box">
        	<form id="form1" action="../login.do" method="post">
            <table>
                <tr>
                    <td class="login_info">账号：</td>
                    <td colspan="2"><input name="aaccount" type="text" class="width150" /></td>
                    <td class="login_error_info" style="display: none;"><span class="required">30长度的字母、数字和下划线</span></td>
                </tr>
                <tr>
                    <td class="login_info">密码：</td>
                    <td colspan="2"><input name="apsw" type="password" class="width150" /></td>
                    <td><span class="required" style="display: none;">30长度的字母、数字和下划线</span></td>
                </tr>
                <tr>
                    <td class="login_info">验证码：</td>
                    <td class="width70"><input name="" type="text" class="width70" value="${admin.aname }"/></td>
                    <td><img src="../images/valicode.jpg" alt="验证码" title="点击更换" /></td>  
                    <td><span class="required" style="display: none;">验证码错误</span></td>              
                </tr>            
                <tr>
                    <td></td>
                    <td class="login_button" colspan="2">
                        <a href="javascript:login()"><img src="../images/login_btn.png" /></a>
                    </td>    
                    <td><span class="required" style="display: none;">用户名或密码错误，请重试</span></td>                
                </tr>
            </table>
            </form>
        </div>
        
    </body>
</html>

