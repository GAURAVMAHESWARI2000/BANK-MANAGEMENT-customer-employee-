import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class UpdatePassword extends JFrame{
	JLabel l1,l2;
	JTextField t;
	JButton b1,b2; 
	int C;
	public UpdatePassword(int CID) {
		C=CID;
		l1=new JLabel("WELCOME");
		l2=new JLabel("ENTER NEW PASSWORD");
		t=new JTextField();
		b1=new JButton ("BACK");
		b2=new JButton ("SUBMIT");
		setLayout(null);
		
		l1.setBounds(50,20,300,30);
		l2.setBounds(20,60,100,20);
		t.setBounds(130,60,100,20);
		b1.setBounds(30,120,100,20);
		b2.setBounds(140,120,100,20);
		b1.addActionListener(new myhandler());
		b2.addActionListener(new myhandler());
		add(l1); add(l2); add(t); add(b1); add(b2); 
	}
	class myhandler implements ActionListener{
        	  public void actionPerformed (ActionEvent e){
        		   if(e.getSource()==b1) {
        			  CustomerSuccess.lain(C);
        		      dispose();
        		  }
        		  if(e.getSource()==b2) {
        			  String pass=t.getText();
        			  try {
						UpdatePasswordDao.updatePassword(C,pass);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
        			 JOptionPane.showMessageDialog(null,"PASSWORD UPDATED SUCCESSFULLY");
        			 CustomerSuccess.lain(C); 
        			 dispose();
        		  }
              }
          }
	public static void lain(int CID) {
		UpdatePassword E =new UpdatePassword(CID);
		E.setSize(400, 400);
		E.setVisible(true);
		E.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	}
	
