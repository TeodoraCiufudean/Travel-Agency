package mysql.views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class View4 extends JFrame {

    //private JFrame frame;
    private JTextField departureDateField;
    private JTextField arrivalDateField;
    private JTextField nightsField;
    private JTextField peopleField;
    private JTextField roomsField;
    private JTextField priceField;
    private JButton bookButton;
    private JButton priceButton;
    JComboBox comboBox;

    public View4 () {
        //this = new JFrame();
        this.getContentPane().setBackground(new Color(102, 204, 255));
        this.getContentPane().setLayout(null);

        JLabel lblNewLabel = new JLabel("New label");
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Teo\\Downloads\\turnul effel.jpg"));
        lblNewLabel.setBounds(0, 616, 232, 117);
        this.getContentPane().add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("New label");
        lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Teo\\Downloads\\roma.jfif"));
        lblNewLabel_1.setBounds(231, 616, 253, 117);
        this.getContentPane().add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("New label");
        lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Teo\\Downloads\\getimage.jfif"));
        lblNewLabel_2.setBounds(479, 616, 261, 117);
        this.getContentPane().add(lblNewLabel_2);

        JLabel lblNewLabel_3 = new JLabel("New label");
        lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Teo\\Downloads\\Muzeul-Luvru.jpg"));
        lblNewLabel_3.setBounds(739, 616, 232, 117);
        this.getContentPane().add(lblNewLabel_3);

        JLabel lblNewLabel_4 = new JLabel("New label");
        lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\Teo\\Downloads\\lodon bridge.jpg"));
        lblNewLabel_4.setBounds(971, 616, 261, 117);
        this.getContentPane().add(lblNewLabel_4);

        JLabel lblNewLabel_5 = new JLabel("New label");
        lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\Teo\\Downloads\\venetia.jpg"));
        lblNewLabel_5.setBounds(1219, 616, 203, 117);
        this.getContentPane().add(lblNewLabel_5);

        JLabel lblNewLabel_6 = new JLabel("New label");
        lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\Teo\\Downloads\\top-10-locatii-de-vizitat-neaparat-daca-ajungi-la-moscova.jpg"));
        lblNewLabel_6.setBounds(1416, 616, 232, 117);
        this.getContentPane().add(lblNewLabel_6);

        JLabel lblNewLabel_7 = new JLabel("New label");
        lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\Teo\\Downloads\\logo nou.jfif"));
        lblNewLabel_7.setBounds(45, 25, 110, 132);
        this.getContentPane().add(lblNewLabel_7);

        JLabel title4Label = new JLabel("Travel. Experience. Live.  All with TTravel");
        title4Label.setForeground(new Color(255, 255, 255));
        title4Label.setFont(new Font("Palatino Linotype", Font.BOLD | Font.ITALIC, 35));
        title4Label.setBounds(517, 78, 697, 55);
        this.getContentPane().add(title4Label);

        JLabel destinationLabel_8 = new JLabel("Destination");
        destinationLabel_8.setFont(new Font("Arial", Font.BOLD, 17));
        destinationLabel_8.setForeground(new Color(255, 255, 255));
        destinationLabel_8.setBounds(338, 244, 101, 30);
        this.getContentPane().add(destinationLabel_8);

        comboBox = new JComboBox<String>();
        //comboBox.setModel(new DefaultComboBoxModel(new String[] {"Paris", "London", "Venice","Rome","Amsterdam","Moscow","Budapest","Vienna","Istanbul"}));
        comboBox.addItem("Paris");
        comboBox.addItem("London");
        comboBox.addItem("Venice");
        comboBox.addItem("Rome");
        comboBox.addItem("Amsterdam");
        comboBox.addItem("Moscow");
        comboBox.addItem("Budapest");
        comboBox.addItem("Vienna");
        comboBox.addItem("Istanbul");
        comboBox.setBounds(449, 251, 162, 21);
        this.getContentPane().add(comboBox);

        JLabel departureDateLabel = new JLabel("Departure date");
        departureDateLabel.setForeground(Color.WHITE);
        departureDateLabel.setFont(new Font("Arial", Font.BOLD, 17));
        departureDateLabel.setBounds(699, 244, 131, 30);
        this.getContentPane().add(departureDateLabel);

        departureDateField = new JTextField();
        departureDateField.setBounds(840, 252, 131, 19);
        this.getContentPane().add(departureDateField);
        departureDateField.setColumns(10);

        JLabel arrivalDateLabel = new JLabel("Arrival date");
        arrivalDateLabel.setForeground(Color.WHITE);
        arrivalDateLabel.setFont(new Font("Arial", Font.BOLD, 17));
        arrivalDateLabel.setBounds(1075, 244, 110, 30);
        this.getContentPane().add(arrivalDateLabel);

        arrivalDateField = new JTextField();
        arrivalDateField.setBounds(1182, 252, 131, 19);
        this.getContentPane().add(arrivalDateField);
        arrivalDateField.setColumns(10);

        JLabel nightsLabel = new JLabel("Nights");
        nightsLabel.setForeground(Color.WHITE);
        nightsLabel.setFont(new Font("Arial", Font.BOLD, 17));
        nightsLabel.setBounds(476, 326, 67, 30);
        this.getContentPane().add(nightsLabel);

        nightsField = new JTextField();
        nightsField.setBounds(541, 334, 96, 19);
        this.getContentPane().add(nightsField);
        nightsField.setColumns(10);

        JLabel PeopleLabel = new JLabel("People");
        PeopleLabel.setForeground(Color.WHITE);
        PeopleLabel.setFont(new Font("Arial", Font.BOLD, 17));
        PeopleLabel.setBounds(729, 326, 55, 30);
        this.getContentPane().add(PeopleLabel);

        peopleField = new JTextField();
        peopleField.setBounds(794, 334, 96, 19);
        this.getContentPane().add(peopleField);
        peopleField.setColumns(10);

        JLabel roomsLabel = new JLabel("Rooms");
        roomsLabel.setForeground(Color.WHITE);
        roomsLabel.setFont(new Font("Arial", Font.BOLD, 17));
        roomsLabel.setBounds(979, 326, 67, 30);
        this.getContentPane().add(roomsLabel);

        roomsField = new JTextField();
        roomsField.setBounds(1050, 334, 96, 19);
        this.getContentPane().add(roomsField);
        roomsField.setColumns(10);

        priceButton = new JButton("See price");
        priceButton.setForeground(new Color(0, 51, 204));
        priceButton.setFont(new Font("Arial", Font.BOLD, 15));
        priceButton.setBounds(669, 414, 120, 30);
        this.getContentPane().add(priceButton);

        priceField = new JTextField();
        priceField.setBounds(826, 414, 110, 30);
        this.getContentPane().add(priceField);
        priceField.setColumns(10);

        bookButton = new JButton("Book");
        bookButton.setBackground(new Color(0, 51, 204));
        bookButton.setForeground(new Color(255, 255, 255));
        bookButton.setFont(new Font("Arial", Font.BOLD, 18));
        bookButton.setBounds(1182, 501, 137, 44);
        this.getContentPane().add(bookButton);
        this.setBounds(100, 100, 1488, 882);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(false);
    }

    public String getdepartureDateField(){
        return departureDateField.getText();
    }

    public void setDepartureDateField(String departureDateField) {
        this.departureDateField.setText(departureDateField);
    }

    public String  getArrivalDateField() {
        return arrivalDateField.getText();
    }

    public void setArrivalDateField(String arrivalDateField) {
        this.arrivalDateField.setText(arrivalDateField);
    }

    public int getNightsField() {
        return Integer.parseInt(nightsField.getText());
    }

    public void setNightsField(int nightsField) {
        this.nightsField.setText(String.valueOf(nightsField));
    }

    public int getRoomsField() {
        return Integer.parseInt(roomsField.getText());
    }

    public void setRoomsField(int roomsField) {
        this.roomsField.setText(String.valueOf(roomsField));
    }

    public int getPeopleField() {
        return Integer.parseInt(peopleField.getText());
    }

    public void setPeopleField(int peopleField) {
        this.peopleField.setText(String.valueOf(peopleField));
    }

    public int getPriceField() {
        return Integer.parseInt(priceField.getText());
    }

    public void setPriceField(int priceField){
        this.priceField.setText(String.valueOf(priceField));
    }

    public JComboBox getComboBox() {
        return comboBox;
    }

    public void setComboBox(JComboBox comboBox) {
        this.comboBox = comboBox;
    }

    public void addPriceListener (ActionListener actionListener){
        priceButton.addActionListener(actionListener);
    }

    public void addBookListener (ActionListener actionListener){
        bookButton.addActionListener(actionListener);
    }

    public void refresh(){
        departureDateField.setText(null);
        arrivalDateField.setText(null);
        nightsField.setText(null);
        roomsField.setText(null);
        peopleField.setText(null);
        priceField.setText(null);
        comboBox.setSelectedItem(null);
    }

    public void showErrorMessage(String message) {
        JOptionPane.showMessageDialog(this, message, "INFORMATION MESSAGE", JOptionPane.INFORMATION_MESSAGE);
        refresh();
    }
}
