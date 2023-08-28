package collections;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateAndTimeDemo {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();

		System.out.println(date);

		System.out.println("Assessment on : " + date.plusDays(2));

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your Joining Date YYYY-mm-dd >>>");
		String joinDate = scanner.next();

		LocalDate joining = LocalDate.parse(joinDate);
		System.out.println("Joining Date : " + joining);
		System.out.println("Joining Year : " + joining.getYear());
		System.out.println("Joining Month : " + joining.getMonth());
		System.out.println("Joining Day : " + joining.getDayOfMonth());

		System.out.println("1 YEAR LATER ...");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Congratulations : " + joining.plusYears(1));
		
		
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yy");
		
	}
}
