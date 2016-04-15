<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>

    <title>youmeekssh测试首页</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="keywords" content="" />
    <meta name="description" content="" />
    <script type="text/javascript" src="js/jquery-2.2.3.min.js"></script>

    <style type="text/css">

    </style>

    <script type="text/javascript">
        $(document).ready(function () {
           //alert("ss");
            /*查询用户 start*/
            $("#btnSubmit").click(function () {
                var userIdValue = $('#userId').val();
                if (userIdValue == '') {
                    alert("用户ID不能为空");
                    return;
                }
                window.open("/demo/front/infoController/getInfo.do?name1=" + userIdValue, "_blank");
            });
            /*查询用户 end*/

        })

    </script>

</head>

<body>
<%--页头开始--%>
<%--页头结束--%>

<%--页面主体内容 start--%>

<hr>
<p>
<form id="form1" name="form1" action="/demo/front/infoController/saveInfo.do" method="post">
    新增用户：
    <input type="text" id="name" name="name1" value="" />
    <input type="text" id="name1" name="tel" value="" />
    <input type="submit" value="提交" />
</form>
</p>
<hr>
<p>

<form id="form1" name="form1" action="/demo/front/infoController/getInfo.do" method="post">
    查询的用户ID：
    <input type="text" id="userId" name="name1" value="" />
    <input id="btnSubmit" name="btnSubmit" type="button" value="查询" />

</form>
</p>
<%--页面主体内容 end--%>

<%--页脚开始--%>
<%--页脚结束--%>
</body>
</html>

