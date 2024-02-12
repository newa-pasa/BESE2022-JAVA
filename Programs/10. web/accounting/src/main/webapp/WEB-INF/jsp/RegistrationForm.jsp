<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>Registration Form</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
</head>
<body>

    <form action="register" method="post">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required><br>

        <label for="roll">Roll:</label>
        <input type="text" id="roll" name="roll" required><br>

        <label for="age">Age:</label>
        <input type="text" id="age" name="age" required><br>

        <label for="sex">Sex:</label>
        <input type="radio" id="male" name="sex" value="Male"> Male
        <input type="radio" id="female" name="sex" value="Female"> Female<br>

        <label for="mobile">Mobile:</label>
        <input type="text" id="mobile" name="mobile" required><br>

        <input type="submit" value="Register">
    </form>
    
</body>
</html>