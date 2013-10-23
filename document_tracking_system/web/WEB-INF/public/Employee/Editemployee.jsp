<%-- 
    Document   : Editemployee
    Created on : Oct 18, 2013, 5:00:19 PM
    Author     : DibaW
--%>

<jsp:include page="../header/include.jsp" />
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
    <body>
     <div class="container">
     
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
    <h1>Edit Employee</h1>
 <body>
        
 <center>      
 
                    
  <f:form id="form" method="post" modelAttribute="employee" class="form-inline" action="updateemployee"> 
      
      
      
      
       
        <div class="control-group warning">
             <label class="control-label" for="fname">First Name:</label></br>
              <div class="input-large">
                    <f:input path="fname" type="text" id="fname"  value="${employee.fname}"/>
               </div>
        </div>
      
      
       
        <div class="control-group warning">
             <label class="control-label" for="lname">Last Name:</label></br>
              <div class="input-large">
                    <f:input path="lname" type="text" id="lname"  value="${employee.lname}"/>
               </div>
        </div>
      
      
             
        <div class="control-group warning">
             <label class="control-label" for="tel">Telephone:</label></br>
              <div class="input-large">
                    <f:input path="tel" type="text" id="tel"  value="${employee.tel}"/>
               </div>
        </div>
      
                  <div class="control-group warning">
             <label class="control-label" for="fax">Fax</label></br>
              <div class="input-large">
                    <f:input path="fax" type="text" id="fax"  value="${employee.fax}"/>
               </div>
        </div>
             
                         <div class="control-group warning">
             <label class="control-label" for="email">Email</label></br>
              <div class="input-large">
                    <f:input path="email" type="text" id="email"  value="${employee.email}"/>
               </div>
        </div><br>
             
          
             <button type="Submit" class="btn btn-success">Submit</button>    
          
        
          </f:form>
     
 </center>
    </body>

 </div>
</body>
<jsp:include page="../footer/include.jsp" />
</html>
