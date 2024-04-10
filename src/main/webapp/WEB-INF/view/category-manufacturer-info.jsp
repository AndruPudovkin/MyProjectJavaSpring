<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<body>
<h2>Category info</h2>
<br>


<%--@elvariable id="category" type=""--%>
<form:form action="saveManufacturerToy" modelAttribute="category">
    <form:hidden path="id"/>
    Название <form:input path="categoryName"/>
    <br><br>
    <input type="submit" value="OK">
</form:form>
</body>
</html>