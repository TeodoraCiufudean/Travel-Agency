package mysql.controllers;

import mysql.DatabaseConnection;
import mysql.models.Agency;
import mysql.models.Customer;
import mysql.views.View1;
import mysql.views.View2;
import mysql.views.View3;
import mysql.views.View4;

import javax.xml.transform.Result;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AgencyController {
    private View1 view1;
    private View2 view2;
    private View3 view3;
    private View4 view4;
    private Agency agency;
    private DatabaseConnection databaseConnection;
    private int id = 44;
    private int i=0;

    public AgencyController(View1 view1,View2 view2, View3 view3,View4 view4,Agency agency, DatabaseConnection databaseConnection){
        this.view1 = view1;
        this.view2 = view2;
        this.view3 = view3;
        this.view4 = view4;
        this.agency = agency;
        this.databaseConnection = databaseConnection;

        this.view1.addLogInListener(new LogInListener());
        this.view1.addSignUpListener(new SignUpListener());
        this.view2.addLogListener(new LogListener());
        this.view3.addCreateAccListener(new CreateAccListener());
        this.view4.addPriceListener(new PriceListener());
        this.view4.addBookListener(new BookListener());

    }

    public Customer user;
    class LogListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {


            //List<Customer> customers = new ArrayList<>();
            Customer user = null;
            try {
                boolean ok = false;
                String mail = view2.getUsernameTextField();
                String password = view2.getPasswordTextField();
                System.out.println(mail + " " + password);
                Connection connection = databaseConnection.getConnection();
                String sql = "SELECT * FROM customers"; // WHERE customer_mailAddress = email AND customer_password = password" ;
                Statement statement = connection.createStatement();
                //preparedStatement.setString(1,mail);
                //preparedStatement.setString(2,password);

                ResultSet result = statement.executeQuery(sql);
                System.out.println(view2.getPasswordTextField().toString() + " " + view2.getUsernameTextField());
                while (result.next()) {
                    user = new Customer();
                    user.setId(result.getInt(1));
                    user.setName(result.getString(2));
                    user.setAge(result.getInt(3));
                    user.setMailAddress(result.getString(4));
                    user.setPassword(result.getString(5));

                    if (mail.equals(user.getMailAddress()) && password.equals(user.getPassword())) {
                        ok = true;
                        view4.setVisible(true);
                        view2.setVisible(false);
                        return ;
                    }
                }
                view2.showErrorMessage("Invalid username or password.");
                connection.close();
            } catch (Exception ex) {
                System.out.println("Problem with log in");
                ex.printStackTrace();
            }
        }
    }

    class LogInListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            //System.out.println("Am apasat pe log in");
           view2.setVisible(true);
           view1.setVisible(false);
        }
    }

    class SignUpListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            view3.setVisible(true);
            view1.setVisible(false);
            //System.out.println("Am apasat pe sign up");
        }
    }

    class CreateAccListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            try{
                Connection connection = databaseConnection.getConnection();

                PreparedStatement preparedStatement = connection.prepareStatement("insert into customers (customer_id, customer_name,customer_age, customer_mailAddress,customer_password)" + "values (?,?,?,?,?)");

                preparedStatement.setInt(1,id);
                preparedStatement.setString(2,view3.getNameTextField());
                preparedStatement.setInt(3,view3.getAgeTextField());
                preparedStatement.setString(4,view3.getUsernameTextField());
                preparedStatement.setString(5,view3.getPasswordtextField());

                preparedStatement.executeUpdate();

                connection.close();
                id+=10;
                view3.showInfoMessage("Your account was successfully created.");
                view4.setVisible(true);
                view3.setVisible(false);

            }catch (Exception exception){
                view3.showErrorMessage("Bad input.");
                exception.printStackTrace();
            }

            //System.out.println("Am apasat pe sign up");
        }
            //System.out.println("am apasat pe createAcc");
        }

    class PriceListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            try{
                //int[] price = new int[]{300,1000,550};
                int price_r = 0;
                int price_f = 0;
                int id_dest = 0;
                String destination = (String) view4.getComboBox().getSelectedItem();
                int rooms = view4.getRoomsField();
                int nights = view4.getNightsField();
                int people = view4.getPeopleField();
                Connection connection = databaseConnection.getConnection();
               // String sql1 = "SELECT address_id FROM addresses WHERE address_name = ?";
                PreparedStatement preparedStatement1 = connection.prepareStatement("SELECT address_id FROM addresses WHERE address_name = ?");
               // Statement statement1 = connection.createStatement();
                preparedStatement1.setString(1, (String) view4.getComboBox().getSelectedItem());
                ResultSet result1 = preparedStatement1.executeQuery();
                while (result1.next()){
                    id_dest = result1.getInt(1);
                }
                PreparedStatement preparedStatement2 = connection.prepareStatement("SELECT room_price FROM hotels WHERE address_id = ?");
                //Statement statement2 = connection.createStatement();
                preparedStatement2.setInt(1,id_dest);
                ResultSet result2 = preparedStatement2.executeQuery();
                while(result2.next()){
                    price_r = result2.getInt(1);
                }
                System.out.println(price_r);
                PreparedStatement preparedStatement3 = connection.prepareStatement("SELECT flight_price FROM airline where flight_address_id = ?");
                // statement3 = connection.createStatement();
                preparedStatement3.setInt(1,id_dest);
                ResultSet result3 = preparedStatement3.executeQuery();
                while(result3.next()){
                     price_f = result3.getInt(1);
                }
                System.out.println(price_f);
                int totalPrice = rooms*nights*price_r + people*price_f;
                //int totalPrice = price[i++];
                view4.setPriceField(totalPrice);
                connection.close();

            } catch (Exception exception){
                view4.showErrorMessage("Bad input :(");
                exception.printStackTrace();
            }
        }
    }

    class BookListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            view4.showErrorMessage("Your booking is complete.");
        }
    }
}
