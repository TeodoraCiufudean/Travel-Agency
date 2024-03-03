package mvc;

import mvc.controllers.AgencyController;
import mvc.models.Agency;
import mvc.models.Customer;
import mvc.views.View1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Customer> customersList = new ArrayList<>();
        customersList.add(new Customer(123,"Teo",20,"teio@gmail.com","teodorica"));
        customersList.add(new Customer(213,"Ale",19,"aleb@gmail.com","alealexandra"));
        customersList.add(new Customer(321,"Adina",21,"adinap@gmail.com","adinutza"));
        Agency agency = new Agency("TTravel");
        agency.setCustomersList(customersList);
        View1 view1 = new View1();
        AgencyController agencyController = new AgencyController(view1, agency);
    }
}
