package one.digitalinnovation.gof.service.observer;

public class SmsObserver implements Observer {
    @Override
    public void update(String message) {
        System.out.println("SMS Notification: " + message);
    }
}