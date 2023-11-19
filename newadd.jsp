<!-- newadd.jsp -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Sum Calculator</title>
</head>
<body>
    <h2>Sum Calculator</h2>
    <form action="newadd.jsp" method="post">
        Enter Number 1: <input type="text" name="num1"><br>
        Enter Number 2: <input type="text" name="num2"><br>
        <input type="submit" value="Calculate Sum">
    </form>

    <%-- JSP Scriptlet to process form data and display the sum --%>
    <%
        // Retrieve values from the form
        String num1Str = request.getParameter("num1");
        String num2Str = request.getParameter("num2");

        // Check if both inputs are provided
        if (num1Str != null && num2Str != null && !num1Str.isEmpty() && !num2Str.isEmpty()) {
            try {
                // Parse input strings to integers
                int num1 = Integer.parseInt(num1Str);
                int num2 = Integer.parseInt(num2Str);

                // Calculate the sum
                int sum = num1 + num2;

                // Display the result
                out.println("<p>Sum: " + sum + "</p>");
            } catch (NumberFormatException e) {
                // Handle the case where the input is not a valid number
                out.println("<p>Please enter valid numbers.</p>");
            }
        }
    %>

</body>
</html>
