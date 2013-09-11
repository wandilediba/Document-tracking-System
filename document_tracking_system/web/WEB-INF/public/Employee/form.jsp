<jsp:include page="../header/include.jsp" />
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>

<body>
    <div class="masthead">
        <h3 class="text-muted">Dot Document Tracking</h3>
        <ul class="nav nav-justified">
          <li class="active"><a href="#">Home</a></li>
          <li><a href="Employeeform">Employee</a></li>
          <li><a href="#">Submission</a></li>
          <li><a href="#">Document</a></li>
          <li><a href="#">About</a></li>
          <li><a href="#">Contact</a></li>
        </ul>
      </div> 
    <h1>Create Employee</h1>
 <div id="content"   
     <div class="form-group has-warning">
                    <label class="control-label" for="emp_id">Employee Name: </label>
                    <div class="controls">
                      <f:input path="emp_id" type="text" id="emp_id" />
                    </div>
     </div>
 
</body>

<jsp:include page="../footer/include.jsp" />
