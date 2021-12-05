package gymmanage;

import java.sql.*;
import java.util.ArrayList;
import java.util.List; 
public class UserDao {
	public static Connection getConnection(){  
	    Connection con=null;  
	    try{  
	        Class.forName("com.mysql.jdbc.Driver");  
	        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gym","root","");  
	    }catch(Exception e){System.out.println(e);}  
	    return con;  
	}  
	public static int save(User u){  
	    int status=0;  
	    try{  
	        Connection con=getConnection();  
	        PreparedStatement ps=con.prepareStatement("insert into users(fullname,username,age,country,password) values(?,?,?,?,?)");  
	        ps.setString(1,u.getFullname());  
	        ps.setString(2,u.getUsername());  
	        ps.setString(3, u.getAge());  
	        ps.setString(4,u.getCountry());  
	        ps.setString(5,u.getPassword());  
	        status=ps.executeUpdate();  
	    }catch(Exception e){System.out.println(e);}  
	    return status;  
	}  
	public static int update(User u){  
	    int status=0;  
	    try{  
	        Connection con=getConnection();  
	        PreparedStatement ps=con.prepareStatement("update users set fullname=?,username=?,age=?,country=?,password=? where id=?");  
	        ps.setString(1,u.getFullname());    
	        ps.setString(2, u.getUsername());  
	        ps.setString(4,u.getAge());  
	        ps.setString(5,u.getCountry()); 
	        ps.setString(6,u.getPassword());
	        ps.setInt(7,u.getId());  
	        status=ps.executeUpdate();  
	    }catch(Exception e){System.out.println(e);}  
	    return status;  
	}  
	public static int delete(User u){  
	    int status=0;  
	    try{  
	        Connection con=getConnection();  
	        PreparedStatement ps=con.prepareStatement("delete from users where id=?");  
	        ps.setInt(1,u.getId());  
	        status=ps.executeUpdate();  
	    }catch(Exception e){System.out.println(e);}  
	  
	    return status;  
	}  
	public static List<User> getAllRecords(){  
	    List<User> list=new ArrayList<User>();  
	      
	    try{  
	        Connection con=getConnection();  
	        PreparedStatement ps=con.prepareStatement("select * from users");  
	        ResultSet rs=ps.executeQuery();  
	        while(rs.next()){  
	            User u = new User();  
	            u.setId(rs.getInt("id"));  
	            u.setFullname(rs.getString("fullname"));  
	            u.setUsername(rs.getString("username"));  
	            u.setAge(rs.getString("age"));  
	            u.setCountry(rs.getString("country")); 
	            u.setPassword(rs.getString("password"));  
	            list.add(u);  
	        }  
	    }catch(Exception e){System.out.println(e);}  
	    return list;  
	}  
	public static User getRecordById(int id){  
		  User u= null;   
	    try{  
	        Connection con= getConnection();  
	        PreparedStatement ps=con.prepareStatement("select * from users where id=?");  
	        ps.setInt(1, id);  
	        ResultSet rs=ps.executeQuery();  
	        while(rs.next()){  
	         User user=new User(); 
	            user.setId(rs.getInt("id"));  
	            user.setFullname(rs.getString("fullname"));  
	            user.setUsername(rs.getString("username"));  
	            user.setAge(rs.getString("age"));  
	            user.setCountry(rs.getString("country"));  
	            user.setPassword(rs.getString("password")); 
	        }  
	    }catch(Exception e){System.out.println(e);}  
	    return u;  
	}  
	public boolean  checkValidity(String username,String password)

	{
		Connection con=getConnection();
PreparedStatement ps =null;
		String query="SELECT * FROM users WHERE username= ? AND password= ?";
		try {
			 ps=con.prepareStatement(query);
			 ps.setString(1,username);
			 ps.setString(2,password);
			 ResultSet rs=ps.executeQuery();
			 if(rs.next())
			 {
			return true;	 
			 }
			 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	public String insert(User user) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
