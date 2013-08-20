<%-- 
    Document   : index
    Created on : 14 May 2013, 7:50:13 PM
    Author     : 209043946
--%>

<%--<jsp:include page="header/include.jsp" />--%>

<body>
    <h1 class="header">Welcome to DoT Document Tracking System</h1>
    <h2> ${msg.welcome}</h2>
    <h3> Today is ${msg.today}</h3>
    <button class="btn btn-large btn-block btn-primary" type="button">This is The Landing Page for the Application Menu</button>

<center>
    <button class="btn btn-success btn-large" type="button"><a href="employeeform">Create Employee</a></button>
    <button class="btn btn btn-success btn-large" type="button"><a href="employees">List Department</a></button>
</center>


</body>

<%--jsp:include page="footer/include.jsp" />--%>

