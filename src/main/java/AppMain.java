import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://10.100.4.113:3306/javacoe_pool", "javacoe", "admin@123");
		
		Statement s=con.createStatement();
		ResultSet rs=s.executeQuery("select * from student");
		System.out.println(rs.getRow());
		//while(rs.next()) {
		//System.out.println("-----------"+rs.getString(2)+"----------"+rs.getString(3));
		//}
		s.close();
		rs.close();
		con.close();
	}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}