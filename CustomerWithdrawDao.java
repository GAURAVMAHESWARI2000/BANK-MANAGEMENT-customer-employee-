import java.sql.Connection;
import javax.swing.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

public class CustomerWithdrawDao {
	public static void updateBalance(int CID,int amount)throws Exception{
		Connection con = DB.getConnection();
		PreparedStatement st = con.prepareStatement	("SELECT * FROM PAGE3 WHERE CUSTOMERID=?");	
		st.setInt(1,CID);
		ResultSet rs= st.executeQuery();
		rs.next();
		int balance=rs.getInt("BALANCE");
		if(amount>balance) {
			JOptionPane.showMessageDialog(null,"UNAVAILABLE AMOUNT . CURRENT BALANCE= "+balance);
			CustomerWithdraw.lain(CID);
		}
		else {
		int Amount=balance-amount;
		st = con.prepareStatement("update PAGE3 set BALANCE=? where CUSTOMERID=?"); 
		st.setInt(1,Amount);
		st.setInt(2,CID);
		int i=st.executeUpdate();
		st = con.prepareStatement("update PAGE3 set LAST_TRANSACTION=? where CUSTOMERID=?"); 
		st.setInt(1,-amount);
		st.setInt(2,CID);
		i=st.executeUpdate();
		JOptionPane.showMessageDialog(null,"TRANSACTION SUCCESSFULL . CURRENT BALANCE= "+Amount);
	    CustomerSuccess.lain(CID);
		}
  }
}