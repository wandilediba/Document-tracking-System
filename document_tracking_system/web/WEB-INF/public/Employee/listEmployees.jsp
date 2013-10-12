<%-- 
    Document   : listEmployees
    Created on : Sep 14, 2013, 3:22:03 PM
    Author     : DibaW
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<jsp:include page="../header/include.jsp" />
 
<body> 
  <div id="container">
   
        <div id="menu">
        <div class="masthead">
        <h3 class="text-muted">Employee Page</h3>
        <ul class="nav nav-justified">
          <li class="active"><a href="/document_tracking_system">Home</a></li>
          <li><a href="createemployee">Create</a></li>
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
              <li class="nav-header"> PDF Report</li>
              <li><a href="ReportDept.aspx">HR Report</a></li>
              <li class="nav-header">Asset Report</li>
              <li><a href="Default.aspx">Search for asset</a></li>
              <li class="nav-header">Department Reports</li>
              <li><a href="Crud.aspx">Assert Report</a></li>
              <li><a href="#">Total Assets</a></li>
            </ul>
          </div>
        </div>
    </div>
</div>
</div> <!-- /container -->
<jsp:include page="../footer/include.jsp" />
