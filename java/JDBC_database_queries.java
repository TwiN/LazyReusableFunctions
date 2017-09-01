import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDBSelect {

	public static final String DB_NAME = "testdb";
	public static final String DB_URL = "jdbc:mysql://localhost:3306/" + DB_NAME + "?useSSL=false"; //?autoreconnect=true
	public static final String DB_USER = "root";
	public static final String DB_PASS = "root";
	
	
	public static void main(String[] args) throws SQLException {
		Connection connection = null;
		Statement statement = null;
		ResultSet rs = null;

		try {
			connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
			statement = connection.createStatement();
			rs = statement.executeQuery("SELECT * FROM employees");
			
			while (rs.next()) {
				System.out.println(rs.getString("last_name") + " " + rs.getString("first_name"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null) { rs.close(); }
			if (statement != null) { statement.close(); }
			if (connection != null) { connection.close(); }
		}
	}
}







import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDBInsert {

	public static final String DB_NAME = "testdb";
	public static final String DB_URL = "jdbc:mysql://localhost:3306/" + DB_NAME + "?useSSL=false"; //?autoreconnect=true
	public static final String DB_USER = "root";
	public static final String DB_PASS = "root";
	

	/**
	 * Uses Statement
	 */
	public static void insertUsingStatement() throws SQLException {
		Connection connection = null;
		Statement statement = null;
		ResultSet rs = null;
		try {
			connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
			statement = connection.createStatement();
			statement.executeUpdate("INSERT INTO employees (last_name, first_name, email, department, salary)"
					+ " VALUES ('test', 'test', 'test', 'test', 50000)");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null) { rs.close(); }
			if (statement != null) { statement.close(); }
			if (connection != null) { connection.close(); }
		}
		
	}
	
	/**
	 * Uses PreparedStatement
	 */
	public static void insertUsingPreparedStatement() throws SQLException {
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet rs = null;

		try {
			connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
			statement = connection.prepareStatement("INSERT INTO employees (last_name, first_name, email, department, salary) VALUES (?, ?, ?, ?, ?)");
			
			statement.setString(1, "Elvis");
			statement.setString(2, "Presley");
			statement.setString(3, "elvis@rock.com");
			statement.setString(4, "Musique");
			statement.setFloat(5, 88888.88f);
			
			statement.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null) { rs.close(); }
			if (statement != null) { statement.close(); }
			if (connection != null) { connection.close(); }
		}
	}
}








import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class TestDBUpdate {

	public static final String DB_NAME = "testdb";
	public static final String DB_URL = "jdbc:mysql://localhost:3306/" + DB_NAME + "?useSSL=false"; //?autoreconnect=true
	public static final String DB_USER = "root";
	public static final String DB_PASS = "root";
	
	
	public static void main(String[] args) throws SQLException, IOException {
		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet rs = null;
		InputStream fis = null;

		try {
			connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
			statement = connection.prepareStatement("UPDATE employees SET resume=? WHERE email=?");
			
			statement.setString(2, "john.doe@foo.com");
			
			File resume = new File("cv.txt");
			fis = new FileInputStream(resume);
			statement.setBinaryStream(1, fis);
			
			statement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null) { rs.close(); }
			if (statement != null) { statement.close(); }
			if (connection != null) { connection.close(); }
			if (fis != null) { fis.close(); }
		}
	}

}




