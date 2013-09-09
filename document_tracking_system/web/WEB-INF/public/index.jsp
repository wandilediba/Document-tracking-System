<jsp:include page="header/include.jsp" />

<body>
    <h1 class="header">Welcome To Doc tracking</h1>
    <h2> ${msg.welcome}</h2>
    <h3> Today is ${msg.today}</h3>
    <button class="btn btn-large btn-block btn-primary" type="button">Go!!!!!</button>

<center>
    <button class="btn btn-success btn-large" type="button"><a href="employeeform">Create Course</a></button>
    <button class="btn btn btn-success btn-large" type="button"><a href="employees">List Courses</a></button>
</center>


</body>

<jsp:include page="footer/include.jsp" />
