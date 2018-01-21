package userInterface;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySQLAccess {
	private Connection connect = null;
	private Statement statement = null;
	private ResultSet resultSet = null;

	public String readDataBase(String roomNo) throws Exception {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager.getConnection("jdbc:mysql://localhost/ruet?" + "user=root&password=");

			statement = connect.createStatement();
			resultSet = statement.executeQuery("select * from students where room_no="+ roomNo);
			String result= "<html>";
			while (resultSet.next()){
				result+="<br/><br/>";
				result+="Name: "+resultSet.getString("name");
				result+=", Roll: "+resultSet.getString("roll_no");
				result+=", Dept: "+resultSet.getString("dept");
			};
			connect.close();
			statement.close();
			resultSet.close();
			if (result=="<html>") {
				return "no one lives in room no: "+roomNo;
			}
			else
				return result+"</html>";
		} catch (Exception e) {
			throw e;
		}
	}
}
