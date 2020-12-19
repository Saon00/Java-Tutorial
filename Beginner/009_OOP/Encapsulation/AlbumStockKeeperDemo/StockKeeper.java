package youtubeTutorials;

public class StockKeeper {

	private String name;

	public StockKeeper(String name) {
		this.name = name;
	}

	public void manageAlbum(Albums albums, String name, String artist, 
			double price, int numberOfCopies) {

		albums.setName(name);
		albums.setArtist(artist);
		albums.setPrice(price);
		albums.setNumberOfCopies(numberOfCopies);
		
		System.out.println("Album managed by :" + this.name);
		System.out.println("Album details::::::::::");
		System.out.println("Album name : " + albums.getName());
		System.out.println("Album artist : " + albums.getArtist());
		System.out.println("Album Price ~ TotalPrice : " + albums.getPrice()+" ~ "+(albums.getPrice()*albums.getNumberOfCopies()));
		System.out.println("Album number of copies : " + albums.getNumberOfCopies());
		System.out.println("Album number of Remaining copies : " + albums.sellCopies()+"/100");
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;

	}
}