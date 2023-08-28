package factory;

import java.util.Scanner;

public class TestNotifications {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {

			System.out.println("Enter Notification Type >>>");
			String choice = scanner.next();

			Notification notification = NotificationFactory.getNotification(choice);

			notification.notifyUser();
		}
	}
}
