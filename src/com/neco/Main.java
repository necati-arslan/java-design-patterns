package com.neco;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("hello");

     // OCP

        Shape[] shapes = new Shape[2];
        shapes[0] = new Rectangle(5, 4);
        shapes[1] = new Circle(3);

        AreaCalculator calculator = new AreaCalculator();
        double totalArea = calculator.calculateTotalArea(shapes);
        System.out.println("Total area: " + totalArea);

      //LSP
        static void calculateArea(Rectanglec r) {
            r.setWidth(5);
            r.setHeight(4);
            System.out.println("Area: " + r.calculateArea());
        }
        Rectanglec rectangle = new Rectanglec(5, 4);
        calculateArea(rectangle);

        Square square = new Square(5);
        calculateArea(square);

        //Dip
        NotificationService emailNotificationService = new NotificationService(new EmailNotificationSender());
        emailNotificationService.sendNotification("example@example.com", "Hello!");

        NotificationService smsNotificationService = new NotificationService(new SMSNotificationSender());
        smsNotificationService.sendNotification("1234567890", "Hi!");

        NotificationService pushNotificationService = new NotificationService(new PushNotificationSender());
        pushNotificationService.sendNotification("deviceToken", "Hey!");

    }
}
