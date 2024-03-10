package com.neco;

// Dependency Inversion Principle
//This principle states that high-level modules should not depend on low-level modules. Both should depend on abstractions.
// Additionally, abstractions should not depend on details; details should depend on abstractions.
public class Dip {
}

//Here's how we might design our system without following the Dependency Inversion Principle:
// NotificationSender.java
 interface NotificationSender {
    void sendNotification(String recipient, String message);
}

// EmailNotificationSender.java
 class EmailNotificationSender implements NotificationSender {
    @Override
    public void sendNotification(String recipient, String message) {
        // Code to send email
        System.out.println("Sending email to " + recipient + ": " + message);
    }
}

// SMSNotificationSender.java
 class SMSNotificationSender implements NotificationSender {
    @Override
    public void sendNotification(String recipient, String message) {
        // Code to send SMS
        System.out.println("Sending SMS to " + recipient + ": " + message);
    }
}

// PushNotificationSender.java
 class PushNotificationSender implements NotificationSender {
    @Override
    public void sendNotification(String recipient, String message) {
        // Code to send push notification
        System.out.println("Sending push notification to " + recipient + ": " + message);
    }
}


// NotificationService.java
 class NotificationService {
    private NotificationSender notificationSender;

    public NotificationService(NotificationSender notificationSender) {
        this.notificationSender = notificationSender;
    }

    public void sendNotification(String recipient, String message) {
        notificationSender.sendNotification(recipient, message);
    }
}

//he NotificationService class now depends on the NotificationSender interface instead of concrete implementations.

/*
* // EmailNotification.java
public class EmailNotification {
    public void sendEmail(String recipient, String message) {
        // Code to send email
        System.out.println("Sending email to " + recipient + ": " + message);
    }
}

// SMSNotification.java
public class SMSNotification {
    public void sendSMS(String phoneNumber, String message) {
        // Code to send SMS
        System.out.println("Sending SMS to " + phoneNumber + ": " + message);
    }
}

// PushNotification.java
public class PushNotification {
    public void sendPushNotification(String deviceToken, String message) {
        // Code to send push notification
        System.out.println("Sending push notification to " + deviceToken + ": " + message);
    }
}

// NotificationService.java
public class NotificationService {
    private EmailNotification emailNotification = new EmailNotification();
    private SMSNotification smsNotification = new SMSNotification();
    private PushNotification pushNotification = new PushNotification();

    public void sendNotification(String recipient, String message, String channel) {
        if (channel.equals("email")) {
            emailNotification.sendEmail(recipient, message);
        } else if (channel.equals("sms")) {
            smsNotification.sendSMS(recipient, message);
        } else if (channel.equals("push")) {
            pushNotification.sendPushNotification(recipient, message);
        }
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();
        notificationService.sendNotification("example@example.com", "Hello!", "email");
        notificationService.sendNotification("1234567890", "Hi!", "sms");
        notificationService.sendNotification("deviceToken", "Hey!", "push");
    }
}
*
*
*
* The NotificationService class directly depends on concrete implementations of EmailNotification, SMSNotification, and PushNotification.
If we want to add a new notification channel, such as a social media notification, we would need to modify the NotificationService class.

* */