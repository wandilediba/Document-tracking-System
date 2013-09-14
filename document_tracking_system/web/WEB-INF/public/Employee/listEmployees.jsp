<%-- 
    Document   : listEmployees
    Created on : Sep 14, 2013, 3:22:03 PM
    Author     : DibaW
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>List Employees</title>
    </head>
    <body> 
        <div class="masthead">
        <h3 class="text-muted">Employees Page</h3>
        <ul class="nav nav-justified">
          <li class="active"><a href="/document_tracking_system">Home</a></li>
          <li><a href="Employee">List</a></li>
          <li><a href="#">Submission</a></li>
          <li><a href="#">Document</a></li>
          <li><a href="#">About</a></li>
          <li><a href="#">Contact</a></li>
        </ul>
      </div> 
    <h1>Create Employee</h1>
    
    
    </center>
     <center>
    <table class="table table-hover">
        <caption> <h2>Employees </h2></caption>
        <thead>
            <tr>
                <th>Employee Name</th>
                <th>Employee Surname</th>
                <th>Edit 
                <th>Delete</th>
            </tr>
        </thead>

        <tbody>
            <c:forEach var="employee" items="${employees}">
                <tr>
                    <td>${employees.fname}</td>
                    <td>${employees.lname} </td>
                    <td><a> Edit </a></td>
                    <td><a> Delete </a></td>
                </tr>

            </c:forEach>

        </tbody>


    </table>

</center>               
    </body>
</html>
<jsp:include page="../footer/include.jsp" />