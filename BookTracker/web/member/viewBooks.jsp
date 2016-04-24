<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<c:import url="head.jsp"/>

<body>

<c:import url="menu-bar.jsp"/>

<div class="container">
    <h3>View Books</h3>

    <c:choose>
        <c:when test="${!empty books}">
            <table class="table table-responsive">

                <tr>
                    <th class="col-sm-2">Title</th>
                    <th class="col-sm-2">Author</th>
                    <th class="col-sm-1">Date Read</th>
                    <th class="col-sm-1">Rating</th>
                    <th class="col-sm-10">Comments</th>
                </tr>


                <c:forEach items="${books}" varStatus="loop">

                    <tr>
                        <td>${books[loop.index].title}</td>
                        <td>${books[loop.index].author}</td>
                        <td>${userBooks[loop.index].date}</td>
                        <td>${userBooks[loop.index].rating}</td>
                        <td>${userBooks[loop.index].comments}</td>
                    </tr>

                </c:forEach>
            </table>
        </c:when>

        <c:otherwise>
            <p>No books added yet!</p>
        </c:otherwise>
    </c:choose>

    <p>Add more books by searching them with the searchbar</p>


</div>

</body>
</html>