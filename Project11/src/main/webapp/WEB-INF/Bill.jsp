<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.Project11.model.*,java.util.*" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Bill Receipt</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f4f4f4;
        }

        .container {
            width: 80%;
            margin: 20px auto;
            background-color: white;
            padding: 20px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        h1, h2 {
            text-align: center;
            color: #333;
        }

        .customer-details, .product-details, .total {
            margin-bottom: 20px;
        }

        .details-table {
            width: 100%;
            border-collapse: collapse;
            margin-bottom: 20px;
        }

        .details-table th, .details-table td {
            border: 1px solid #ddd;
            padding: 8px;
            text-align: left;
        }

        .details-table th {
            background-color: #f2f2f2;
        }

        .total {
            text-align: right;
            font-size: 18px;
            color: #333;
        }

        .print-btn {
            display: block;
            width: 100px;
            margin: 20px auto;
            padding: 10px;
            background-color: #28a745;
            color: white;
            text-align: center;
            text-decoration: none;
            border-radius: 5px;
            cursor: pointer;
        }

        .print-btn:hover {
            background-color: #218838;
        }

        @media print {
            .print-btn {
                display: none;
            }
        }
    </style>
</head>
<body>
        <% Bill b=(Bill)request.getAttribute("OrderDetails"); %>  
        <% List<Bill> list=(List<Bill>)request.getAttribute("results");  double total=0;%> 

    <div class="container">
        <h1>Order Receipt</h1>

        <!-- Customer Details -->
        <div class="customer-details">
            <h2>Customer Details</h2>
            <table class="details-table">
                <tr>
                    <th>Name</th>
                    <td><%=b.getName() %></td> <!-- Replace with dynamic customer name -->
                </tr>
                <tr>
                    <th>Email</th>
                    <td>ksifhi</td> <!-- Replace with dynamic customer email -->
                </tr>
                <tr>
                    <th>Address</th>
                    <td>123 Street, City, Country</td> <!-- Replace with dynamic customer address -->
                </tr>
            </table>
        </div>

        <!-- Product Details -->
        <div class="product-details">
            <h2>Product Details</h2>
            <table class="details-table">
                <tr>
                    <th>Product Name</th>
                    <th>Brand</th>
                    <th>Price</th>
                    <th>Quantity</th>
                </tr>
                <tr>
                   <%
			if (!list.isEmpty()) {
				for (Bill c : list) {
			%>
			<tr>
			<th><%=c.getProductName()%></th>
            <th><%=c.getPrice() %>
           <%  total=total+c.getPrice();%>
            
			<%
			}
			} else {
			out.println("There is no customer");
			}
			%>
                    <td><input value=text name=quantity>1</td> 
                    
                   
                </tr>
               
            </table>
        </div>

        <!-- Total Price -->
        <div class="total">
            <h3>Total Amount:<%=total   %></h3> <!-- Replace with dynamic total price -->
        </div>

        <!-- Print Button -->
        <a href="javascript:window.print()" class="print-btn">Print Bill</a>
    </div>
</body>
</html>
