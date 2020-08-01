/*
NAME : KHAIRUN SOFIAH BINTI JUMAN
MATRIC NO : BI19160318
THIS PAGE WILL APPEAR WHEN THE USER ALREADY LOGIN FROM THIS SYSTEM.
THE USER JUST HAVE TO CLICK THE BUTTON FOR START THE ASSESSMENT.
 */
package smktaungusisheilds;
 import java.awt.*;
 import java.awt.event.*;
 import javax.swing.*;

//Implementation  class concept oop
public class SmkTuanGusi2  implements ActionListener {
    
    // Implementation of Encapsulation concept OOP   
         private  JPanel panel = new JPanel();
         public  JFrame myFrame2 = new JFrame("SMK TAUN GUSI SHIELD");
         public  JLabel hello = new JLabel();
         public  JLabel welcome = new JLabel();
         public  JLabel staysave = new JLabel();
         public  JLabel click = new JLabel();
         public  JButton button = new JButton ("Please take COVID-19 Screening Tool ");
         public  JLabel message = new JLabel();
     
    
         SmkTuanGusi2(){
           
                //Frame
                myFrame2.add(panel);
		myFrame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                myFrame2.setBounds(300, 90, 500, 300);
                myFrame2.getContentPane().setLayout(null);
		myFrame2.setVisible(true); 
                
                //title front of page
                hello = new JLabel("Hello There, Welcome to SMK TAUN GUSI Shield");
                welcome = new JLabel("Please Stay Safe and #KitaJagaKita");
                hello.setForeground(Color.GREEN);
                welcome.setForeground(Color.GREEN);
                hello.setFont (hello.getFont ().deriveFont (17.0f));
                welcome.setFont (welcome.getFont ().deriveFont (15.0f));
                hello.setBounds(40,40,400,25);
                welcome.setBounds(110,80,250,25);
                myFrame2.getContentPane().add(hello);
                myFrame2.getContentPane().add(welcome);
          
                
                //button to start the Assessment
                 button.addActionListener(this);
                 myFrame2.getContentPane().add(button);
                 button.setBounds(80,120,300,30);
                
                 
                 // Message the user about the result
                  message = new JLabel ("*The result of this assessment will be updated at yours email in 3 day office hours");
                  message.setForeground(Color.RED);
                  message.setBounds(10,200,3400,30);
                  myFrame2.getContentPane().add(message);
                 
         }
                
                 public void actionPerformed(ActionEvent ae){
       
                  myFrame2.dispose();
                  new SmkTuanGusi3();  
          }
     
      //Drive code
      public static void main(String[] args) {
        
       new SmkTuanGusi2();
   }
}
