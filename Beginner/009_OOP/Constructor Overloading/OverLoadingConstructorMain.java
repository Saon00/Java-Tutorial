package OOP;

public class OverLoadingConstructorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OverLoadingConstructorSub hibro = new OverLoadingConstructorSub();
		hibro.show();
		System.out.println();
		OverLoadingConstructorSub hibro1 = new OverLoadingConstructorSub("Saon", 22);
		hibro1.show();
		System.out.println();
		OverLoadingConstructorSub hibro2 = new OverLoadingConstructorSub("Srabon", 21, "Male");
		hibro2.show();

	}

}
