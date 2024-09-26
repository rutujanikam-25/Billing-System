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
<% List<Product> list=(List<Product>)request.getAttribute("ProductList"); %>
<% Customer c=(Customer)request.getAttribute("CustomerDetails"); %>
 <center><h1> Welcome <%=c.getName() %> See  All Products</h1></center> 
 
 <table>
        <tr>
            <th>Product Name</th>
            <th>Product Price</th>
            <th>Product Brand</th>
            
        </tr>
      


			<%
			if (!list.isEmpty()) {
				for (Product p : list) {
			%>
			<tr>
			<th><%=p.getName()%></th>
            <th><%=p.getPrice() %></th>
           
            <th><%=p.getBrand() %></th>
            
         <th> <a href='order/cid:<%=c.getId()%>/pid:<%=p.getId()%>'>Order More</a></th> 
        
           
			<%
			}
			} else {
			out.println("There is no proucts");
			}
			%>
</tr>
	
</body>
</html> 
