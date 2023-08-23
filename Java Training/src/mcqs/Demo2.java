package mcqs;

class Demo2 {

	Demo2() {
		Demo2 d2 = new Demo2();
		foo();
	}

	private void foo() {
		System.out.println("foo");
	}

	public static void main(String[] args) {
		Demo2 d = new Demo2();
	}
}
