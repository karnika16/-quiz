package Jquiz;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
 
    JButton start,back;
    JTextField txtname;
    
    Login() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/quiz1.png"));
        JLabel image = new JLabel(i1);
       image.setBounds(0, 0, 600, 500);
       add(image);
        
        //add heading
        JLabel heading1=new JLabel("JQuiz");
        JLabel heading2=new JLabel("-Java Brain Quest");
        heading1.setFont(new Font("Comic Sans MC",Font.BOLD,40));
        heading2.setFont(new Font("Comic Sans MC",Font.ITALIC,18));
        heading1.setBounds(700,70,300,45);
        heading2.setBounds(750,105,300,45);
        heading1.setForeground(Color.BLUE);
        heading2.setForeground(Color.BLUE);
        add(heading1);
        add(heading2);
        
        //add a label for name
        JLabel name=new JLabel("Enter your name : ");
        name.setFont(new Font("Times New Roman",Font.PLAIN,25));
        name.setBounds(620,200,300,25);
        add(name);
        
        //add a textfield
        txtname=new JTextField();
        txtname.setBounds(620,240,300,25);
        txtname.setFont(new Font("Times New Roman",Font.PLAIN,18));
        add(txtname);
        
        //adding button
        start=new JButton("Start");
        start.setBounds(850,330,110,30);
        start.setBackground(Color.BLUE);
        start.setForeground(Color.WHITE);
        back=new JButton("Exit");
        back.setBounds(850,380,110,30);
        back.setBackground(Color.BLUE);
        back.setForeground(Color.WHITE);
        add(start);
        add(back);
        
        start.addActionListener(this);
        back.addActionListener(this);
        
        //setting size of frame
        setSize(1050,600);
        //setting location of frame
        setLocation(150,80);
        //making frame visible
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            String name = txtname.getText();
            setVisible(false);
            new Rules(name);
        } else if (ae.getSource() == back) {
            setVisible(false);
        }
    }
    
    public static void main(String[] args) {
        new Login();
    }
}