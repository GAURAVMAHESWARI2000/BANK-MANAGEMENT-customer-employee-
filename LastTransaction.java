import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import javax.swing.*;

public class LastTransaction extends JFrame{
	JLabel l1,l2;
	JButton b1; 
	int C;
	public LastTransaction(int CID,int last_transaction) {
		C=CID;
		l1=new JLabel("WELCOME");
		l2=new JLabel("YOUR LAST TRANSACTON IS : "+last_transaction);
		b1=new JButton ("BACK");
		setLayout(null);
		l1.setBounds(50,20,300,30);
		l2.setBounds(20,60,380,20);
		b1.setBounds(30,120,100,20);
		b1.addActionListener(new myhandler());
		add(l1);add(l2);add(b1);
	}
	class myhandler implements ActionListener{
        	  public void actionPerformed (ActionEvent e){
        		   if(e.getSource()==b1) {
        			  CustomerSuccess.lain(C);
        		      dispose();
        		  }
        		 
              }
          }
	public static void lain(int CID) throws Exception{
		Connection con = DB.getConnection();
		PreparedStatement st = con.prepareStatement	("SELECT * FROM PAGE3 WHERE CUSTOMERID=?");	
		st.setInt(1,CID);
		ResultSet rs= st.executeQuery();
		rs.next();
		int last_transaction=rs.getInt("LAST_TRANSACTION");
		LastTransaction E =new LastTransaction(CID,last_transaction);
		E.setSize(400, 400);
		E.setVisible(true);
		E.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	}
	