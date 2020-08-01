/*
NAME : KHAIRUN SOFIAH BINTI JUMAN
MATRIC NO : BI19160318
"SMK TUAN GUSI SHEILDS"

THIS FOR LOGIN PAGE BEFORE USER(TEACHER AND WORKER AT THERE) START THE ASSESSMENT OF SCREENING COVID19.
USERNAME AND PASSWORD ALREADY SET IN THIS SYSTEM.
 */
package smktaungusisheilds;
 import java.awt.*;
 import java.awt.event.*;
 import javax.swing.*;

//Implementation  class concept oop
public class SmkTaunGusiSheilds implements ActionListener {
    
// Implementation of Encapsulation concept OOP    
    private JLabel title; 
    private JPanel panel = new JPanel();
    private JFrame myFrame = new JFrame ("SMK TAUN GUSI SHIELD");
    private JLabel username = new JLabel();
    private JTextField txtmyusername = new JTextField();
    private JLabel Password = new JLabel();
    private JPasswordField txtmyPassword = new JPasswordField();
    public JButton buttonLogin = new JButton ("LOGIN");
    public JButton buttonReset = new JButton ("RESET");
    public JLabel message;

   
  
    SmkTaunGusiSheilds(){
    
     // Frame
    
     myFrame.add(panel);
     myFrame.setBounds(300, 90, 450, 300); 
     panel.setLayout(null);
     myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
     myFrame.setVisible(true);
    
     //title of front this pafe
     title = new JLabel("SMK TUAN GUSI SHIELD LOGIN FORM");
     title.setBounds(70,10,400,25);
     title.setForeground(Color.GREEN);
     title.setFont (title.getFont ().deriveFont (18.0f));
     panel.add(title);
     
     //label username
     username = new JLabel("USERNAME (ID_CARD):");
     username.setBounds(30,60,150,25);
     panel.add(username);
     
     //textfield username
      txtmyusername.setBounds(160,60,165,25);
      txtmyusername.addActionListener(this);
      panel.add(txtmyusername);
      
      //label password
       Password = new JLabel("PASSWORD:");
       Password.setBounds(85,90,80,25);
       panel.add(Password);
       
       // textpassowrd password
      txtmyPassword.setBounds(160,90,165,25);
      txtmyPassword.addActionListener(this);
      panel.add(txtmyPassword);
      
      //Method for button Login 
      buttonLogin.addActionListener(this);
      buttonLogin.setBounds(150,150,80,25);
      panel.add(buttonLogin);
      
      //Method for button Reset
      buttonReset.addActionListener(this);
      buttonReset.setBounds(240,150,80,25);
      
      
      //Method for display the message if the user give invalid username or password while login
       message = new JLabel();
      message.setForeground(Color.RED);
      message.setBounds(140,120,200,25);
      panel.add(message);
    }   
     @Override
       //Implementation of Polymorphism overloading and a Method
       public void actionPerformed(ActionEvent ae){
         //login button action   
        String userName = txtmyusername.getText();
        String  password = txtmyPassword.getText();
        if (userName.trim().equals("980120125710") && password.trim().equals("980120125710")) {
              myFrame.dispose();
                 new SmkTuanGusi2(); 
        } 
        
           else {
          message.setText(" Invalid username or Password ");
        }
        {
        // reset button action
         buttonReset = (JButton)ae.getSource();	  
            String def = "";
            txtmyusername.setText(def); 
            txtmyPassword.setText(def);
         }   
    }
    
  //drive code
    public static void main(String[] args) {
       
        new SmkTaunGusiSheilds();
           
    }
    
}
