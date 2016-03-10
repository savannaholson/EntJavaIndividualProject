<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<c:import url="head.jsp"/>

<body>

<c:import url="menu-bar.jsp"/>

<div id="content">
    <form method="post" action="/signup">

        <label>Username:</label>
        <input type="text" name="username"/> <br />

        <label>Password:</label>
        <input type="password" name="password"/> <br />

        <input type="submit" value="Create Account"/>

    </form>
</div>

</body>
</html>