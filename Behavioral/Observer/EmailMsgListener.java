package Behavioral.Observer;

public class EmailMsgListener implements Listener {

    private String emailAddress;

    public EmailMsgListener(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public void update() {
        // Actually send the mail
        System.out.println("Sending mail to "+ emailAddress);
    }

    public String getName() {
        return emailAddress;
    }

}
