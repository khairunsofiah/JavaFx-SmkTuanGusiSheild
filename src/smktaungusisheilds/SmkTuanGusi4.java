/*
MATRIC NO : BI19160318
THIS PAGE WILL APPEAR WHEN THE USER ALREADY CLICK THE BUTTON FOR THE NEXT QUESTION
THE USER JUST ANSWER THE QUESTION USING RADIOBUTTON AND COMBOBOX
 */
package smktaungusisheilds;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JOptionPane;

//Implementation  class concept oop
 public class SmkTuanGusi4 implements ActionListener{
   
 //Implementation of Encapsulation concept OOP       
 private JFrame myFrame4 =  new JFrame("SMK TAUN GUSI SHIELD");
 public JLabel quest2 = new JLabel ();
 public JRadioButton radioButton = new JRadioButton();
 public JRadioButton radioButton2 = new JRadioButton();
 public JLabel quest3 = new JLabel ();
 public JComboBox answer3= new JComboBox();
 public JButton Submit = new JButton("Submit");
 public JTextArea result =  new JTextArea ();
 public JButton Logout = new JButton ("Logout");
  
 
   //array implementation
   public String answer3s[] = {"yes","No" };
   
      
     //Implementation Class concept OOP   
      public SmkTuanGusi4(){
          
                //Methods for Frame
                myFrame4.setSize(800,600);
		myFrame4.setVisible(true);
                myFrame4.getContentPane().setLayout(null);
                myFrame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
                 // Question No.2
                 quest2 = new JLabel ("2. Have you travelled outside of Country or had close contact with anyone that has travelled\n" +
                                      "outside of Country in the past 14 days?");
                 quest2.setBounds(10,50,800,50);
                 myFrame4.getContentPane().add(quest2);
                 radioButton = new JRadioButton("Yes");
                 radioButton.setSelected(true); 
                 radioButton.setBounds(70, 95, 500, 60);
                 myFrame4.getContentPane().add(radioButton);
                 radioButton2 = new JRadioButton("No");
                 radioButton2.setSelected(false); 
                 radioButton2.setBounds(70, 130, 500, 60);
                 myFrame4.getContentPane().add(radioButton2);
                 
                 //Question No.3
                  quest3 = new JLabel ("3. Have you had close contact with anyone with respiratory illness or a confirmed or\n" +
                                       "probable case of COVID-19? ");
                  quest3.setBounds(10,170,800,50);
                  myFrame4.getContentPane().add(quest3);                
                  answer3= new JComboBox(answer3s);
                  answer3.setBounds(20, 220, 100, 30);
                  myFrame4.getContentPane().add(answer3);
                  
                 //button submit 
                 Submit.addActionListener(this);
                 Submit.setBounds(100,400,100,25);
                 myFrame4.getContentPane().add(Submit);   
                 
                 //button Logout 
                 Logout.addActionListener(this);
                 Logout.setBounds(400,400,100,25);
                
      }
          
               public void actionPerformed(ActionEvent e){
                    
                   {  // message box
                       Submit = (JButton)e.getSource();
                       JOptionPane.showMessageDialog(myFrame4," Successful Submitted, your result will updated at yours email in 3 days office hours.");
                   }
            
               { //Logout
                Logout = (JButton)e.getSource();		
		myFrame4.dispose();
              }   
                 
     }
 
 
      //Drive code
      public static void main(String[] args) {
        
       new SmkTuanGusi4();
   }
}

