package Behavioral.Mediator;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ForgotPasswordButton extends JButton implements Component {

    private Mediator mediator;

    public ForgotPasswordButton() {
        super("Forgot Password?");
    }

    @Override
    protected void fireActionPerformed(ActionEvent actionEvent) {
        mediator.forgotPass();
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public String getName() {
        return "ForgotPasswordButton";
    }

}

