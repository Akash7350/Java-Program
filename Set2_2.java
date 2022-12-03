import java.sql.*;
import java.io.*;

class Set2_2
{
	public static void main(String[] args)
	{	
		int id,choice;
		ResultSet rs;
		String name,name;
		boolean flag=false;
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			Class.forName("org.postgresql.Driver");
		Connection con=DriverManager.getConnection("jdbc:postgresql:sycyber09","postgres","postgres");
		System.out.println("Connection Successful");
		Statement st=con.createStatement();
		rs=st.executeQuery("Select * from student");

		PreparedStatement st1;
		do{
			System.out.println("\n1. Add student\n2. Delete student\n3. Update student\n4. View all statement\n5. Exit");
			System.out.println("Enter your choice:");
			choice=Integer.parseInt(br.readLine());
		switch(choice)
		{
			case 1 : System.out.println("Enter student id and name: ");
				 id=Integer.parseInt(br.readLine());
				 name=br.readLine();
				 rs.updateInt(1,id);
				 rs.updateString(2,name);
				 rs.insertRow();
				 System.out.println("Record inserted successfully.");
				 break;
		}
		}
		if(flag=false)
			System.out.println("Record with given student id not present");
	}
	else
		System.out.println("No records in student table.");
	break;

	if(rs.first())
	{
		System.out.println(rs.getInt(1)+" "+rs.getString(2));
	}
	else
		System.out.println("No record to display");
	break;

	case 5 :	rs.close();
			st.close();
			con.close();
			System.exit(0);

		default : System.out.println("Wrong option..");
}
}
while(choice>=5);
}
}
:
