package mvc.models;

import java.util.ArrayList;
import java.util.List;

public class Agency {
    private String name;
    private List<Customer> customersList;

    public Agency(String name){
        this.name = name;
        this.customersList = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Customer> getCustomersList() {
        return customersList;
    }

    public void setCustomersList(List<Customer> customersList) {
        this.customersList = customersList;
    }
}
