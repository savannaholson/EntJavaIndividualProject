<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<c:import url="head.jsp"/>

<body>

<c:import url="menu-bar.jsp"/>

<div id="content">



    <h3>Add Book</h3>

    <form method="post" action="/addUserBook">

        <label>Book Title: ${bookTitle}</label>
        <input type="hidden" value="${bookId}" name="id"/>
        <br />

        <label>Rating:</label>
        <input type="text" name="rating"/><br />

        <label>Date read:</label>
        <input type="text" name="date"/><br />

        <label>Comments</label>
        <textarea name="comments"></textarea><br />

        <input type="submit" value="Add Book"/>
    </form>
</div>

</body>
</html>