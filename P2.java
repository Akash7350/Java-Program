import java.sql.*;
import java.io.*;
class P2
{
	public static void main(String[] args)throws Exception
	{
		int id;
		ResultSet rs;
		String name;
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		Class.forName("org.postgresql.Driver");
		Connection con=DriverManager.getConnection("jdbc:postgresql:sycyber09","postgres","postgres");
		System.out.println("Connection Established");
		Statement st=con.createStatement();
		preparedStatement st1;
		if(args.length!=1)
		{
			System.out.println("Insufficient argument or more on of arguments..);"
			System.exit(0);
		}
		switch(args[0])
		{
			case "i" : System.out.println("Enter Student Id and Name: ");
					id=Integer.parseInt(br.readLine());
					name=br.readLine();
					st.executeUpdate("Insert into student values("+id+", '"+name+"')");
					System.out.println("Record inserted successfully. ");
					break;
					
			case "v" : rs=st.executeQuery("Select * from student");
				   System.out.println("id      name");
				   while(rs.next())
				   	System.out.println(rs.getInt(I)+" "+rs.getString(2));
				   break;
			case "u" : System.out.println("Enter Student Id number for update: ");
				   id=Integer.parseInt(br.readLine());
			           st1=con.prepareStatement("Update Student set sname=? where id=?");
			           st1.setInt(1,id);
			           rs=st1.executeQuery();
			           if(rs.next())
			           {
			           	System.out.println("Record found");
			           	System.out.println("Enter name to modify: ");
			           	name=br.readLine();
			           	st1=con.prepareStatement("Update Student set sname=? where id=?");
			                st1.setString(2,id);
			                rs=st1.executeUpdate();
			                System.out.println("Record update successfully. ");
			                break;
			             }
			             else
			             	System.out.println("Record not found");
			             break;
			             
		   case "d" : System.out.println("Enter Student Id number for delete: ");
				   id=Integer.parseInt(br.readLine());
			           st1=con.prepareStatement("select * from student where id=?");
			           st1.setInt(1,id);
			           rs=st1.executeQuery();
			           if(rs.next())
			           {
			           	(System.out.println("Record found");
			           	st1=con.prepareStatement("Delete from student where id=?");
			           	st1.setInt(1,id);
			           	rs.st1.executeUpdate();
			           	System.out.println("Record deleted successfully" );
			           	if(rs.next())
			           		System.out.println("Record found");
			                else
			                	System.out.println("Record not found");
			                break;
			                
		   
			           	
			           	
			          
	}
}
