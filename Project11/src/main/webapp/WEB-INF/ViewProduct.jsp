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

<% List<Product> list=(List<Product>)request.getAttribute("productKey"); %>
 <center><h1> View All Products</h1></center> 

<div class="main col-sm-15">
 <table>
        <tr>
            <th>Product Name</th>
            <th>Product Price</th>
            <th>Product Quantity</th>
            <th>Product Brand</th>
            <th>Product Supplier</th>
            <th>Old Stock</th>
            <th>Product Category</th>
            
        </tr>
      


			<%
			if (!list.isEmpty()) {
				for (Product p : list) {
			%>
			<tr>
			<th><%=p.getName()%></th>
            <th><%=p.getPrice() %></th>
            <th><%=p.getQuantity() %></th>
            <th><%=p.getBrand() %></th>
            <th><%=p.getSupplier() %></th>
            <th><%=p.getStock() %></th>
            <th><%=p.getCategory() %></th>
            <th> <a href='DeleteProduct/<%=p.getId()%>'> Delete</a></th>
            <th> <a href='EditProduct/<%=p.getId()%>'> Edit</a></th>
			<%
			}
			} else {
			out.println("There is no proucts");
			}
			%>
</tr>
	
	</div>




</body>
</html>