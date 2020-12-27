//By implementing Runnable interface.

public class MultiPractise implements Runnable{

	public static void main(String[] args) {
		
		MultiPractise multiPrac = new MultiPractise();
		multiPrac.run();
		
	}
	
	public void run() {
		System.out.println("Threads are running......");
	}
}
