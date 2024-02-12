<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
    <html>

    <head>
        <meta charset="UTF-8">
        <title>Registration Confirmation</title>
    </head>

    <body>
        <h2>Registration Confirmation</h2>

        <p>Thank you for registering!</p>

        <p>Details:</p>
        <ul>
            <li><strong>Name:</strong> ${student.getName()}</li>
            <li><strong>Roll:</strong> ${student.getRoll()}</li>
            <li><strong>Age:</strong> ${student.getAge()}</li>
            <li><strong>Sex:</strong> ${student.getSex()}</li>
            <li><strong>Mobile:</strong> ${student.getMobile()}</li>
        </ul>
    </body>

    </html>