package mvc.views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View2 extends JFrame{

    private JFrame frame;
    private JTextField usernameTextField;
    private JTextField passwordTextField;
    JButton logButton;


    public View2() {
        frame = new JFrame();
        frame.getContentPane().setBackground(new Color(0, 51, 204));
        frame.getContentPane().setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(10, 10, 1236, 210);
        panel.setBackground(new Color(0, 51, 204));
        frame.getContentPane().add(panel);
        panel.setLayout(null);

        JLabel title2Label = new JLabel("                                    We're happy to see you back here!");
        title2Label.setBounds(155, 133, 844, 48);
        title2Label.setForeground(new Color(255, 255, 255));
        title2Label.setFont(new Font("Palatino Linotype", Font.BOLD | Font.ITALIC, 35));
        panel.add(title2Label);

        JPanel panel_1 = new JPanel();
        panel_1.setBounds(495, 230, 510, 356);
        frame.getContentPane().add(panel_1);
        panel_1.setBackground(new Color(255, 255, 255));
        panel_1.setLayout(null);

        JLabel usernameLabel = new JLabel("Username");
        usernameLabel.setBounds(45, 72, 75, 18);
        panel_1.add(usernameLabel);
        usernameLabel.setForeground(new Color(0, 51, 204));
        usernameLabel.setFont(new Font("Arial", Font.BOLD, 15));

        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setForeground(new Color(0, 51, 204));
        passwordLabel.setFont(new Font("Arial", Font.BOLD, 15));
        passwordLabel.setBounds(45, 130, 75, 35);
        panel_1.add(passwordLabel);

        usernameTextField = new JTextField();
        usernameTextField.setText("Enter username/mail address");
        usernameTextField.setBounds(141, 73, 173, 20);
        panel_1.add(usernameTextField);
        usernameTextField.setColumns(10);

        passwordTextField = new JTextField();
        passwordTextField.setText("Enter password");
        passwordTextField.setColumns(10);
        passwordTextField.setBounds(141, 139, 173, 20);
        panel_1.add(passwordTextField);

        logButton = new JButton("Log in");
        logButton.setBackground(new Color(0, 51, 204));
        logButton.setForeground(new Color(255, 255, 255));
        logButton.setFont(new Font("Arial", Font.BOLD, 15));
        logButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        logButton.setBounds(357, 269, 101, 35);
        panel_1.add(logButton);
        frame.setBounds(100, 100, 1260, 896);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public String getUsernameTextField() {
        return  usernameTextField.getText();
    }

    public void setUsernameTextField(String usernameTextField) {
        this.usernameTextField.setText(usernameTextField);
    }

    public String getPasswordTextField() {
        return passwordTextField.getText();
    }

    public void setPasswordTextField(String passwordTextField) {
        this.passwordTextField.setText(passwordTextField);
    }

}
