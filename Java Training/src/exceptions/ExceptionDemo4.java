package exceptions;

public class ExceptionDemo4 {
	public static void main(String[] args) {
		int a = 5;
		if (a != 5) {
			System.out.println("inside if");
			// throw 10;
		} else {
			System.out.println("else block");
		}
	}
}
//1. compiler error
//2. runtime error
//3. else block
//4. if block