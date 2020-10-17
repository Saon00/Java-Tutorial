package OOPS;

public class MainClass {

	public static void main(String[] args) {

		Product product = new Product();
		product.setProductDetails("IPhoneX", 101, 1_10_000);
		product.showProductDetails();

		System.out.println();

		Product product2 = new Product();
		product2.productName = "Samsung Note 10";
		product2.productID = 102;
		product2.productPrice = 1_20_000;
		product2.showProductDetails();

		System.out.println();

		// LEDTV
		LEDTV ledtv = new LEDTV();
//		Product ledtv = new LEDTV(); // if i use this, then I won't use new two parameters 
		ledtv.setProductDetails("SONY LED TV", 201, 56_000, "SONY", "4K");
		ledtv.showProductDetails();
		
		System.out.println();
		
		// MOBILE
		MOBILE mobile = new MOBILE();
		mobile.setCompanyCEO("Saon Srabon");
		mobile.setProductDetails("Xiaomi", 301, 40_000, 6, "Android", 128);
		mobile.showProductDetails();

	}

}
