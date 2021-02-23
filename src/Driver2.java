import java.sql.*;
public class Driver2 {

	public static void main(String[] args) throws Exception {
		try {
			
			String url = "jdbc:mysql://localhost:3306/demo";
			String uname = "root";
			String pass = "";
			String query = "insert into employee values (?,?,?,?)";
			int emp_id = 106;
			String first_name = "Ash";
			String last_name = "Lee";
			int age = 18;
			// Get a connection to database
			Connection myConn = DriverManager.getConnection(url, uname, pass);
			
			// Create a statement 
			PreparedStatement myStat = myConn.prepareStatement(query);
			myStat.setInt(1, emp_id);
			myStat.setString(2, first_name);
			myStat.setString(3, last_name);
			myStat.setInt(4, age);
			int count = myStat.executeUpdate();
			System.out.println(count + " row(s) affected");
			
			myStat.close();
			myConn.close();
			
		

	}
		catch(Exception e) {
			System.out.println(e);
		}
		}

}
