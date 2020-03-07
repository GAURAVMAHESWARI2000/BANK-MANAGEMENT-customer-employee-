import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CustomerSuccess extends JFrame{
	JLabel l;
	JButton b1,b2,b3,b4,b5,b6; 
	int C;
	public CustomerSuccess(int CID) {
		C=CID;
		l=new JLabel("WELCOME ");
		b1=new JButton ("DEPOSIT");
		b2=new JButton ("WITHDRAW");
		b3=new JButton ("CHECK BALANCE");
		b4=new JButton ("LAST TRANSACTON");
		b5=new JButton ("CHANGE PASSSWORD");
		b6=new JButton ("QUIT");
		setLayout(null);
		l.setBounds(50,20,300,30);
		b1.setBounds(50,60,300,30);
		b2.setBounds(50,100,300,30);
		b3.setBounds(50,140,300,30);
		b4.setBounds(50,180,300,30);
		b5.setBounds(50,220,300,30);
		b6.setBounds(50,260,300,30);
		
		b1.addActionListener(new myhandler());
		b2.addActionListener(new myhandler());
	    b3.addActionListener(new myhandler());    
		b4.addActionListener(new myhandler());    
		b5.addActionListener(new myhandler());  
		b6.addActionListener(new myhandler());

		
	    add(l); add(b1); add(b2); add(b3); add(b4); add(b5); add(b6); 
	}
	class myhandler implements ActionListener{
        	  public void actionPerformed (ActionEvent e) {
        	         if(e.getSource()==b1) {
        			    CustomerDeposit.lain(C);
        			    dispose();
        		  }
        	        
        	         if(e.getSource()==b2) {
         			    CustomerWithdraw.lain(C);
         			    dispose();
         		  }
        		
        		      if(e.getSource()==b3) {
  						try {
							ShowBalance.lain(C);
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
        			    dispose();   
        		    }   
        		      if(e.getSource()==b4) {
        			  try {
						LastTransaction.lain(C);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
        			  dispose();
        		  }
        		      if(e.getSource()==b5) {
  						UpdatePassword.lain(C);
        			  dispose();
        		  }
        		      if(e.getSource()==b6) {
        		    	  CustomerLogin.main(new String[]{});
            			  dispose();
            		  }  
        		   
          }
          }
	public static void lain(int CID) {
		CustomerSuccess ES =new CustomerSuccess(CID);
		ES.setSize(400, 400);
		ES.setVisible(true);
		ES.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	}
	
