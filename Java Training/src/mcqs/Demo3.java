package mcqs;

public class Demo3 {
	
	
	
	public void main() {
		
	}
	
	public static void main(String[] args) {
		//flyweight design pattern
		String s1 = "java"; // constant pool

		String s2 = "java"; // heap
		
		String s3 = "java";

		System.out.println(s1 == s2); // false
		System.out.println(s1.equals(s2)); // true
	}
}
