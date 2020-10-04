package Others;

public class CallByReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallRefer objCallRefer=new CallRefer();
		 objCallRefer.name="Srabon";
		 System.out.println("Before Calling the Name : "+objCallRefer.name);
		 
		 objCallRefer.main(objCallRefer);
		 System.out.println("After Calling the Name : "+objCallRefer.name);
		 
	}

}
