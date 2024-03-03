package mysql;

import mysql.controllers.AgencyController;
import mysql.models.Agency;
import mysql.models.Customer;
import mysql.views.View1;
import mysql.views.View2;
import mysql.views.View3;
import mysql.views.View4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Agency agency = new Agency("TTravel");

        View1 view1 = new View1();
        View2 view2 = new View2();
        View3 view3 = new View3();
        View4 view4 = new View4();

        DatabaseConnection databaseConnection = new DatabaseConnection();

        AgencyController agencyController = new AgencyController(view1,view2,view3,view4, agency,databaseConnection);

    }
}
