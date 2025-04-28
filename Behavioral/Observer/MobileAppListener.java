package Behavioral.Observer;

public class MobileAppListener implements Listener {

    private String username;

    public MobileAppListener(String username) {
        this.username = username;
    }

    @Override
    public void update() {
        // Actually send the push notification to username
        System.out.println("Sending mobile app notification to "+ username);
    }

    public String getName() {
        return username;
    }

}