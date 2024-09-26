<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="com.Project11.model.*,java.util.*" %>
    
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Bill System</title>
    <style>
    
    .h1{
    
     font-family: Arial, sans-serif;
    }
    
        
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        body {
            font-family: Arial, sans-serif;
        }

       
        .navbar {
            background-color: #333;
            overflow: hidden;
        }

        .navbar a {
            float: left;
            display: block;
            color: white;
            text-align: center;
            padding: 14px 20px;
            text-decoration: none;
        }

        .navbar a:hover {
            background-color: #ddd;
            color: black;
        }

       
        .navbar .icon {
            display: none;
        }

        .navbar .right {
            float: right;
        }

      
        @media screen and (max-width: 600px) {
            .navbar a {
                float: none;
                display: block;
                text-align: left;
            }

            .navbar .right {
                float: none;
            }

            .navbar .icon {
                float: right;
                display: block;
            }

            .navbar.responsive {position: relative;}
            .navbar.responsive .icon {
                position: absolute;
                right: 0;
                top: 0;
            }
            .navbar.responsive a {
                float: none;
                display: block;
                text-align: left;
            }
        }
        
        .hi{
         display: flex;
    justify-content: center; 
    align-items: center;   
    height: 30vh;    
        
        }}   
    </style>
</head>
<body>
   <% List<Bill> list=(List<Bill>)request.getAttribute("productRevenue"); double totalRevenue=0; int count=0;%>
    <div class="navbar" id="myNavbar">
        <a href="#home">Home</a>
        <a href="/Project11/hi">Add Customer</a>
        <a href="/Project11/AddProduct">Add Product</a>
        <a href="/Project11/viewProducts">view Product</a>
        <a href="/Project11/viewCustomer">view Customer</a>
        <a href="/Project11/Customer">Bill</a>
        <a href="javascript:void(0);" class="icon" onclick="toggleNavbar()">&#9776;</a>
    </div>


<%
			if (!list.isEmpty()) {
				for (Bill p : list) {
					 count++;
					totalRevenue=totalRevenue+p.getPrice();
			
			}
			} else {
			out.println("There is no proucts");
			}
			%>
    <div style="padding: 20px;">
        <h1 class="hi">Total Revenue : <%=totalRevenue %></h1>
         <h1 class="hi">Total Sales : <%=count %></h1>
        
    </div>
    
   
    
    
    

    <script>
        function toggleNavbar() {
            var navbar = document.getElementById("myNavbar");
            if (navbar.className === "navbar") {
                navbar.className += " responsive";
            } else {
                navbar.className = "navbar";
            }
        }
    </script>

</body>
</html>
    