package OOPS;

public class LEDTV extends Product {

	String brandName;
	String technology;

	// overLoading
	void setProductDetails(String productName, int productID, float productPrice, String brandName, String technology) {
		this.productName = productName;
		this.productID = productID;
		this.productPrice = productPrice;
		this.brandName = brandName;
		this.technology = technology;
	}

	// overriding
	void showProductDetails() {
		System.out.println("Product ID    	 : " + productID);
		System.out.println("Product Name  	 : " + productName);
		System.out.println("Product Price 	 : " + productPrice);
		System.out.println("LEDTV Brand Name : " + brandName);
		System.out.println("LEDTV Techology  : " + technology);
	}

}
