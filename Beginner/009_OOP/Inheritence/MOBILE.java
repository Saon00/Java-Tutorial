package OOPS;

public class MOBILE extends Product {
	
	int ram;
	String os;
	int sdCard;
	
	void setProductDetails(String productName, int productID, float productPrice,
			int ram, String os, int sdCard) {
		
		this.productName = productName;
		this.productID = productID;
		this.productPrice = productPrice; 
		this.ram = ram;
		this.os = os;
		this.sdCard = sdCard;
	}
	
	void showProductDetails() {
		System.out.println("Company CEO    : "+getCompanyCEO());
		System.out.println("Product ID     : "+productID);
		System.out.println("Product Name   : "+productName);
		System.out.println("Product Price  : "+productPrice);
		System.out.println("Product RAM    : "+ram);
		System.out.println("Product OS     : "+os);
		System.out.println("Product SDCard : "+sdCard);
	}
}
