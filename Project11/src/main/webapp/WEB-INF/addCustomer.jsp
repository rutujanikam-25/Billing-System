<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
body {
    display: flex;
    align-items: center;
    justify-content: center;
    font-family: sans-serif;
    line-height: 1.0;
    min-height: 100vh;
  
    background-image: linear-gradient(to right,Violet,indigo);
    flex-direction: column;
    margin: 0;
}
 
.main {
    background-color: #fff;
    border-radius: 15px;
    box-shadow: 0 0 20px rgba(0, 0, 0, 0.2);
    padding: 10px 20px;
    transition: transform 0.2s;
    width: 500px;
    text-align: center;
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

select {
    padding: 10px;
    border-radius: 10px;
    margin-top: 15px;
    margin-bottom: 15px;
    border: none;
    color: Black;
    cursor: pointer;
    background-color: white;
    width: 100%;
    font-size: 16px;
      border: 1px solid #ddd;
    border-radius: 5px;
}
 
</style>
</head>
<body>
<center>


<div class="main">
      <h1>WELCOME</h1>
<form action="signUp"  method="post">
<lebel for="username">Enter user name</lebel>
<input type="text" name="Name"><br>

<lebel for="password">Enter Password</lebel>
<input type="text" name="password"><br>

<lebel for="phone">Enter phone</lebel>
<input type="text" name="Contact"><br>

<lebel for="email">Enter Email</lebel>
<input type="text" name="Email"><br>



<lebel for="user_type">Gender</lebel>
<select name="Gender">

<option value="Female">Female</option>
<option value="Male">Male</option>
<option value="Other">Other</option>
</select>


                         
<input type="submit" value="add">
</form>
</div>
</center>

</body>
</html>