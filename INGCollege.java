import javax.swing.*;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
   public class INGCollege implements ActionListener
   {
    JTextField Course;
    JTextField Course1;  
    JTextField Time; 
    JButton ADD;
    JTextField INS_Name; 
    JTextField Leader;
    JTextField credit1;
    JTextField Date;
    JTextField COMP_Date;
    JTextField Number;
    JTextField NAME;
    JTextField EXAM;
    JTextField Sites;
    JTextField leveltxt;
    JButton ADD1;
    JButton Display1;
    JButton Register1;
    JButton Clear1;
    JButton Remove;
    INGCollege()
     {
            
        
         
        
        //academic course
         
        JFrame Frame = new JFrame("Registration");     
        Frame.setBounds(100,80,1500,650);       
        Frame.setLayout(null);
        Frame.setVisible(true);
       
        JPanel panel1=new JPanel();  
        panel1.setBounds(0,0,800,800);   
        panel1.setBackground(Color.gray);
        Frame.add(panel1);
        panel1.setLayout(null);
        
        JPanel panel2=new JPanel();  
        panel2.setBounds(700,0,800,800);   
        panel2.setBackground(Color.pink);
        Frame.add(panel2);
        panel2.setLayout(null);
        
         
        //for academic
        JLabel CA = new JLabel(" Academic course  ");
        CA.setFont(new Font("Aerial", Font.BOLD, 25)); 
        panel1.add(CA);
        CA.setBounds(250,20,400,40);
         
         
         
         
         
         //Course ID
         JLabel ID = new JLabel("Course ID: ");
         Course   = new JTextField();
         panel1.add(ID);
         panel1.add(Course);
         ID.setBounds(20,100,100,30);
         Course.setBounds(170,100,120,40);
         
         
          //Course name 
         JLabel Name = new JLabel("Course Name: ");
         Course1   = new JTextField();
         Name.setBounds(500,100,100,30);
         Course1.setBounds(600,100,120,40);
         panel1.add(Name);
         panel1.add(Course1);
         
         //Duration
         JLabel Duration = new JLabel("Duration: ");
         Time    = new JTextField();
         panel1.add(Duration);
         panel1.add(Time);
         Duration.setBounds(20,200,100,30);
         Time.setBounds(170,200,120,40);
         
         
         
          //
         JLabel Instructor = new JLabel("Lecturer Name:");
         INS_Name = new JTextField();
         panel1.add(Instructor);
         panel1.add(INS_Name);
         Instructor.setBounds(500,200,100,40);
         INS_Name.setBounds(600,200,120,40);
         
          //level
         JLabel level = new JLabel("Level:");
         leveltxt = new JTextField();
         panel1.add(level);
         panel1.add(leveltxt);
         level.setBounds(20,300,300,30);
         leveltxt.setBounds(170,300,120,40);
         
         
         
         //credit
         
         JLabel Credit = new JLabel("Credit:");
         credit1 = new JTextField();
         panel1.add(Credit);
         panel1.add(credit1);
         Credit.setBounds(500,300,100,30);
         credit1.setBounds(600,300,120,40);
        
         
        //no. of assessments
                 
         JLabel Assessments = new JLabel("Number of Assessments:");
          Number = new JTextField();
         panel1.add(Assessments);
         panel1.add(Number);
         Assessments.setBounds(20,400,150,30);
         Number.setBounds(170,400,120,40);
         
         //ADD bUtton for academic 
        
         ADD1 = new JButton("ADD");
         ADD1.setBounds(600,400,120,40);
         panel1.add(ADD1);
         
         
         Display1 = new JButton("Display");
         Display1.setBounds(20,550,120,40);
         panel1.add(Display1);
         
         
         Clear1 = new JButton("Clear");
         Clear1.setBounds(200,550,120,40);
         panel1.add(Clear1);
         
         
         Register1 = new JButton("Register");
         Register1.setBounds(600,550,120,40);
         panel1.add(Register1);
         
         
         
         
         
         
         //non academic
         
         JLabel NON = new JLabel("Non-Academic course  ");
         NON.setFont(new Font("Aerial", Font.BOLD, 25)); 
         panel2.add(NON);
         NON.setBounds(300,20,400,40);
         
         
         
          //
         JLabel Instructor_NAME = new JLabel("Instructor Name:");
         NAME  = new JTextField();
         Instructor_NAME.setBounds(120,100,100,30);                                                         
         NAME.setBounds(250,100,120,40);
         panel2.add(Instructor_NAME);
         panel2.add(NAME);
         
          //
         JLabel prerequisites = new JLabel("Prerequisites:");
         Sites = new JTextField();
         panel2.add(prerequisites);
         panel2.add(Sites);
         prerequisites.setBounds(520,100,150,30);
         Sites.setBounds(650,100,120,40);
         
       
           //startDate
         JLabel Start_Date = new JLabel("Start Date:");
          Date = new JTextField();
         panel2.add(Start_Date);
         panel2.add(Date);
         Start_Date.setBounds(120,200,100,30);
         Date.setBounds(250,200,120,40);
        
        
        //completion date
         JLabel Completion_Date = new JLabel("Completion Date:");
         COMP_Date = new JTextField();
         panel2.add(Completion_Date);
         panel2.add(COMP_Date);
         Completion_Date.setBounds(520,200,100,30);
         COMP_Date.setBounds(650,200,120,40);
        
         
         //Button for Non-Academic class
        JButton ADD2 = new JButton("ADD");
        ADD2.setBounds(650,400,120,40);
        panel2.add(ADD2);
         
         
        JButton Display2 = new JButton("Display");
        Display2.setBounds(120,550,120,40);
        panel2.add(Display2);
         
         
        JButton Clear2 = new JButton("Clear");
        Clear2.setBounds(280,550,120,40);
        panel2.add(Clear2);
         
         
        JButton Register2 = new JButton("Register");
        Register2.setBounds(650,550,120,40);
        panel2.add(Register2);
         
        Remove = new JButton ( "Remove");
        Remove.setBounds(120,400,120,40);
        panel2.add(Remove);
 }
 public void actionPerformed(ActionEvent A)
 {
     if(A.getSource()==Clear1)
       {
           
         Course.setText("");
         Course1.setText("");
         Time.setText("");
         INS_Name.setText("");
         leveltxt.setText("");
         credit1.setText("");
         Number.setText("");
         
       }
       else  if (A.getSource()== Clear1);
     {
           System.exit(0);
        }
 }
 
 public static void main(String[]args)
 {
    new INGCollege();
 }
}