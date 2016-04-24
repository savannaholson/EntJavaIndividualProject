<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<c:import url="head.jsp"/>

<body>

<c:import url="menu-bar.jsp"/>

<div class="container">



    <h3>Add Book</h3><br />

    <form method="post" action="/addUserBook" class="form-horizontal">

        <div class="form-group">
            <label class="col-sm-2 control-label">Book Title: </label>
            <div class="col-sm-10">
                <span class="form-control"> ${bookTitle}</span>
            </div>
            <input type="hidden" value="${bookId}" name="id"/>
        </div>

        <div class="form-group">
            <label class="col-sm-2 control-label">Rating:</label>
            <div class="col-sm-10">
                <input type="text" name="rating" class="form-control"/>
            </div>
        </div>

        <div class="form-group">
            <label class="col-sm-2 control-label">Date read:</label>
            <div class="col-sm-10">
                <input type="text" name="date" class="form-control"/>
            </div>
        </div>

        <div class="form-group">
            <label class="col-sm-2 control-label">Comments:</label>
            <div class="col-sm-10">
                <textarea name="comments" class="form-control" rows="4"></textarea>
            </div>
        </div>

        <input type="submit" value="Add Book" class="btn btn-default"/>
    </form>
</div>

</body>
</html>