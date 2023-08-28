package collections;

class AddNumbers<T, U> {

	T t;
	U u;

	public AddNumbers(T t, U u) {
		this.t = t;
		this.u = u;
	}

	void show() {
		
		System.out.println(t);
		System.out.println(u);
	}
}

public class GenericsTest {
	public static void main(String[] args) {
		AddNumbers<Double, Double> obj = new AddNumbers<>(2.5, 5.5);
		obj.show();
		AddNumbers<Integer, Integer> obj2 = new AddNumbers<>(200, 500);
		obj2.show();
	}
}
