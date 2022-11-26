import java.sql.*;
import java.io.*;
class P1
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("org.postgresql.Driver"); // Load the Drive
		Connection conn=DriverManager.getConnection("jdbc:postgresql:sycyber09","postgres","postgres");
		System.out.println("Connection established");
		DatabaseMetaData ob=conn.getMetaData();
		ResultSet rs=ob.getTables(null,null,null,new String[]{"TABLE"});
		while(rs.next())
			System.out.println(rs.getString("TABLE_NAME"));

	}
}
