package OOPS.Polymorphism;

abstract class Notification {
    abstract void send(String message);
}


class SMSNotification extends Notification {
    @Override
    void send(String message) {
        System.out.println("SMS : "+message);
    }
}

class EmailNotification extends Notification {
    @Override
    void send(String message) {
        System.out.println("Email : "+message);
    }
}

class PushNotification extends Notification {
    @Override
    void send(String message) {
        System.out.println("Push : "+message);
    }
}

class NotificationServices{
    public void notifyUser(Notification notification) {
        System.out.println(notification);
    }
}

public class Overriding {
    public static void main(String[] args) {
        NotificationServices notificationServices = new NotificationServices();
        notificationServices.notifyUser(new SMSNotification());
        notificationServices.notifyUser(new EmailNotification());
        notificationServices.notifyUser(new PushNotification());
    }
}
