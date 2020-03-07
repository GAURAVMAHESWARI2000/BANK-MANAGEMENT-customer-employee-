import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class UpdateInformation extends JFrame{
	
	JLabel l;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9; 
	public UpdateInformation() {
		b1=new JButton ("NAME");
		b2=new JButton ("SURNAME");
		b3=new JButton ("FATHER");
		b4=new JButton ("DOB");
		b5=new JButton ("GENDER");
		b6=new JButton ("EMAIL");
		b7=new JButton ("ADDRESS");
		b8=new JButton ("CITY");
		b9=new JButton("BACK");
		l=new JLabel("SELECT TO UPDATE");
		setLayout(null);
		
		l.setBounds(130,20,300,20);
		b1.setBounds(50,50,300,30);
		b2.setBounds(50,90,300,30);
		b3.setBounds(50,130,300,30);
		b4.setBounds(50,170,300,30);
		b5.setBounds(50,210,300,30);
		b6.setBounds(50,250,300,30);
		b7.setBounds(50,290,300,30);
		b8.setBounds(50,330,300,30);
	    b9.setBounds(50,370,300,30);
	    
		b1.addActionListener(new myhandler());
		b2.addActionListener(new myhandler());
	    b3.addActionListener(new myhandler());    
		b4.addActionListener(new myhandler());    
		b5.addActionListener(new myhandler());
		b6.addActionListener(new myhandler());
	    b7.addActionListener(new myhandler());    
		b8.addActionListener(new myhandler());
	    b9.addActionListener(new myhandler());
		add(b1); add(b2); add(b3); add(b4); add(b5); add(b6); add(b7); add(b8);add(l);add(b9);
	}
	    class myhandler implements ActionListener{
        	 public void actionPerformed (ActionEvent e) {
        		      if(e.getSource()==b1) {
        			  UpdateName.main(new String[]{});
        			  dispose();
        		  }
        		      if(e.getSource()==b2) {
            			  UpdateSurname.main(new String[]{});
        			  dispose();
        		  }
        		      if(e.getSource()==b3) {
            			  UpdateFatherName.main(new String[]{});
        			  dispose();   
        		  }   
        		      if(e.getSource()==b4) {
          			  UpdateDOB.main(new String[]{});
        			  dispose();
        		  }
        		      if(e.getSource()==b5) {
          			  UpdateGender.main(new String[]{});
            			  dispose();
                  }
            	      if(e.getSource()==b6) {
          			  UpdateEmail.main(new String[]{});
            			  dispose();
            	  }
          		      if(e.getSource()==b7) {
            		  UpdateAddress.main(new String[]{});
            			  dispose();   
            	  }   
        		      if(e.getSource()==b8) {
            			  UpdateCity.main(new String[]{});
            			  dispose();
           		  }
        		      if(e.getSource()==b9) {
       		              EmployeeSuccess.main(new String[]{});
       		              dispose();   
       	         }  
        	 }
	    }
        		  
          
	
	public static void main(String [] args) {
		UpdateInformation ES =new UpdateInformation();
		ES.setSize(400, 450);
		ES.setVisible(true);
		ES.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	}
	
