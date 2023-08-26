package assignments;

import java.util.ArrayList;
import java.util.List;

public class OrderTest {

	public static void main(String[] args) {
		List<String> items1 = new ArrayList<>();
		items1.add("FriedRice");
		items1.add("Pasta");
		items1.add("Thortilla");
		Order order1 = new Order(101, items1, false);
		
		List<String> items2 = new ArrayList<>();
		items1.add("Pizza");
		items1.add("Pasta");
		Order order2 = new Order(102, items2, true);

		List<String> items3 = new ArrayList<>();
		items1.add("Burger");
		items1.add("Sandwich");
		items1.add("Pizza");
		Order order3 = new Order(103, items3, false);

		List<Order> orders = new ArrayList<>();
		orders.add(order1);
		orders.add(order2);
		orders.add(order3);

		System.out.println("Displaying order details");
		for (Order o : orders) {
			System.out.println("Order Id:" + o.getOrderId());
			System.out.println("Items:");
			for (String itemName : o.getItemNames())
				System.out.println(itemName);

			System.out.println("----------------------");
		}
	}
}