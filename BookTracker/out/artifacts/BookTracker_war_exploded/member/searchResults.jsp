<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<c:import url="head.jsp"/>

<body>

<c:import url="menu-bar.jsp"/>

<div id="content">
    <h2>Search Results</h2>

    <c:choose>
        <c:when test="${empty books}">
            <table>

                <tr>
                    <td>Title</td>
                    <td>Author</td>
                </tr>


                <c:forEach var="book" items="${books}">

                    <tr>
                        <td>${book.title}</td>
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