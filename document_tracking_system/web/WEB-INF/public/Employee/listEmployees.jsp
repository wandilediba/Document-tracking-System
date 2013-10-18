<%-- 
    Document   : listEmployees
    Created on : Sep 14, 2013, 3:22:03 PM
    Author     : DibaW
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<jsp:include page="../header/include.jsp" />
 
<body> 
  <div class="container">
   
        <div id="menu">
        <div class="masthead">
        <h3 class="text-muted">Employee Page</h3>
        <ul class="nav nav-justified">
          <li class="active"><a href="/document_tracking_system">Home</a></li>
          <li><a href="employeeform">Create</a></li>
          <li><a href="employees">List</a></li>
          <li><a href="#">Document</a></li>
          <li><a href="#">About</a></li>
          <li><a href="#">Contact</a></li>
        </ul>
      </div> 
     </div>
       
<div id="content">  
    <table class="table table-hover">
        <caption> <h2>Employees </h2></caption>
        <thead>
            <tr>
                <th>ID</th>
                <th>Employee Name</th>
                <th>Employee Surname</th>
                <th>Telephone</th>
                <th>Fax</th>
                <th>E-Mail</th>
                <th>Edit 
                <th>Delete</th>
            </tr>
        </thead>

        <tbody>
            <c:forEach var="employee" items="${employees}">
                <tr>
                    <td>${employee.id}</td>
                    <td>${employee.name.fname}</td>
                    <td>${employee.name.lname} </td>
                    <td>${employee.contact.tel}</td>
                    <td>${employee.contact.fax}</td>
                    <td>${employee.contact.email}</td>
                    
                    <td><a href="editemployee?id=${employee.id}"> Edit </a></td>
                    <td><a href="deleteemployee?emp_id=${employee.id}"> Delete </a></td>
                </tr>

            </c:forEach>
        </tbody>
    </table>
 
</div>
<div id="sidemenu">
    <div class="container-fluid">
      <div class="row-fluid">
         <div class="well sidebar-nav">
            <ul class="nav nav-list">
              <li class="nav-header"> Employee</li>
              <li><a href="#">List Employee</a></li>
              <li class="nav-header">Department</li>
              <li><a href="#">List Documents</a></li>
              <li class="nav-header">Submission</li>
              <li><a href="#">list Submission</a></li>
              <li><a href="#">Add Submission</a></li>
            </ul>
          </div>
        </div>
    </div>
</div>
</div> <!-- /container -->
<jsp:include page="../footer/include.jsp" />
