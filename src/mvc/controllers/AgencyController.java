package mvc.controllers;

import mvc.models.Agency;
import mvc.views.View1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AgencyController {
    private View1 view1;
    private Agency agency;

    public AgencyController (View1 view1, Agency agency){
        this.view1 = view1;
        this.agency = agency;

        this.view1.addLogInListener(new LogInListener());
        this.view1.addSignUpListener(new SignUpListener());

    }

    class LogInListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Am apasat pe log in");
        }
    }

    class SignUpListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Am apasat pe sign up");
        }
    }
}
