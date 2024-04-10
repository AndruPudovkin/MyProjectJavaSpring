<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<body>
<h2>Справочник категорий игрушек</h2>
<br>
<table>
    <tr>
        <th>ID </th>
        <th>Наименование категории</th>
    </tr>
    <c:forEach var="сategory" items="${categorys}" >
        <c:url var="updateButton" value="/updateCategoryToy">
            <c:param name="categoryId" value="${сategory.id}"></c:param>
        </c:url>
        <c:url var="deleteBatton" value="/deleteCategoryToy">
            <c:param name="categoryId" value="${сategory.id}"></c:param>
        </c:url>
        <tr>
            <td><c:out value="${сategory.id}"/></td>
            <td><c:out value="${сategory.categoryName}"/></td>
            <td>
                <input type="button" value="Update" onclick="window.location.href='${updateButton}'">
                <input type="button" value="Delete" onclick="window.location.href='${deleteBatton}'">
            </td>

        </tr>
    </c:forEach>
    <input type="button" value="Add" onclick="window.location.href='addNewCategoryToy'"/>
    <input type="button" value="Назад" onclick="window.location.href='showAllBd'"/>

</table>
<br>