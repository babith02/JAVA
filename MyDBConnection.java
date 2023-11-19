import java.sql.*;
public class MyDBConnection{
public static void main(String args[]) {
try {
System.out.println("START");
Class.forName("com.mysql.jdbc.Driver");
System.out.println("after class");
Connection con= DriverManager.getConnection("jdbc:mysql://localhost/db?" +
"user=root&password=root");
Statement stmt = null;
ResultSet rs = null;
stmt = con.createStatement();
System.out.println("After stmt");
rs = stmt.executeQuery("SELECT * FROM data");
while(rs.next())
System.out.println(rs.getInt(1)+" "+rs.getString(2));
con.close();
} catch (Exception e) {
System.out.println(e);
}
}
}