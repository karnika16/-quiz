
package Jquiz;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener {
    JButton exit,play_again;
    Score(String name, int score) {
  
        getContentPane().setBackground(Color.WHITE);
        
      
        
        JLabel heading = new JLabel("Thankyou " + name + " for playing JQuiz");
        heading.setBounds(150,50,700,80);
        heading.setFont(new Font("Tahoma", Font.BOLD, 26));
        heading.setForeground(Color.BLUE);
        add(heading);
        
        JLabel score1=new JLabel(" score : "+score + "/100");
        score1.setBounds(220,170,1000,50);
        score1.setFont(new Font("New Times Roman",Font.PLAIN,50));
        add(score1);
        
        JLabel grade=new JLabel();
        if(score<30)
        {
            grade=new JLabel("You fail");
        }
        else if(score>30 && score<=80)
        {
            grade=new JLabel("You play well");
        }
        else
        {
            grade=new JLabel("Outstanding");
        }
        grade.setFont(new Font("New Times Roman",Font.PLAIN,28));
        grade.setForeground(Color.RED);
        grade.setBounds(300,250,1000,50);
        add(grade);
        play_again=new JButton("play again");
        play_again.setBounds(250,330,130,30);
        play_again.setBackground(Color.BLUE);
        play_again.setForeground(Color.WHITE);
        exit=new JButton("Exit");
        exit.setBounds(400,330,130,30);
        exit.setBackground(Color.BLUE);
        exit.setForeground(Color.WHITE);
        add(play_again);
        add(exit);
        play_again.addActionListener(this);
        exit.addActionListener(this);
        setLayout(null);
        //setting size of frame
        setSize(800,500);
        //setting location of frame
        setLocation(200,100);
        //making frame visible
        setVisible(true);
    
    }
    
    public void actionPerformed(ActionEvent evt) {
        if(evt.getSource()==exit)
        {
            setVisible(false);
        }
        if(evt.getSource()==play_again)
        {
            setVisible(false);
            new Login();
        }
    }
    public static void main(String[] args) {
        new Score("User", 0);
    }
}
