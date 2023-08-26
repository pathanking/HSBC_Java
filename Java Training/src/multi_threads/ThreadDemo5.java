package multi_threads;

public class ThreadDemo5 {
	public static void main(String[] args) {
		Table table = new Table();
		
		Thread5 t5 = new Thread5(table);
		
		Thread7 t7 = new Thread7(table);
		
		t5.start();
		t7.start();
	}
}
