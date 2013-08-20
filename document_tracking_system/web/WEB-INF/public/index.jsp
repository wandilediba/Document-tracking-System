<jsp:include page="header/include.jsp" />

<body>
    <h1 class="header">Hello World!</h1>
    <h2> ${msg.welcome}</h2>
    <h3> Today is ${msg.today}</h3>
    <button class="btn btn-large btn-block btn-primary" type="button">This is The Landing Page for the Application Menu</button>

<center>
    <button class="btn btn-success btn-large" type="button"><a href="employeeform">Create Course</a></button>
    <button class="btn btn btn-success btn-large" type="button"><a href="courses">List Courses</a></button>
</center>


</body>

<jsp:include page="footer/include.jsp" />
