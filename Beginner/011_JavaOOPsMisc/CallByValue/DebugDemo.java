package Others;

public class DebugDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		CallByValue object=new CallByValue();
		
		int x=10;
		System.out.println("First Value of x = "+x);
		
		object.change(x);
		System.out.println("Second vlaue of x = "+x);
		
	}

}
