
interface Notification {
    void sendNotification();
}


class EmailNotification implements Notification {
    @Override
    public void sendNotification() {
        System.out.println(" Sending Email Notification");
    }
}

class SMSNotification implements Notification {
    @Override
    public void sendNotification() {
        System.out.println(" Sending SMS Notification");
    }
}

class PushNotification implements Notification {
    @Override
    public void sendNotification() {
        System.out.println(" Sending Push Notification");
    }
}


class NotificationFactory {
    public static Notification createNotification(String type) {
        switch (type.toLowerCase()) {
            case "email":
                return new EmailNotification();
            case "sms":
                return new SMSNotification();
            case "push":
                return new PushNotification();
            default:
                throw new IllegalArgumentException(" Unknown notification type");
        }
    }
}

public class Application2 {
    public static void main(String[] args) {
        System.out.println();

        Notification email = NotificationFactory.createNotification("email");
        email.sendNotification();

        Notification sms = NotificationFactory.createNotification("sms");
        sms.sendNotification();

        Notification push = NotificationFactory.createNotification("push");
        push.sendNotification();
    }
}
