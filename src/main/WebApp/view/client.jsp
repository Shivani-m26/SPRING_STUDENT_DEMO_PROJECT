<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>

<html>
<head>
    <title>Student Registration</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>

<div class="container">

```
<h1>Student Registration Form</h1>

<form action="submitClient" method="post">

    <label for="id">Student ID</label>
    <input type="number" id="id" name="id" required>

    <label for="name">Student Name</label>
    <input type="text" id="name" name="name" required>

    <label for="age">Age</label>
    <input type="number" id="age" name="age" required>

    <button type="submit">Submit</button>

</form>

<hr>

<h3>Submitted Details</h3>

<p>ID : ${addClient.id}</p>
   <p>Name : ${addClient.name}</p>
   <p>Age : ${addClient.age}</p>
```

</div>

</body>
</html>
