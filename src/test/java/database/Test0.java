package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.cj.jdbc.Driver;

public class Test0 {
	@Test
	public void db() throws SQLException {
		// Step:1 Register the database
		Driver driverref = new Driver();
		DriverManager.registerDriver(driverref);

//step:2 connect to database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wpam1", "root", "root");

//Step:3 create sql query statement
		Statement statement = con.createStatement();
		String query = "select * from testtable";

//Step:4 execute query
		ResultSet res = statement.executeQuery(query);
		while (res.next()) {
			System.out.println(res.getString(1));
			System.out.println(res.getString(2));
		}

//Step:5 close the connection
		con.close();

	}

}
