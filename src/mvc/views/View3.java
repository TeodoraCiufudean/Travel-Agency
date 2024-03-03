package mvc.views;

import javax.swing.*;
import java.awt.*;

public class View3 extends JFrame {

    private JFrame frame;
    private JTextField nameTextField;
    private JTextField ageTextField;
    private JTextField usernameTextField;
    private JTextField PasswordtextField;
    JButton createAccButton;

    public View3 (){
        frame = new JFrame();
        frame.getContentPane().setBackground(new Color(0, 51, 204));
        frame.getContentPane().setLayout(null);

        JLabel title3Label = new JLabel("Let's start our journey together!");
        title3Label.setFont(new Font("Palatino Linotype", Font.BOLD | Font.ITALIC, 35));
        title3Label.setForeground(new Color(255, 255, 255));
        title3Label.setBounds(533, 65, 602, 69);
        frame.getContentPane().add(title3Label);

        JPanel panel = new JPanel();
        panel.setBounds(533, 224, 499, 341);
        frame.getContentPane().add(panel);
        panel.setLayout(null);

        JLabel nameLabel = new JLabel("Name");
        nameLabel.setFont(new Font("Arial", Font.BOLD, 15));
        nameLabel.setForeground(new Color(0, 51, 204));
        nameLabel.setBounds(48, 44, 70, 21);
        panel.add(nameLabel);

        JLabel AgeLabel = new JLabel("Age");
        AgeLabel.setForeground(new Color(0, 51, 204));
        AgeLabel.setFont(new Font("Arial", Font.BOLD, 15));
        AgeLabel.setBounds(48, 86, 70, 21);
        panel.add(AgeLabel);

        JLabel usernameLabel = new JLabel("Username (mail address)");
        usernameLabel.setForeground(new Color(0, 51, 204));
        usernameLabel.setFont(new Font("Arial", Font.BOLD, 15));
        usernameLabel.setBounds(48, 129, 184, 21);
        panel.add(usernameLabel);

        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setForeground(new Color(0, 51, 204));
        passwordLabel.setFont(new Font("Arial", Font.BOLD, 15));
        passwordLabel.setBounds(48, 174, 93, 21);
        panel.add(passwordLabel);

        nameTextField = new JTextField();
        nameTextField.setText("Enter full name");
        nameTextField.setBounds(268, 46, 142, 19);
        panel.add(nameTextField);
        nameTextField.setColumns(10);

        ageTextField = new JTextField();
        ageTextField.setText("Enter age");
        ageTextField.setColumns(10);
        ageTextField.setBounds(268, 88, 142, 19);
        panel.add(ageTextField);

        usernameTextField = new JTextField();
        usernameTextField.setText("Enter mail address");
        usernameTextField.setColumns(10);
        usernameTextField.setBounds(268, 131, 142, 19);
        panel.add(usernameTextField);

        PasswordtextField = new JTextField();
        PasswordtextField.setText("Enter password");
        PasswordtextField.setColumns(10);
        PasswordtextField.setBounds(268, 174, 142, 19);
        panel.add(PasswordtextField);

        createAccButton = new JButton("Create account");
        createAccButton.setBackground(new Color(0, 51, 204));
        createAccButton.setForeground(new Color(255, 255, 255));
        createAccButton.setFont(new Font("Arial", Font.BOLD, 14));
        createAccButton.setBounds(313, 261, 142, 29);
        panel.add(createAccButton);
        frame.setBounds(100, 100, 1313, 895);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public String getUsernameTextField() {
        return String.valueOf(usernameTextField);
    }

    public void setUsernameTextField(String usernameTextField) {
        this.usernameTextField.setText(usernameTextField);
    }

    public int getAgeTextField() {
        return Integer.parseInt(ageTextField.getText());
    }

    public void setAgeTextField(int ageTextField) {
        this.ageTextField.setText(String.valueOf(ageTextField));
    }

    public String getNameTextField() {
        return String.valueOf(nameTextField);
    }

    public void setNameTextField (String nameTextField) {
        this.nameTextField.setText(nameTextField);
    }

    public String getPasswordtextField() {
        return String.valueOf(PasswordtextField);
    }

    public void setPasswordtextField(String passwordtextField) {
        this.PasswordtextField.setText(passwordtextField);
    }

}
