package jdbcconnectivityexercise;
import java.sql.*;

public class Jdbc {

	public static void main(String[] args) throws Exception {
		insertrecords();
	/*	
	 * Reading from SQL DB
	 * String URL="jdbc:mysql://localhost:3306/guvijat10";
		String uname="root";
		String pass="Sundar@007";
		String query="Select * from crediantials";
		Connection con=DriverManager.getConnection(URL, uname, pass);
		
		//Creating statement object
	Statement s=con.createStatement();
		
		//Executing a query on a statement =It will return Result Set
		ResultSet rs=s.executeQuery("query");
		rs.next(); //Go to the next record, as it points to the record before the first record
		
		//Reading the values from ResultSet using getString method
		String username=rs.getString("username");
		String password=rs.getString("password");
		
		System.out.println(username);
		System.out.println(password);*/
	}
	//Insert a single row 
	public static void insertrecords() throws Exception{
		String URL="jdbc:mysql://localhost:3306/guvijat10";
		String uname="root";
		String pass="Sundar@007";
		String query="insert into Taskemp values(104,'Jenny',30,10000)";
		String query2="insert into Taskemp values(105,'mukesh',30,10000)";
		Connection con=DriverManager.getConnection(URL, uname, pass);
		Statement s=con.createStatement();
		int rows=s.executeUpdate(query);
		int rows2=s.executeUpdate(query2);
		System.out.println("No. of rows affected: " +rows);
		con.close();
		
	}
	public static void insertvar() throws Exception{
		String URL="jdbc:mysql://localhost:3306/guvijat10";
		String uname="root";
		String pass="Sundar@007";
		int empcode=102;
		String empname="Sundar";
		int empage=23;
		int esalary=23999;
		
		String query = "insert into Taskemp values("+ empcode +",'" + empname + "',"  + empage + "," + esalary +");";  
		Connection con=DriverManager.getConnection(URL, uname, pass);
		Statement s=con.createStatement();
		int rows=s.executeUpdate(query);
		System.out.println("No. of rows affected: " +rows);
		con.close();
		
	}
	//Insert Using Prepared Statement(pst)
	public static void insertusingpst() throws Exception{
		String URL="jdbc:mysql://localhost:3306/guvijat10";
		String uname="root";
		String pass="Sundar@007";
		int empcode=103;
		String empname="Mukesh";
		int empage=24;
		int esalary=23000;
		
		String query = "insert into Taskemp values(?,?,?,?);";  
		Connection con=DriverManager.getConnection(URL, uname, pass);
		PreparedStatement pst=con.prepareStatement(query);
		pst.setInt(1, empcode);  //(1 - incicates which questionmark, empcode indicates what needs to be there)
		pst.setString(2, empname);
		pst.setInt(3, empage);
		pst.setInt(4, esalary);
		int rows=pst.executeUpdate(); //it will return no of rows so storing in int rows
		System.out.println("No. of rows affected: " +rows);
		
	
		con.close();
		
	}

}
