<jsp:include page="../header/include.jsp" />
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>

<body>
    
    
    <div class="masthead">
        <h3 class="text-muted">Employee Page</h3>
        <ul class="nav nav-justified">
          <li class="active"><a href="/document_tracking_system">Home</a></li>
          <li><a href="#">Employee</a></li>
          <li><a href="employees">List</a></li>
          <li><a href="#">Document</a></li>
          <li><a href="#">About</a></li>
          <li><a href="#">Contact</a></li>
        </ul>
      </div> 
    <h1>Create Employee</h1>
    <div id="content"  >
    <center>
        <f:form id="form" method="post" modelAttribute="employeeModel" class="form-horizontal" action="createemployee">
                     
             <div class="control-group warning" >
                    <div class="controls">
                       
                         
                                <f:input path="nameModel.fname" type="text" id="fname" placeholder="Name"/>
                         </div>
          </div>
     <p></p>
             <div class="control-group warning" >
                   <div class="controls">
                        <f:input path="nameModel.lname" type="text" id="lname" placeholder="Surname" />
                   </div>
             </div>
      <p></p>
             <div class="control-group warning" >
                   <div class="controls">
                        <f:input path="contactModel.tel" type="text" id="tel" placeholder="Telephone" />
                   </div>
             </div>      
           <p></p>
             <div class="control-group warning" >
                   <div class="controls">
                        <f:input path="contactModel.fax" type="text" id="fax" placeholder="Fax" />
                   </div>
             </div>  
             <p></p>
             <div class="control-group warning" >
                   <div class="controls">
                    <!--    f:input path="emp_id" type="text" id="empid" placeholder="Employee ID" />-->
                   </div>
             </div> 
                    <p></p>
             <div class="control-group warning" >
                   <div class="controls">
                        <f:input path="contactModel.email" type="text" id="email" placeholder="E-Mail" />
                   </div>
             </div>     
      
       <p></p>             
             <button type="submit" class="btn btn-success">Create Employee</button>     
                   
         </f:form>  
  
     </div>

</body>

<jsp:include page="../footer/include.jsp" />
