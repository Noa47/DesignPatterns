package Behavioral.Observer;

import java.util.*;

public class NotificationService {

    private final List<Listener> customers;

    public NotificationService() {
        customers = new ArrayList<>();
    }

    public void subscribe(Listener listener) {
        if (customers.contains(listener)) {
            return;
        }
        customers.add(listener);
    }

    public void unsubscribe(Listener listener) {
        customers.removeIf(existingListener -> existingListener.getName().equals(listener.getName()));
    }

    public void notifyCustomers() {
        customers.forEach(listener -> listener.update());
    }

}
