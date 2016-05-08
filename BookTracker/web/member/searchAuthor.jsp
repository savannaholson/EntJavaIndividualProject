<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

    <c:import url="head.jsp"/>

<body>

    <c:import url="menu-bar.jsp"/>

    <div class="container">
        <h3>Search for books by an author, powered by Goodreads.com</h3>

        <form class="form-horizontal" action="searchByAuthor" method="get">
            <input name="firstName" placeholder="Author first name"/>
            <input name="lastName" placeholder="Author last name"/>
            <input type="submit" class="btn btn-default" value="search"/>
        </form>

    </div>

</body>
</html>
