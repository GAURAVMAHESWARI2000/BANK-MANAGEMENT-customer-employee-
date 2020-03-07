import java.sql.*;

import javax.swing.JOptionPane;

public class CustomerDepositDao {
	public static void updateBalance(int CID,int amount)throws Exception{
		Connection con = DB.getConnection();
		PreparedStatement st = con.prepareStatement	("SELECT * FROM PAGE3 WHERE CUSTOMERID=?");	
		st.setInt(1,CID);
		ResultSet rs= st.executeQuery();
		rs.next();
		int balance=rs.getInt("BALANCE");
		int Amount=balance+amount;
		st = con.prepareStatement("update PAGE3 set BALANCE=? where CUSTOMERID=?"); 
		st.setInt(1,Amount);
		st.setInt(2,CID);
		int i=st.executeUpdate();
		st = con.prepareStatement("update PAGE3 set LAST_TRANSACTION=? where CUSTOMERID=?"); 
		st.setInt(1,amount);
		st.setInt(2,CID);
		i=st.executeUpdate();
		JOptionPane.showMessageDialog(null,"SUCCESSFULL DEPOSIT . CURRENT BALANCE= "+Amount);
		CustomerSuccess.lain(CID);
	}
}