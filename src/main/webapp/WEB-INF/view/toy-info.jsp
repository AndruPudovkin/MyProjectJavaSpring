<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<body>
<h2>Toy info</h2>
<br>

<%--@elvariable id="toy" type="com"--%>
<%--@elvariable id="toy" type="com"--%>

<form:form action="saveToy" modelAttribute="toy">
    <form:hidden path="id"/>
    Наименование <form:input path="nameToy"/>
    <br><br>
    Цена <form:input path="costToy"/>
    <br><br>
    Количество <form:input path="quanityToy"/>
    <br><br>
    Пол <form:input path="genderToy"/>
    <br><br>
    Материал <form:select path="materialToy.categoryName">
    <from:options items="${mapMaterial}"/>
</form:select>
    <br><br>
    Категория <form:select path="categoryToy.categoryName">
    <form:options items="${mapCategory}"/>
</form:select>
    <br><br>
    Возраст <form:select path="categoryAgeToy">
    <form:options items = "${mapAge}"/>
</form:select>
<%--    Возраст <form:input path="categoryAgeToy.categoryName"/>--%>
    <br><br>
    Производитель <form:select path="manufacturerToy.categoryName">
    <form:options items="${mapManufacturer}"/>
</form:select>
    <br><br>
    <input type="submit" value="OK">
</form:form>
</body>
</html>