<jsp:include page="../header/include.jsp" />
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>

<body>

    <button class="btn btn-large btn-block btn-primary" type="button">This is The Landing Page for the Application Menu</button>

<center>
    <button class="btn btn-success btn-large" type="button"><a href="/marksapp">Home</a></button>
    <button class="btn btn-success btn-large" type="button"><a href="courseform">Create Course</a></button>
    <button class="btn btn btn-success btn-large" type="button"><a href="courses">List Courses</a></button>
</center>
<p></p>
<center>
    <f:form id="form" method="post" modelAttribute="courseModel" class="form-horizontal" action="createcourse">

        <div class="control-group warning" hidden="true">
            <label class="control-label" for="inputWarning">Input with warning</label>
            <div class="controls">
                <f:input path="id"/>
            </div>
        </div>

        <div class="control-group warning">
            <label class="control-label" for="courseName">Course Name</label>
            <div class="controls">
                <f:input path="courseName"  type="text" id="courseName" />
            </div>
        </div>

        <div class="control-group warning">
            <label class="control-label" for="courseCode">Course Code </label>
            <div class="controls">
                <f:input path="courseCode" type="text" id="courseCode"/>
            </div>
        </div>

        <button type="submit" class="btn btn btn-inverse btn-large">Create Course</button>

    </f:form>
    
</center>

</body>

<jsp:include page="../footer/include.jsp" />
