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
    
        .dropdown {
            position: relative;
            display: inline-block;
        }

        .dropdown-content {
            display: none;
            position: absolute;
            background-color: #f9f9f9;
            min-width: 160px;
            box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
            z-index: 1;
        }

        .dropdown-content a {
            color: black;
            padding: 12px 16px;
            text-decoration: none;
            display: block;
        }

        .dropdown-content a:hover {
            background-color: #f1f1f1;
        }

        .dropdown:hover .dropdown-content {
            display: block;
        }

        .dropdown:hover .dropbtn {
            background-color: #3e8e41;
        }

        .dropbtn {
            background-color: #4CAF50;
            color: white;
            padding: 16px;
            font-size: 16px;
            border: none;
            cursor: pointer;
        }
    </style>
</head>
<body>
<% List<Customer> list=(List<Customer>)request.getAttribute("CustomerList"); %>
<% List<Bill> list1=(List<Bill>)request.getAttribute("viewBillList"); %>


<table>
        <tr>
            <th>customer Name</th>
            </tr>
            
            <%
			if (!list.isEmpty()) {
				for (Customer c : list) {
			%>
			<tr>
			<th><%=c.getName()%> </th>
			<th><%=c.getId()%> </th>
			<th>  <th> <a href='Product/<%=c.getId()%>'>product</a></th>
		
         <th> <a href='showList/<%=c.getId() %>'>Show List</a>
            <th> <a href='Product/getPriceAndProductName/<%=c.getId()%>'> Bill</a></th> 
           
			<%
			}
			} else {
			out.println("There is no customer");
			}
        	%>
        	
        	 
            
            
		
			
			
</tr>
	
</body>
</html>