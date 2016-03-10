<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<c:import url="head.jsp"/>

<body>

<c:import url="menu-bar.jsp"/>

<div id="content">



    <h3>Add Book</h3>

    <form method="post" action="/addBook">

        <label>Title:</label>
        <input type="text" name="title"/> <br />

        <label>Author:</label>
        <input type="text" name="author"/> <br />

        <input type="submit" value="Add Book"/>
    </form>
</div>

</body>
</html>