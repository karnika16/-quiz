
package Jquiz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Quiz extends JFrame implements ActionListener {
    
    String questions[][] = new String[10][5];
    String answers[][] = new String[10][2];
    String useranswers[][] = new String[10][1];
    JLabel qno, question;
    JRadioButton opt1, opt2, opt3, opt4;
    ButtonGroup groupoptions;
    JButton next, submit, lifeline;
    
    public static int timer = 15;
    public static int ans_given = 0;
    public static int count = 0;
    public static int score = 0;
    
    String name;
    
    Quiz(String name) {
        this.name = name;
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/quiz2.jpeg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0,0,980,280);
       add(image);
        
        qno = new JLabel();
        qno.setBounds(80,320,1000,50);
        qno.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(qno);
        
        question = new JLabel();
        question.setBounds(110,320,1000,50);
        question.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(question);
        
        questions[0][0] = "Which statement is true about Java?";
        questions[0][1] = "Java is a sequence-dependent programming language";
        questions[0][2] = " Java is a code dependent programming language";
        questions[0][3] = "Java is a platform-dependent programming language";
        questions[0][4] = "Java is a platform-independent programming language";

        questions[1][0] = "Which is used to find and fix bugs in the Java programs?";
        questions[1][1] = "JVM";
        questions[1][2] = "JDK";
        questions[1][3] = "JRE";
        questions[1][4] = "JDB";

        questions[2][0] = "Which package contains the Random class?";
        questions[2][1] = "java.util package";
        questions[2][2] = "java.lang package";
        questions[2][3] = "java.awt package";
        questions[2][4] = "java.io package";

        questions[3][0] = "An interface with no fields or methods is known as?";
        questions[3][1] = "Runnable Interface";
        questions[3][2] = "Abstract Interface";
        questions[3][3] = "Marker Interface";
        questions[3][4] = "CharSequence Interface";

        questions[4][0] = "In which memory a String is stored, when we create a string using new operator?";
        questions[4][1] = "Stack";
        questions[4][2] = "String memory";
        questions[4][3] = "Random storage space";
        questions[4][4] = "Heap memory";

        questions[5][0] = "What does the expression float a = 35 / 0 return?";
        questions[5][1] = "0";
        questions[5][2] = "Not a Number";
        questions[5][3] = "Infinity";
        questions[5][4] = "Run time exception";

        questions[6][0] = "Which keyword is used for accessing the features of a package?";
        questions[6][1] = "import";
        questions[6][2] = "package";
        questions[6][3] = "extends";
        questions[6][4] = "export";

        questions[7][0] = "Evaluate the following Java expression, if x=3, y=5, and z=10: ++z + y - y + z + x++";
        questions[7][1] = "23";
        questions[7][2] = "24";
        questions[7][3] = "20";
        questions[7][4] = "25";

        questions[8][0] = "Which of the following is a mutable class in java?";
        questions[8][1] = "java.lang.StringBuilder";
        questions[8][2] = "java.lang.Short";
        questions[8][3] = "java.lang.Byte";
        questions[8][4] = "java.lang.String";

        questions[9][0] = "Which of the following for loop declaration is not valid?";
        questions[9][1] = "for ( int i = 99; i >= 0; i / 9 )";
        questions[9][2] = "for ( int i = 7; i <= 77; i += 7 )";
        questions[9][3] = "for ( int i = 20; i >= 2; - -i )";
        questions[9][4] = "for ( int i = 2; i <= 20; i = 2* i )";
        
        answers[0][1] = "Java is a platform-independent programming language";
        answers[1][1] = "JDB";
        answers[2][1] = "java.util package";
        answers[3][1] = "Marker Interface";
        answers[4][1] = "Heap memory";
        answers[5][1] = "Infinity";
        answers[6][1] = "import";
        answers[7][1] = "25";
        answers[8][1] = "java.lang.StringBuilder";
 	answers[9][1] = "for ( int i = 99; i >= 0; i / 9 )";
        
        opt1 = new JRadioButton();
        opt1.setBounds(105,370,500,20);
        opt1.setBackground(Color.WHITE);
        opt1.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt1);
        
        opt2 = new JRadioButton();
        opt2.setBounds(105,395,500,20);
        opt2.setBackground(Color.WHITE);
        opt2.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt2);
        
        opt3 = new JRadioButton();
        opt3.setBounds(105,420,500,20);
        opt3.setBackground(Color.WHITE);
        opt3.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt3);
        
        opt4 = new JRadioButton();
        opt4.setBounds(105,445,500,20);
        opt4.setBackground(Color.WHITE);
        opt4.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt4);
        
        groupoptions = new ButtonGroup();
        groupoptions.add(opt1);
        groupoptions.add(opt2);
        groupoptions.add(opt3);
        groupoptions.add(opt4);
        
        next = new JButton("Next");
        next.setBounds(750,420,120,30);
        next.setFont(new Font("Tahoma", Font.PLAIN, 22));
        next.setBackground(Color.BLUE);
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);
        
        lifeline = new JButton("50-50");
        lifeline.setBounds(750,370,120,30);
        lifeline.setFont(new Font("Tahoma", Font.PLAIN, 22));
        lifeline.setBackground(Color.BLUE);
        lifeline.setForeground(Color.WHITE);
        lifeline.addActionListener(this);
        add(lifeline);
        
        submit = new JButton("Submit");
       submit.setBounds(750,470,120,30);
        submit.setFont(new Font("Tahoma", Font.PLAIN, 22));
        submit.setBackground(Color.BLUE);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setEnabled(false);
        add(submit);
        
        setLayout(null);
        //setting size of frame
        setSize(1000,600);
        //setting location of frame
        setLocation(200,100);
        //making frame visible
        setVisible(true);
        start(count);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == next) {
            repaint();
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            
            ans_given = 1;
            if (groupoptions.getSelection() == null) {
               useranswers[count][0] = "";
            } else {
                useranswers[count][0] = groupoptions.getSelection().getActionCommand();
            }
            
            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            
            count++;
            start(count);
        } else if (ae.getSource() == lifeline) {
            if(count==0)
            {
                opt1.setEnabled(false);
                opt4.setEnabled(false);
            }
            else if(count==1)
            {
                opt1.setEnabled(false);
                opt3.setEnabled(false);
            }
            else if(count==2)
            {
                opt2.setEnabled(false);
                opt4.setEnabled(false);
            }
            else if(count==3)
            {
                opt1.setEnabled(false);
                opt4.setEnabled(false);
            }
            else if(count==4)
            {
                opt1.setEnabled(false);
                opt2.setEnabled(false);
            }
            else if(count==5)
            {
                opt1.setEnabled(false);
                opt4.setEnabled(false);
            }
            else if(count==6)
            {
                opt3.setEnabled(false);
                opt4.setEnabled(false);
            }
            else if(count==7)
            {
                opt1.setEnabled(false);
                opt3.setEnabled(false);
            }
            else if(count==8)
            {
                opt3.setEnabled(false);
                opt4.setEnabled(false);
            }
            else if(count==9)
            {
                opt2.setEnabled(false);
                opt4.setEnabled(false);
            }
            lifeline.setEnabled(false);
        } else if (ae.getSource() == submit) {
            ans_given = 1;
            if (groupoptions.getSelection() == null) {
                useranswers[count][0] = "";
            } else {
                useranswers[count][0] = groupoptions.getSelection().getActionCommand();
            }

            for (int i = 0; i < useranswers.length; i++) {
                if (useranswers[i][0].equals(answers[i][1])) {
                    score += 10;
                } else {
                    score += 0;
                }
            }
            setVisible(false);
            new Score(name, score);
        }
    }
    
    public void paint(Graphics g) {
        super.paint(g);
        
        String time =   timer + "s"; // 15
        g.setColor(Color.RED);
        g.setFont(new Font("Tahoma", Font.BOLD, 25));
        
        if (timer > 0) { 
           g.drawString(time,770,360);
        } else {
            g.drawString("time over",770,360);
        }
        
        timer--; // 14
        
        try {
            Thread.sleep(1000);
            repaint();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        if (ans_given == 1) {
            ans_given = 0;
            timer = 15;
        } else if (timer < 0) {
            timer = 15;
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            
            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            if (count == 9) { // submit button
                if (groupoptions.getSelection() == null) {
                   useranswers[count][0] = "";
                } else {
                    useranswers[count][0] = groupoptions.getSelection().getActionCommand();
                }
                
                for (int i = 0; i < useranswers.length; i++) {
                    if (useranswers[i][0].equals(answers[i][1])) {
                        score += 10;
                    } else {
                        score += 0;
                    }
                }
                setVisible(false);
                new Score(name, score);
            } else { // next button
                if (groupoptions.getSelection() == null) {
                   useranswers[count][0] = "";
                } else {
                    useranswers[count][0] = groupoptions.getSelection().getActionCommand();
                }
                count++; // 0 // 1
                start(count);
            }
        }
        
    }
    
    public void start(int count) {
        qno.setText("" + (count + 1) + ". ");
        question.setText(questions[count][0]);
        opt1.setText(questions[count][1]);
        opt1.setActionCommand(questions[count][1]);
        
        opt2.setText(questions[count][2]);
        opt2.setActionCommand(questions[count][2]);
        
        opt3.setText(questions[count][3]);
        opt3.setActionCommand(questions[count][3]);
        
        opt4.setText(questions[count][4]);
        opt4.setActionCommand(questions[count][4]);
        
        groupoptions.clearSelection();
    }
    
    public static void main(String[] args) {
        new Quiz("User");
    }
}