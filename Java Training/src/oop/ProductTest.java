package oop;

public class ProductTest {

	public static void main(String[] args) {
		Product p1 = new Product();
		p1.pId = 101;
		p1.pname = "Notebook";
		p1.price = 80;
		p1.madeBy = "ITC";

		Product p2 = new Product();
		p2.pId = 202;
		p2.pname = "Java Reference";
		p2.price = 800;
		p2.madeBy = "Oxford";

		
		p1.showProductDetails();
		p2.showProductDetails();
	}
}