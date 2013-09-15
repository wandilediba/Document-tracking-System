<%-- 
    Document   : listEmployees
    Created on : Sep 14, 2013, 3:22:03 PM
    Author     : DibaW
--%>

<jsp:include page="../header/include.jsp" />
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
    <body> 
    <center>
        <div class="masthead">
        <h3 class="text-muted">Employee Page</h3>
        <ul class="nav nav-justified">
          <li class="active"><a href="/document_tracking_system">Home</a></li>
          <li><a href="createemployee">Create</a></li>
          <li><a href="ListEmployee">List</a></li>
          <li><a href="#">Document</a></li>
          <li><a href="#">About</a></li>
          <li><a href="#">Contact</a></li>
        </ul>
      </div> 
    <h1>List Employee</h1>
    
    
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

<jsp:include page="../footer/include.jsp" />