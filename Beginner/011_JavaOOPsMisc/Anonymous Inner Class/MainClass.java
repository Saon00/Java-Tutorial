package Others;

public class MainClass {

	public static void main(String[] args) {

		SubClass sub = new SubClass() {

			@Override
			void message() {

				System.out.println(name);
			}
		};

		sub.message();

	}

}
