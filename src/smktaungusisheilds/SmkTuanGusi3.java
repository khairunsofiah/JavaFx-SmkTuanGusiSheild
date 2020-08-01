/*
NAME : KHAIRUN SOFIAH BINTI JUMAN
MATRIC NO : BI19160318
THIS PAGE WILL APPEAR WHEN THE USER ALREADY CLICK THE BUTTON START ASSESSMENT.
THE USER JUST CLIK THE BUTTON CHECKBOX TO ANSWER THE QUESTION
 */
package smktaungusisheilds;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//Implementation  class concept oop
public class SmkTuanGusi3  implements ActionListener{
    
  // Implementation of Encapsulation concept OOP 
  private JFrame myFrame3 = new JFrame("SMK TAUN GUSI SHIELD");
  public JLabel label1 = new JLabel();
  public JLabel quest1 = new JLabel();
  public Checkbox checkbox1 = new Checkbox();
  public Checkbox checkbox2 = new Checkbox();
  public Checkbox checkbox3 = new Checkbox();
  public Checkbox checkbox4 = new Checkbox();
  public Checkbox checkbox5 = new Checkbox();
  public Checkbox checkbox6 = new Checkbox();
  public Checkbox checkbox7 = new Checkbox();
  public Checkbox checkbox8 = new Checkbox();
  public JButton button = new JButton ("NEXT");
   
       
   
   SmkTuanGusi3(){  
                
                //Frame
                myFrame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame3.setBounds(300, 90, 600, 600);
		myFrame3.setVisible(true);
                myFrame3.getContentPane().setLayout(null);
                
                //title front of page
                label1 = new JLabel("Screening Questions");
                label1.setBounds(10,20,150,50);
                label1.setForeground(Color.BLUE);
                label1.setFont (label1.getFont ().deriveFont (15.0f));
                myFrame3.getContentPane().add(label1);
                
                //Question No.1
               quest1 = new JLabel("1. Do you have any of the following new or worsening symptoms or signs? ");
               quest1.setBounds(10,50,450,50);
               myFrame3.getContentPane().add(quest1);
               checkbox1 = new Checkbox("New or worsening cough");  
               checkbox1.setBounds(50,100, 500,50);  
               myFrame3.getContentPane().add(checkbox1); 
               checkbox2 = new Checkbox("Shortness of breath");  
               checkbox2.setBounds(50,140, 500,50);  
               myFrame3.getContentPane().add(checkbox2); 
               checkbox3 = new Checkbox("Sore throat");  
               checkbox3.setBounds(50,180, 500,50);  
               myFrame3.getContentPane().add(checkbox3); 
               checkbox4 = new Checkbox("Runny nose, sneezing or nasal congestion ");  
               checkbox4.setBounds(50,220, 500,50);  
               myFrame3.getContentPane().add(checkbox4);
               checkbox4 = new Checkbox("Hoarse voice");  
               checkbox4.setBounds(50,260, 500,50);  
               myFrame3.getContentPane().add(checkbox4); 
               checkbox5 = new Checkbox("Difficulty swallowing");  
               checkbox5.setBounds(50,300, 500,50);  
               myFrame3.getContentPane().add(checkbox5); 
               checkbox6 = new Checkbox("New smell or taste disorder(s)");  
               checkbox6.setBounds(50,350,500,50);  
               myFrame3.getContentPane().add(checkbox6); 
               checkbox7 = new Checkbox("Headache");  
               checkbox7.setBounds(50,400,500,50);  
               myFrame3.getContentPane().add(checkbox7); 
               checkbox8 = new Checkbox("No all above ");  
               checkbox8.setBounds(50,450,500,50);  
               myFrame3.getContentPane().add(checkbox8);
               
               //next quuestion button
                button.addActionListener(this);
                button.setBounds(50,500,100,25);
                myFrame3.getContentPane().add(button);
   }    
                 @Override
           
                
   
       public void actionPerformed(ActionEvent ae){
         myFrame3.dispose();
         new SmkTuanGusi4();            
                     
          }
     
      //Drive code
      public static void main(String[] args) {
        
       new SmkTuanGusi3();
   }
}
