<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Student Registration</title>
</head>
<body>

    <!-- JSP Scriptlet to Load MySQL JDBC Driver -->
    <%
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            out.println("<p>Error loading MySQL JDBC driver: " + e.getMessage() + "</p>");
        }
    %>

    <h2>Student Registration</h2>

    <!-- Form for Data Insertion -->
    <form action="form.jsp" method="post">
        Enter Registration Number: <input type="text" name="regno"><br>
        Enter Name: <input type="text" name="name"><br>
        <input type="submit" value="Register Student">
    </form>

    <!-- JSP Scriptlet to Process Form Data and Insert into Database -->
    <%
        String regNo = request.getParameter("regno");
        String studentName = request.getParameter("name");

        if (regNo != null && studentName != null && !regNo.isEmpty() && !studentName.isEmpty()) {
            try {
                // Establish the database connection
                String jdbcUrl = "jdbc:mysql://localhost:3306/db";
                String dbUser = "root";
                String dbPassword = "root";
                Connection connection = DriverManager.getConnection(jdbcUrl, dbUser, dbPassword);

                // Insert data into the database
                String insertQuery = "INSERT INTO data (regno, name) VALUES (?, ?)";
                try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
                    preparedStatement.setString(1, regNo);
                    preparedStatement.setString(2, studentName);
                    preparedStatement.executeUpdate();
                }

                // Close the database connection
                connection.close();

                // Display success message
                out.println("<p>Student registered successfully.</p>");

            } catch (SQLException e) {
                out.println("<p>Error: " + e.getMessage() + "</p>");
            }
        }
    %>

    <!-- View Data from Database -->
    <h3>View Students</h3>
    <%
        try {
            // Establish the database connection
            String jdbcUrl = "jdbc:mysql://localhost:3306/db";
            String dbUser = "root";
            String dbPassword = "root";
            Connection connection = DriverManager.getConnection(jdbcUrl, dbUser, dbPassword);

            // Retrieve and display data from the database
            String selectQuery = "SELECT * FROM data";
            try (Statement statement = connection.createStatement();
                 ResultSet resultSet = statement.executeQuery(selectQuery)) {

                out.println("<table border='1'>");
                out.println("<tr><th>Registration Number</th><th>Name</th></tr>");

                while (resultSet.next()) {
                    String regNoFromDB = resultSet.getString("regno");
                    String nameFromDB = resultSet.getString("name");

                    out.println("<tr><td>" + regNoFromDB + "</td><td>" + nameFromDB + "</td></tr>");
                }

                out.println("</table>");
            }

            // Close the database connection
            connection.close();

        } catch (SQLException e) {
            out.println("<p>Error: " + e.getMessage() + "</p>");
        }
    %>

</body>
</html>
