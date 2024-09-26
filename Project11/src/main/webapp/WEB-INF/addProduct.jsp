<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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


<form action="AddProductDeatils"  method="post">
<lebel for="Productname">Enter ProductName</lebel>
<input type="text" name="name"><br>

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