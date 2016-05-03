<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<c:import url="head.jsp"/>

<body>

<div class="container">

<c:choose>
    <c:when test="${!empty books}">
        <table class="table table-responsive">

            <tr>
                <th class="col-sm-2">Title</th>
            </tr>


            <c:forEach var="book" items="${books}">

                <tr>
                    <td><a href="/searchResultBook?id=${book.bookId}">${book.title}</a></td>
                    <td>${book.author}</td>
                </tr>

            </c:forEach>
        </table>
    </c:when>
    <c:otherwise>
        <p>No results found!</p>
    </c:otherwise>
</c:choose>

</div>

</body>
</html>
