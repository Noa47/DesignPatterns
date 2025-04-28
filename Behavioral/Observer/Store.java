package Behavioral.Observer;

public class Store {

    private final NotificationService notificationService;

    public Store() {
        notificationService = new NotificationService();
    }

    public void salePromotion() {
        notificationService.notifyCustomers();
    }

    public NotificationService getService() {
        return notificationService;
    }

}