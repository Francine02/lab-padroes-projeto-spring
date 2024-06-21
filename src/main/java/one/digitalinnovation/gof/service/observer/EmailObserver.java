package one.digitalinnovation.gof.service.observer;

public class EmailObserver implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Email Notification: " + message);
    }
}