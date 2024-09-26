 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.Project11.model.*,java.util.*" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style type="text/css">
body {
    display: flex;
    align-items: center;
    justify-content: center;
    font-family: sans-serif;
    line-height: 1.0;
    min-height: 100vh;
    flex-direction: column;
    margin: 0;
}
 
h1 {
    color: Black;
}
 
lebel {
    display: block;
    width: 100%;
    margin-top: 1px;
    margin-bottom: 1px;
    text-align: left;
    color: #555;
    font-weight: bold;
}
 
 
input {
 padding: 10px;
    display: block;
    width: 100%;
    box-sizing: border-box;
    border: 1px solid #ddd;
    border-radius: 5px;
}

 
</style>
<body>
<center>
<h1>Add Our Product Details</h1>
<% Product p=(Product)request.getAttribute("ProductDetails"); %>

<form action="Project11/updateProductDetails"  method="post">
<lebel for="Productname">Enter ProductName</lebel>
<input type="text" name="name"> value="<%= p.getName() %><br>

<lebel for="phone">Product Price</lebel>
<input type="text" name="price"><br>

<lebel for="quantity">Enter Product quantity</lebel>
<input type="text" name="quantity"><br>

<lebel for="brand">Enter Product Brand</lebel>
<input type="text" name="brand"><br>

<lebel for="supplier">Enter Product Supplier</lebel>
<input type="text" name="supplier"><br>

<lebel for="stock">Enter Product stock</lebel>
<input type="text" name="stock"><br>

<lebel for="category">Enter Product category</lebel>
<input type="text" name="category"><br>

<input type="submit" value="submit">

</form>
</center>
</body>
</html>
    
    
    
    
    
    
    
    
    
    
    
    
    
<%-- <!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% Product p=(Product)request.getAttribute("ProductDetails"); %>
<form action="updateProductDetails/<%=p.getId() %>" method="post">
<lebel for="Name">Enter ProductName</lebel>
<input type="text" name="Name" value=<%=p.getName() %>><br>

<lebel for="price">Enter Product Price</lebel>
<input type="text" name="price" value=<%=p.getPrice() %>><br>

<lebel for="quantity">Product quantity</lebel>
<input type="text" name="quantity" value=<%=p.getQuantity()%>><br>

<lebel for="brand">Enter Product Brand</lebel>
<input type="text" name="brand" value=<%=p.getBrand()%>><br>

<lebel for="supplier">Enter Product Supplier</lebel>
<input type="text" name="supplier" value=<%=p.getSupplier()%>><br>

<lebel for="stock">Enter Product stock</lebel>
<input type="text" name="stock" value=<%=p.getStock()%>><br>

<lebel for="category">Enter Product category</lebel>
<input type="text" name="category" value=<%=p.getCategory()%>><br>



<input type="submit" value="submit">
</body>
</html>  --%>
<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="com.Project11.model.*,java.util.*" %>
    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style type="text/css">
body {
    display: flex;
    align-items: center;
    justify-content: center;
    font-family: sans-serif;
    line-height: 1.0;
    min-height: 100vh;
    flex-direction: column;
    margin: 0;
}
 
h1 {
    color: Black;
}
 
lebel {
    display: block;
    width: 100%;
    margin-top: 1px;
    margin-bottom: 1px;
    text-align: left;
    color: #555;
    font-weight: bold;
}
 
 
input {
 padding: 10px;
    display: block;
    width: 100%;
    box-sizing: border-box;
    border: 1px solid #ddd;
    border-radius: 5px;
}

 
</style>
<body>
<center>
<h1>Add Our Product Details</h1>

<% Product p=(Product)request.getAttribute("ProductDetails"); %>
<form action="updateProductDetails/<%=p.getId() %>" , method="post">
<label for="name">Enter ProductName</label>
<input type="text" name="name"><br>

<label for="phone">Product Price</label>
<input type="text" name="price"><br>

<lebel for="quantity">Enter Product quantity</lebel>
<input type="text" name="quantity"><br>

<label for="brand">Enter Product Brand</label>
<input type="text" name="brand"><br>

<label for="supplier">Enter Product Supplier</label>
<input type="text" name="supplier"><br>

<label for="stock">Enter Product stock</label>
<input type="text" name="stock"><br>

<label for="category">Enter Product category</label>
<input type="text" name="category"><br>

<input type="submit" value="submit">

</form>
</center>
</body>
</html> --%>
<%-- <!DOCTYPE html>
<html>
<head>
    <title>Update Product</title>
</head>
<body>
    <center>
        <h1>Update Product Details</h1>

        <% Product p = (Product) request.getAttribute("ProductDetails"); %>
        
        <form action="/updateProductDetails/<%=p.getId() %>" method="post">
            <label for="name">Enter Product Name</label>
            <input type="text" name="t1" value="<%= p.getName() %>"><br>

            <label for="price">Product Price</label>
            <input type="text" name="t2" value="<%= p.getPrice() %>"><br>

            <label for="quantity">Enter Product Quantity</label>
            <input type="text" name="t3" value="<%= p.getQuantity() %>"><br>

            <label for="brand">Enter Product Brand</label>
            <input type="text" name="t4" value="<%= p.getBrand() %>"><br>

            <label for="supplier">Enter Product Supplier</label>
            <input type="text" name="t5" value="<%= p.getSupplier() %>"><br>

            <label for="stock">Enter Product Stock</label>
            <input type="text" name="t6" value="<%= p.getStock() %>"><br>

            <label for="category">Enter Product Category</label>
            <input type="text" name="t7" value="<%= p.getCategory() %>"><br>

            <input type="submit" value="Update">
        </form>
    </center>
</body>
</html>
 --%>