package authentication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DataBaseDao {
	
	public boolean addNew(String name, String email, String phone, String team, String state, String password) {
		String gname=name;
		String gemail=email;
		String gphone = phone;
		String gteam = team;
		String gstate = state;
		String gpassword = password;
		try {
			String url="jdbc:mysql://localhost:3306/student";
			String uname="root";
			String pass="1234";
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, uname, pass);
			String sql = "insert into register (name,email,phone, team, state, password) values(?,?,?,?,?,?);";
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, gname);
			st.setString(2, gemail);
			st.setString(3, gphone);
			st.setString(4, gteam);
			st.setString(5, gstate);
			st.setString(6, gpassword);
			int count = st.executeUpdate();
			if(count>0) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean login(String login_email, String login_password) {
		String lemail=login_email;
		String lpass=login_password;
	    
		
		
		try {
			String url="jdbc:mysql://localhost:3306/student";
			String DBname="root";
			String DBpass="1234";
			String sql="select * from register where email=? and password=?;";
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, DBname, DBpass);
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, lemail);
			st.setString(2, lpass);
			ResultSet rs = st.executeQuery();
			if(rs.next()) {
				return true;
			}
			} catch (Exception e) {
						e.printStackTrace();
		}
		
		
		
		return false;
	}
	
	public boolean delete(String delete_email) {
		String demail=delete_email;
		try {
			String url="jdbc:mysql://localhost:3306/student";
			String uname="root";
			String pass="1234";
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, uname, pass);
			String sql = "delete from register where email=?;";
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, demail);
			int count = st.executeUpdate();
			if(count>0) {
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return false;
	}

}
