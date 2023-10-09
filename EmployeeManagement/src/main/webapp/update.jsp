<%@page import="edu.jsp.Employee_App.DTO.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update page</title>
</head>
<body>

<%   Employee e = (Employee)   request.getAttribute("employee"); %>



<form action="update" >


<label>Enter your id</label><br><br>
<input type="text" name="id"  value="<%= e.getId()%>"   readonly="true"><br><br>
<label>Enter your Name</label><br><br>
<input type="text" name="name"    value="<%= e.getName()%>" ><br><br>
<label>Enter your Company name</label><br><br>
<input type="text" name="cname"    value="<%= e.getCname()%>" ><br><br>
<label>Enter your job</label><br><br>
<input type="text" name="job"    value="<%= e.getJob()%>" ><br><br>
<label>Enter your salary</label><br><br>
<input type="text" name="salary"   value="<%= e.getSalary()%>" ><br><br>
<label>Enter your Email</label><br><br>
<input type="email" name="email"    value="<%= e.getEmail()%>" ><br><br>
<label>Enter your Phone Number</label><br><br>
<input type="text" name="phone"   value="<%= e.getPassword()%>" ><br><br>
<label>Enter your Password</label><br><br>
<input type="password" name="password"  value="<%= e.getPhone_Number()%>" ><br><br>
<button type="submit">Submit</button>


</form>





</body>
</html>