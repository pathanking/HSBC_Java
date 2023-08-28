package collections;

import java.util.Comparator;
import java.util.Objects;
import java.util.TreeSet;

class Order {
	Integer oid;
	String name;
	Long price;

	public Order(Integer oid, String name, Long price) {
		this.oid = oid;
		this.name = name;
		this.price = price;
	}

	public Integer getOid() {
		return oid;
	}

	public String getName() {
		return name;
	}

	public Long getPrice() {
		return price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, oid, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		return Objects.equals(name, other.name) && Objects.equals(oid, other.oid) && Objects.equals(price, other.price);
	}

	@Override
	public String toString() {
		return "Order [oid=" + oid + ", name=" + name + ", price=" + price + "]";
	}

}

public class TreeSetDemo2 {
	public static void main(String[] args) {
		TreeSet<Order> orders = new TreeSet<>(Comparator.comparing(Order::getName).reversed());
		Order o1 = new Order(121, "phone", 25000L);
		Order o2 = new Order(212, "watch", 2999L);
		Order o3 = new Order(323, "ring", 5999L);
		Order o4 = new Order(515, "laptop", 65000L);
		Order o5 = new Order(616, "computer", 45000L);
		Order o6 = new Order(171, "books", 2000L);

		orders.add(o6);
		orders.add(o1);
		orders.add(o2);
		orders.add(o3);
		orders.add(o4);
		orders.add(o5);

		orders.forEach(System.out::println);
	}
}