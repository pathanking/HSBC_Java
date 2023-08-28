package factory;

public class NotificationFactory {

	public static Notification getNotification(String input) {
		Notification notification = null;

		switch (input) {
		case "sms":
			notification = new SmsNotification();
			break;
		case "email":
			notification = new EmailNotification();
			break;
		case "push":
			notification = new PushNotification();
			break;
		default:
			System.out.println("Invalid Choice");
			break;
		}
		return notification;
	}
}