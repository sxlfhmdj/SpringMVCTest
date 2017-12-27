<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Demo</title>
    <script src="${ctx}/static/third/jquery.js"></script>
</head>

<body>
    <p>Hello the world!</p>
    <button onclick="javascript: getDics();">获取字典</button>
    <script type="text/javascript">
        var ctx = "${ctx}";
        function getDics() {
            $.ajax({
                url: ctx + "/general/getDics",
                type: 'GET',
                success: function (data) {
                    if(data.code == 200){
                        console.log(data.data);
                    }else {
                        alert(data.msg);
                    }
                }
            });
        }
    </script>

</body>
</html>