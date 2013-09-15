<%-- 
    Document   : Employee
    Created on : 13 Aug 2013, 7:48:04 PM
    Author     : 209043946
--%>

<jsp:include page="../header/include.jsp" />
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
 <body>
<div class="masthead">
        <h3 class="text-muted">Employee Page</h3>
        <ul class="nav nav-justified">
          <li class="active"><a href="/document_tracking_system">Home</a></li>
          <li><a href="#">Employee</a></li>
          <li><a href="ListEmployee">List</a></li>
          <li><a href="#">Document</a></li>
          <li><a href="#">About</a></li>
          <li><a href="#">Contact</a></li>
        </ul>
      </div> 
    <h1>Create Employee</h1>
   
         <div class="control-group warning" >
             
 <center>
                    
          <f:form id="form" method="post" modelAttribute="employeeModel" class="form-horizontal" action="createemployee">              
                         <div class="controls">
                                <f:input path="Name.fname" type="text" id="Name.fname" placeholder="Name"/>
                         </div>
          </div>
     <p></p>
             <div class="control-group warning" >
                   <div class="controls">
                        <f:input path="Name.lname" type="text" id="lname" placeholder="Surname" />
                   </div>
             </div>
      <p></p>
             <div class="control-group warning" >
                   <div class="controls">
                        <f:input path="Contact.tel" type="text" id="tel" placeholder="Telephone" />
                   </div>
             </div>      
           <p></p>
             <div class="control-group warning" >
                   <div class="controls">
                        <f:input path="Contact.fax" type="text" id="fax" placeholder="Fax" />
                   </div>
             </div>  
             <p></p>
             <div class="control-group warning" >
                   <div class="controls">
                        <f:input path="emp_id" type="text" id="empid" placeholder="Employee ID" />
                   </div>
             </div> 
                    <p></p>
             <div class="control-group warning" >
                   <div class="controls">
                        <f:input path="Contact.email" type="text" id="email" placeholder="E-Mail" />
                   </div>
             </div>     
      
       <p></p>             
             <button type="submit" class="btn btn-success">Create Employee</button>    
        
          </f:form>
    </body>
</center>
<jsp:include page="../footer/include.jsp" />

</html>