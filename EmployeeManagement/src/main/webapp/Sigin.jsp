<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EmployeeManagement</title>
</head>


<body>






<form action="sigin" method ="post">

<%   String m = (String)  request.getAttribute("msg");


     if(m != null) { %> 
     
     <h1><%= m %></h1>
    <%  } %>

<label>Enter your Name</label><br><br>
<input type="text" name="name"><br><br>
<label>Enter your Company name</label><br><br>
<input type="text" name="cname"><br><br>
<label>Enter your job</label><br><br>
<input type="text" name="job"><br><br>
<label>Enter your salary</label><br><br>
<input type="text" name="salary"><br><br>
<label>Enter your Email</label><br><br>
<input type="email" name="email"><br><br>
<label>Enter your Phone Number</label><br><br>
<input type="text" name="phone"><br><br>
<label>Enter your Password</label><br><br>
<input type="password" name="password"><br><br>
<button type="submit">Submit</button>


</form>

</body>
</html>