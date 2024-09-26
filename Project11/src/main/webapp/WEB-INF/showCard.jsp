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
<% List<Bill> list1=(List<Bill>)request.getAttribute("results"); %>
<% Customer c=(Customer)request.getAttribute("customerinfo") ;%>
<h1> Hello <%=c.getName() %></h1>
 <center><h1> Add product to card successfully</h1></center> 
 <h1><a href=/Project11/Customer> Add More</a></h1>

<div class="main col-sm-15">
 <table>
        <tr>
            <th>Product Name</th>
            <th>Product Price</th>
          
         
        </tr>
      


			<%
			if (!list1.isEmpty()) {
				for (Bill p : list1) {
			%>
			<tr>
			<th><%=p.getProductName()%></th>
            <th><%=p.getPrice() %></th>
           
            <th> <a href='Deleteorder/<%=p.getId()%>'> Delete</a></th>
           
			<%
			}
			} else {
			out.println("There is no proucts");
			}
			%>
</tr>
</table>
<Center><h1><a href=/Project11/Product/getPriceAndProductName/<%=c.getId() %>>Bill</a></h1></Center>
</body>
</html>