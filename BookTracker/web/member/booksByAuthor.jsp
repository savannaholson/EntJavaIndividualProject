<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<c:import url="head.jsp"/>

<body>

<c:import url="menu-bar.jsp"/>

<div class="container">

<c:choose>
    <c:when test="${!empty books}">
        <table class="table table-responsive">

            <tr>
                <th>Title</th>
                <th>Number of Pages</th>
            </tr>


            <c:forEach var="book" items="${books.book}">

                <tr>
                    <td><a href="${book.link}">${book.title}</a></td>
                    <td>${book.numPages}</td>
                </tr>

            </c:forEach>
        </table>
    </c:when>
    <c:otherwise>
        <p>No results found!</p>
    </c:otherwise>
</c:choose>

</div>

<c:remove var="books" scope="session" />

</body>
</html>
