package multi_threads;

public class Table {

	public void printTable(int n) {
		System.out.println("PRINTING TABLE OF : " + n);
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.printf("%d * %d = %d\n", n, i, n * i);
		}
	}
} // class Table ends here

class Thread5 extends Thread {
	Table table;

	Thread5(Table table) {
		this.table = table;
	}

	public void run() {
		table.printTable(5);
	}
} // class Thread5 ends here

class Thread7 extends Thread {
	Table table;

	Thread7(Table table) {
		this.table = table;
	}

	public void run() {
		table.printTable(7);
	}
} // class Thread7 ends here