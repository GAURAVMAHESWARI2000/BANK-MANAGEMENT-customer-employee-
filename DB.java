import java.sql.*;

public class DB {
	public static Connection getConnection() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","Gaurav.0964");
		return con;
	}
	
}
