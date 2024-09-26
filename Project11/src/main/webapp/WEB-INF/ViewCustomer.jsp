<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.Project11.model.*,java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
        table {
            width: 100%;
            border-collapse: collapse;
        }
        table, th, td {
            border: 1px solid black;
        }
        th, td {
            padding: 10px;
            text-align: left;
        }
        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
<% List<Customer> list=(List<Customer>)request.getAttribute("CustomerKey"); %>
 <center><h1> View All Customer</h1></center> 

<div class="main col-sm-15">
 <table>
        <tr>
            <th>customer Name</th>
            <th>customer Email</th>
            <th>customer Contact</th>
            <th>customer Gender</th>
            
        </tr>
      


			<%
			if (!list.isEmpty()) {
				for (Customer c : list) {
			%>
			<tr>
			<th><%=c.getName()%></th>
            <th><%=c.getEmail() %>
            <th><%=c.getContact() %>
            <th><%=c.getGender() %>
			<%
			}
			} else {
			out.println("There is no customer");
			}
			%>
</tr>
	
	</div>



</body>
</html>