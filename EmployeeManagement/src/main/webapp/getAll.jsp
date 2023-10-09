<%@page import="java.util.List"%>
<%@page import="edu.jsp.Employee_App.DTO.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inbox Details</title>
</head>


<body>

<%  

    List<Employee>employee = (List<Employee>) request.getAttribute("list");

%>


<table border="1px">

<tr>

<th>id</th>
<th>Name</th>
<th>cname</th>
<th>job</th>
<th>salary</th>
<th>email</th>
<th>password</th>
<th>phone  Number</th>
<th>Delete</th>
<th>Update</th>
<th>Add</th>

</tr>

<% for(Employee e : employee)  {%>

<tr>

<td><%= e.getId() %></td>
<td><%= e.getName()%></td>
<td><%= e.getCname() %></td>
<td><%= e.getJob() %></td>
<td><%= e.getSalary() %></td>
<td><%= e.getEmail() %></td>
<td><%= e.getPassword() %></td>
<td><%= e.getPhone_Number() %></td>
<td><button><a href="deleteInServlet?mobile=<%=e.getId()%>">Delete</a></button></td>
<td><button><a href="get?eid=<%=e.getId()%>">Update</a></button></td>
<td><a href="Sigin.jsp">Add</a></td>


</tr>


<% } %>
</table>
</body>
</html>