package OOPS;

public class Product {
	
	private String companyCEO;
	String productName;
	int productID;
	float productPrice;
	
	Product() {
		System.out.println(">> Product Details");
	}
	
	void setProductDetails(String productName, int productID, float productPrice) {
		this.productName = productName;
		this.productID = productID;
		this.productPrice = productPrice; 
	}
	
	void showProductDetails() {
		System.out.println("Product ID    : "+productID);
		System.out.println("Product Name  : "+productName);
		System.out.println("Product Price : "+productPrice);
	}
	
	void setCompanyCEO(String companyCEO) {
		this.companyCEO = companyCEO;
	}
	
	String getCompanyCEO() {
		return companyCEO;
	}
	
}
