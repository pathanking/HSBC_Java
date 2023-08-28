package factory;

public interface Notification {
	void notifyUser();
}

class SmsNotification implements Notification {
	@Override
	public void notifyUser() {
		System.out.println("Notified By SMS");
	}
}

class EmailNotification implements Notification {
	@Override
	public void notifyUser() {
		System.out.println("Notified By Email");
	}
}

class PushNotification implements Notification {
	@Override
	public void notifyUser() {
		System.out.println("Notified By Push");
	}
}