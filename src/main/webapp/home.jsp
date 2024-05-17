<%@page import="java.util.ArrayList"%>
<%@page import="code.microsystem.services.CarService"%>
<%@page import="code.microsystem.model.Car"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
<h1 style="text-align: center">Car ShowRoom Information System</h1>
<hr>
<div class="container">
<%
  List<Car> carLists = new ArrayList<Car>();
  carLists=(List<Car>)request.getAttribute("carLists");
  if(carLists==null){
	  CarService carservice = new CarService();
	  carLists = carservice.getAllCars();
  }
    String msg=(String)request.getAttribute("msg");
if(msg!=null){
%> 
<p style="color:white;background-color: black;text-align: center;font-size: 18px">******${msg}******</p>
<%
}
%>
<br>

<a href="addCar.jsp">Add New Car</a> | <a href="CarController?action=show">View All Cars</a>
<hr/>
  
    
</body>
</html>