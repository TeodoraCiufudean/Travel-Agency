package mysql.views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View1 extends JFrame {
    //private JFrame frame;
    private JButton signUpButton;
    private JButton logInButton;


    public View1 () {
        //this = new JFrame();
        this.getContentPane().setBackground(new Color(102, 204, 255));
        this.setBounds(100, 100, 1049, 673);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        signUpButton = new JButton("           Sign up");
        signUpButton.setForeground(new Color(255, 255, 255));
        signUpButton.setFont(new Font("Palatino Linotype", Font.BOLD, 20));
        signUpButton.setBackground(new Color(0, 51, 204));
        signUpButton.setBounds(848, 350, 206, 81);
        signUpButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        signUpButton.setHorizontalAlignment(SwingConstants.LEFT);

        JLabel titleLabel = new JLabel("TTravel");
        titleLabel.setForeground(new Color(0, 51, 204));
        titleLabel.setBackground(new Color(255, 255, 255));
        titleLabel.setFont(new Font("Palatino Linotype", Font.BOLD | Font.ITALIC, 75));
        titleLabel.setIcon(null);
        titleLabel.setBounds(678, 45, 262, 102);
        this.getContentPane().setLayout(null);
        this.getContentPane().add(signUpButton);
        this.getContentPane().add(titleLabel);

        logInButton = new JButton("            Log in");
        logInButton.setForeground(new Color(255, 255, 255));
        logInButton.setBackground(new Color(0, 51, 204));
        logInButton.setFont(new Font("Palatino Linotype", Font.BOLD, 20));
        logInButton.setHorizontalAlignment(SwingConstants.LEFT);
        logInButton.setBounds(602, 350, 206, 81);
        this.getContentPane().add(logInButton);
        this.setVisible(true);
    }

    public void addLogInListener (ActionListener actionListener){
        logInButton.addActionListener(actionListener);
    }
    public void addSignUpListener (ActionListener actionListener){
        signUpButton.addActionListener(actionListener);
    }

}

