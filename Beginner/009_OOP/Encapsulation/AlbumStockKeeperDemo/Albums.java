package youtubeTutorials;

public class Albums {
	
	private String name;
	private String artist;
	private double price;
	private int numberOfCopies;
	int totalNumberOfCopies=100;
	
	
	public int sellCopies() {
		return totalNumberOfCopies-=numberOfCopies;
	}
	public void oderCopies(int num) {
		numberOfCopies+=num;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if(price>0) {
			this.price = price;
		}else {
			this.price = 0.0;
		}
	}
	public int getNumberOfCopies() {
		return numberOfCopies;
	}
	public void setNumberOfCopies(int numberOfCopies) {
		if(numberOfCopies>0) {
			this.numberOfCopies = numberOfCopies;
		}else {
			this.numberOfCopies = 0;
		}
	}
}
