import java.sql.*;
public class Driver {

	public static void main(String[] args) {
		try {
			
			String url = "jdbc:mysql://localhost:3306/demo";
			String uname = "root";
			String pass = "";
			String query = "select * from employee";
			// Get a connection to database
			Connection myConn = DriverManager.getConnection(url, uname, pass);
			
			// Create a statement 
			Statement myStat = myConn.createStatement();
			
			// Execute SQL query
			ResultSet myRs = myStat.executeQuery(query);
			
			// Process the result set
			while(myRs.next()) {
				System.out.println(myRs.getString("last_name") + ", "+ myRs.getString("first_name"));
			}
			
			
			myStat.close();
			myConn.close();

		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
