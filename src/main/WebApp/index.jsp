```jsp
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>ADHD Assessment Form</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>

<div class="container">
    <h1>ADHD Screening Form</h1>

    <form action="submitForm" method="post">

        <label for="name">Name</label>
        <input type="text" id="name" name="name" required>

        <label for="age">Age</label>
        <input type="number" id="age" name="age" required>

        <label for="focus">Focus Level (1-10)</label>
        <input type="number" id="focus" name="focus" min="1" max="10" required>

        <label for="distraction">Easily Distracted? (Yes/No)</label>
        <select id="distraction" name="distraction">
            <option value="Yes">Yes</option>
            <option value="No">No</option>
        </select>

        <label for="accuracy">Task Accuracy (%)</label>
        <input type="number" id="accuracy" name="accuracy" min="0" max="100" required>

        <button type="submit">Submit</button>
    </form>
    <text> Result is: ${result}</text>




</div>

</body>
</html>
```
