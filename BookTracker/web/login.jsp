<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link href="../bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

    <!--Above is all bootstrap-->

    <link href="../style.css" rel="stylesheet">

    <title>Book Tracker</title>
</head>

<body>

<div class="container">

    <br /><br />
    <FORM ACTION="j_security_check" METHOD="POST" class="form-horizontal">
        <TABLE class="form-group">
            <TR><TD class="control-label">User name: <INPUT TYPE="TEXT" NAME="j_username" class="text-field">
            <TR><TD>Password: <INPUT TYPE="PASSWORD" NAME="j_password" class="text-field">
            <TR><TH><INPUT TYPE="SUBMIT" VALUE="Log In" class="btn btn-default">
        </TABLE>
    </FORM>
</div>

</body>
</html>