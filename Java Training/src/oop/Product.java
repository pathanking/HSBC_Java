package oop;

public class Product {
	int pId;
	String pname;
	double price;
	String madeBy;
	
	void showProductDetails() {
		System.out.println("Product Details : ");
		System.out.println("Product ID : "+pId);
		System.out.println("Product Name : "+pname);
		System.out.println("Product price : "+price);
		System.out.println("Product madeBy : "+madeBy);
	}
}
