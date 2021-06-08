<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
    <body>
    <%--指定上传模式--%>
        <form action="importCars" method="post" enctype="multipart/form-data">
            <input type="file" name="excel">
            <button>上传</button>
        </form>
    </body>
</html>
