<jsp:include page="header/include.jsp" />

<body>
    
        <div class="container">

      <div class="masthead">
        <h3 class="text-muted">Dot Document Tracking</h3>
        <ul class="nav nav-justified">
          <li class="active"><a href="/document_tracking_system">Home</a></li>
          <li><a href="Employeeform">Employee</a></li>
          <li><a href="#">Department</a></li>
          <li><a href="#">Document</a></li>
          <li><a href="#">About</a></li>
          <li><a href="#">Contact</a></li>
        </ul>
      </div>

      <!-- Jumbotron -->
      <div class="jumbotron">
        <h1>Document Tracking</h1>
        <p class="lead">This application is used for tracking all the internal communication that is submitted to the Minister for Cabinet approval.</p>
        <p><a class="btn btn-lg btn-success" href="#">Start Submission</a></p>
      </div>

      <!-- Example row of columns -->
      <div class="row">
        <div class="col-lg-4">
          <h2> ${msg.welcome}</h2>
           <h3> Today is ${msg.today}</h3>
        </div>
        <div class="col-lg-4">
          <h2>Help</h2>
          <p> </p>
          <p><a class="btn btn-primary" href="#">Get Help &raquo;</a></p>
       </div>
        <div class="col-lg-4">
          <h2>Tips </h2>
          <p></p>
          <p><a class="btn btn-primary" href="#">View Tips &raquo;</a></p>
        </div>
      </div>

      

    </div> <!-- /container -->


    <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
  
    
</body>

<jsp:include page="footer/include.jsp" />
