<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>

<!DOCTYPE html>
<html>
<body>
<h2>All Toys</h2>
<br>
<table>
    <tr>
        <th>Наименование  </th>
        <th>Цена  </th>
        <th>Количество  </th>
        <th>Пол  </th>
        <th>Материал  </th>
        <th>Категория  </th>
        <th>Возраст  </th>
        <th>Производитель  </th>
    </tr>
    <c:forEach var="toy" items="${allToyList}" >
        <c:url var="updateButton" value="/updateInfo">
            <c:param name="toyID" value="${toy.id}"></c:param>
        </c:url>
        <c:url var="deleteBatton" value="/deleteToy">
            <c:param name="toyID" value="${toy.id}"></c:param>
        </c:url>
        <tr>
            <td><c:out value="${toy.nameToy}"/></td>
            <td><c:out value="${toy.costToy}"/></td>
            <td><c:out value="${toy.quanityToy}"/></td>
            <td><c:out value="${toy.genderToy}"/></td>
            <td><c:out value="${toy.materialToy.categoryName}"/></td>
            <td><c:out value="${toy.categoryToy.categoryName}"/></td>
            <td><c:out value="${toy.categoryAgeToy.categoryName}"/></td>
            <td><c:out value="${toy.manufacturerToy.categoryName}"/></td>
            <td>
                <input type="button" value="Update" onclick="window.location.href='${updateButton}'">
                <input type="button" value="Delete" onclick="window.location.href='${deleteBatton}'">
            </td>

        </tr>
    </c:forEach>
</table>
<br>
<input type="button" value="Add" onclick="window.location.href='addNewToy'"/>
<input type="button" value="Справочник возростных категорий" onclick="window.location.href='showAllCategoryAge'"/>
<input type="button" value="Справочник категорий" onclick="window.location.href='showAllCategoryToy'"/>
<input type="button" value="Справочник производителей" onclick="window.location.href='showAllManufacturerToy'"/>
<input type="button" value="Справочник материалов" onclick="window.location.href='showAllMaterialToy'"/>
</body>
</html>
