<%-- 
    Document   : add
    Created on : Sep 10, 2013, 3:22:30 PM
    Author     : DibaW
--%>
<!DOCTYPE html>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<html>
    <head>
        <title>Add Employee</title>
        <meta charset="utf-8">
        <meta http-equiv="Cache-Control" content="no-cache"/>
        <title>Title</title>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="image/ico" rel="icon" href="<c:url value="/resources/images/favicon.ico" />" />
        <link type="text/css" rel="stylesheet" href="<c:url value="/resources/bootstrap/css/bootstrap.css" />" />
        <script type="text/javascript" src="<c:url value="/resources/javascript/script.js"/>"> </script>
        
    </head>
    <body>
        <h1>Add University</h1>
        
        <f:form action="persist.php" method="POST" modelAttribute="employeeModel">
            
            <label>Name: </label> <br/>
            <f:input path="universityName" /> <br/>
            <input type="submit" value="Submit"/>
            <input type="reset" value="Reset"/>
        </f:form>

    </body>
</html>

