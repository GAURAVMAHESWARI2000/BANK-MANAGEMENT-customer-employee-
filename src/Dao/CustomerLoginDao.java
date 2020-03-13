package Dao;
import models.*;
import java.sql.*;
import DATABASE.*;
import javax.swing.*;

public class CustomerLoginDao {
	public static void login (int CID,String pass) throws Exception{
		Connection con = DB.getConnection();
		Statement ks=con.createStatement();
		ResultSet rs=ks.executeQuery("SELECT *FROM PAGE1");
		int a=0;
		while(rs.next()) {
			a=rs.getInt(1);
			if(a==CID)  break;
		}
		if(a==CID) {
		PreparedStatement st =con.prepareStatement("SELECT * FROM PAGE1 WHERE CUSTOMERID=?");
		st.setInt(1,CID);
		rs = st.executeQuery();
		rs.next();
		String password = rs.getString("PASSWORD");
		  if(pass.equals(password)) {
			  CustomerSuccess.lain(CID);
		  }
		  else {
			  JOptionPane.showMessageDialog(null,"ENTER CORRECT PASSWORD");
			  CustomerLogin.main(new String[] {}); 			  }
	      }
	 
	 else  {
		  JOptionPane.showMessageDialog(null,"ENTER CORRECT CUSTOMERID");
		  CustomerLogin.main(new String[] {}); 			  }
     }
}