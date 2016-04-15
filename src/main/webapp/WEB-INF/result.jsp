<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>youmeekssh测试首页</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta name="keywords" content=""/>
    <meta name="description" content=""/>
    <script type="text/javascript" src="WEB-INF/jquery-2.2.3.min.js"></script>
  <!--  <script type="text/javascript" src="index.js"></script>-->


    <style type="text/css">

    </style>

    <script type="text/javascript">

    </script>

</head>

<body>
<%--页头开始--%>
<%--页头结束--%>

<%--页面主体内容 start--%>
请求结果：${msg}<br>
<hr>
    用户ID：${info.id}<br>
    用户名：${info.name}
    用户名：${info.tel}
    <hr/>

<%--页面主体内容 end--%>

<%--页脚开始--%>
<%--页脚结束--%>
</body>
</html>
