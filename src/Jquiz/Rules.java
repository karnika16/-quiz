package Jquiz;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{

    String name;
    JButton start, back;
    
    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading1=new JLabel("Welcome " +name+ " to JQuiz");
        JLabel heading2=new JLabel("<html>"+"<u>"+"Rules of the quiz:" + "</u>"+"</html>");
        heading1.setFont(new Font("Comic Sans MC",Font.ROMAN_BASELINE,40));
        heading2.setFont(new Font("Comic Sans MC",Font.BOLD,25));
        heading1.setBounds(180,70,700,45);
        heading2.setBounds(60,160,300,45);
        heading1.setForeground(Color.BLUE);
        add(heading1);
        add(heading2);
        
        JLabel rules = new JLabel();
        rules.setBounds(60,100,700,450);
        rules.setFont(new Font("Times New Roman",Font.PLAIN,20));
        rules.setText(
            "<html>"+ 
                "1. There are total 10 questions." + "<br><br>" +
                "2. 15 seconds are provided for each question." + "<br><br>" +
		"3.Each question contains 10 marks." + "<br><br>" +
                "4. After 15 seconds,the page will redirect to next question" + "<br><br>" +
                "5. 1 lifeline '50-50' can be used once.(2 options will be removed)" + "<br><br>" +
            "</html>"
        );
        add(rules);
        
        start=new JButton("Start");
        start.setBounds(750,320,120,30);
        start.setBackground(Color.BLUE);
        start.setForeground(Color.WHITE);
        back=new JButton("back");
        back.setBounds(750,370,120,30);
        back.setBackground(Color.BLUE);
        back.setForeground(Color.WHITE);
        add(start);
        add(back);
        start.addActionListener(this);
        back.addActionListener(this);
        setLayout(null);
         //setting size of frame
        setSize(1050,600);
        //setting location of frame
        setLocation(150,80);
        //making frame visible
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            new Quiz(name);
        } else {
            setVisible(false);
            new Login();
        }
    }
    
    public static void main(String[] args) {
        new Rules("User");
    }
}