//By extending Thread class

public class MainClass extends Thread{

	public static void main(String[] args) {
		MainClass mainClass = new MainClass();
//		mainClass.start(); // good practice
		mainClass.run();
	}
	
	@Override
	public void run() {
		System.out.println("thread is runnig......");
	}
}
