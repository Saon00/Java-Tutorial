package Abstract_Method;

public abstract class ClassSaon {

	void call() {
		System.out.println("I am Call method");
	}

	/*
	 * before calling this non-abstract method it was 100% abstract method. But if
	 * we add a non-abstract method it becomes in a 0 to 100% abstraction formula
	 */

	abstract void message();

}
