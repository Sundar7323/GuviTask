package jattask12;
import java.sql.*;

public class jdbctask12 {

	public static void main(String[] args) throws SQLException {
		String URL="jdbc:mysql://localhost:3306/Guvitask12";
		String uname="root";
		String pass="Sundar@007";
	
		//Creating a connection to Database
		Connection con=DriverManager.getConnection(URL, uname, pass);
		//Creating a statement object
		Statement s=con.createStatement();
		//inserting row 1 
		s.executeUpdate("insert into taskemp values(101,'Jenny',25,10000)");
		//inserting 2nd row
		s.executeUpdate("insert into taskemp values(102,'Jacky',30,20000)");
		//inserting 3rd row
		s.executeUpdate("insert into taskemp values(103,'Joe',25,40000)");
		//inserting 4th row
		s.executeUpdate("insert into taskemp values(104,'John',40,80000)");
		//inserting 5th row
		s.executeUpdate("insert into taskemp values(105,'Shameer',25,90000)");
		con.close();
	}
}
