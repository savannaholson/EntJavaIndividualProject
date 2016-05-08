<nav class="navbar navbar-default">
    <div class="container-fluid">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
        </button>
        <div class="navbar-header">
            <a class="navbar-brand" href="memberHome.jsp">Book Tracker</a>
        </div>
        <div class="collapse navbar-collapse" id="myNavbar">
            <ul class="nav navbar-nav navbar-right">
                <li><a href="viewBooks">My Books</a></li>
                <li><a href="searchAuthor.jsp">Search goodreads</a></li>
            </ul>


            <form class="navbar-form navbar-left" role="search" action="search" method="get">
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="Search Books" name="searchTerm"/>
                </div>
                <button type="submit" class="btn btn-default" value="Search"><span class="glyphicon glyphicon-search"></span></button>
            </form>
        </div>
    </div>
</nav>