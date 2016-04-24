<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<c:import url="head.jsp"/>

<body>

<c:import url="menu-bar.jsp"/>

<div class="container">



    <h3>Add Books to Database</h3>

    <hr />

    <form method="post" action="/addBook" class="form-horizontal">

        <div class="form-group">
            <label class="col-sm-2 control-label">Title:</label>

            <div class="col-sm-8">
                <input type="text" name="title" class="form-control"/>
            </div>
        </div>

        <div class="form-group">
            <label class="col-sm-2 control-label">Author:</label>

            <div class="col-sm-8">
                <input type="text" name="author" class="form-control"/>
            </div>
        </div>

        <input type="submit" value="Add Book" class="btn btn-default"/>
    </form>
</div>

</body>
</html>