<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<c:import url="head.jsp"/>

<body>

<c:import url="menu-bar.jsp"/>

<div id="content">
    <form>
        <label>Username:</label>
        <input name="username"/> <br />

        <label>Password:</label>
        <input name="password" type="password"/> <br />

        <input name="submit" type="submit"/>
    </form>
</div>

</body>
</html>