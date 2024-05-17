<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add New Car</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>

</head>
<body>
<h1 style="text-align: center">Car Information System</h1>
<hr/>
<br>
<div class="container">
<h4 style = "text-align: center"> Add New Car Form</h4>
<hr>
Helloooooooooooooooooooooo
<form action="CarController?action=add" method="post">
  <div class="mb-3 row">
    <label for="staticEmail" class="col-sm-2 col-form-label">Id</label>
    <div class="col-sm-10">
      <input type="text"  class="form-control" name="email" value="Your Id"><br>
    </div>
    <div class="mb-3 row">
    <label for="staticEmail" class="col-sm-2 col-form-label">CarName</label>
    <div class="col-sm-10">
      <input type="text"  class="form-control" name="email" ><br>
    </div>
    <div class="mb-3 row">
    <label for="staticEmail" class="col-sm-2 col-form-label">Price</label>
    <div class="col-sm-10">
      <input type="text"  class="form-control" name="email" ><br>
    </div>
    <div class="mb-3 row">
    <label for="staticEmail" class="col-sm-2 col-form-label">Varient</label>
    <div class="col-sm-10">
      <input type="text"  class="form-control" name="email" ><br>
    </div>
    <div class="mb-3 row">
    <label for="staticEmail" class="col-sm-2 col-form-label">SteeringType</label>
    <div class="col-sm-10">
      <input type="text"  class="form-control" name="email" ><br>
    </div>
    <div class="mb-3 row">
    <label for="staticEmail" class="col-sm-2 col-form-label">FuelType</label>
    <div class="col-sm-10">
    <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            Dropdown link
          </a>
          <ul class="dropdown-menu">
            <li><a class="dropdown-item" href="#">Action</a></li>
            <li><a class="dropdown-item" href="#">Another action</a></li>
            <li><a class="dropdown-item" href="#">Something else here</a></li>
          </ul>
        </li>
      <input type="text"  class="form-control" name="email" ><br>
    </div>
    <div class="mb-3 row">
    <label for="staticEmail" class="col-sm-2 col-form-label">DealerName</label>
    <div class="col-sm-10">
      <input type="text"  class="form-control" name="email" ><br>
    </div>
     <div class="mb-3 row">
    <label for="staticEmail" class="col-sm-2 col-form-label">ManufacturingYear</label>
    <div class="col-sm-10">
      <input type="text"  class="form-control" name="email" ><br>
    </div>
    <div class="mb-3">
  <button type="submit" class="btn btn-primary">Save</button> | <button type="reset" class="btn btn-primary">Clear</button>
  
  </div>
  </div>
  </div>
  </div>
  </div></div></div></div></div></div>
  </form>
</body>
</html>