import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UdemyArrayList{

	public static void main(String[] args) {

		// ArrayList's default or initial capacity is 10.
		List<Employee> employeeList = new ArrayList<>();

		employeeList.add(new Employee("Saon", "Sikder", 2502));
		employeeList.add(new Employee("Sakib", "Al Hasan", 2505));
		employeeList.add(new Employee("Md", "Muaz", 2517));
		employeeList.add(new Employee("Momenatul", "Islam", 2522));
		employeeList.add(new Employee("Anamul", "Haq", 2523));

		// Lambda Expressions
		employeeList.forEach(employe -> System.out.println(employe));

		// Get any specific index's item
		System.out.println(employeeList.get(1));

		// Checking is it empty or not
		System.out.println(employeeList.isEmpty());

		// To replace any items
		employeeList.set(1, new Employee("Rafsan", "Riki", 2503));
		employeeList.forEach(employe -> System.out.println(employe));

		System.out.println(employeeList.size());

		// Add new ArrayList in any index
		employeeList.add(2, new Employee("Mr.", "X", 0000));
		employeeList.forEach(employe -> System.out.println(employe));
		System.out.println("------------------");

		// ----------
		Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
		for (Employee employee : employeeArray)
			System.out.println(employee);

		// Checking any object is containing or not
		System.out.println("Is Md Muaz 2517 is Available in the ArrayList: "
				+ employeeList.contains(new Employee("Md", "Muaz", 2517)));
		System.out.println("Index of Md Muaz 2517: " + employeeList.indexOf(new Employee("Md", "Muaz", 2517)));

		// Remove any object
		employeeList.remove(2);

		// Printing output with Iterator
		for (Iterator<Employee> iterator = employeeList.iterator(); iterator.hasNext();) {
			Employee employee = (Employee) iterator.next();
			System.out.println(employee);
		}
	}
}

/* Output:
Employee [firstName=Saon, lastName=Sikder, id=2502]
Employee [firstName=Sakib, lastName=Al Hasan, id=2505]
Employee [firstName=Md, lastName=Muaz, id=2517]
Employee [firstName=Momenatul, lastName=Islam, id=2522]
Employee [firstName=Anamul, lastName=Haq, id=2523]

Employee [firstName=Sakib, lastName=Al Hasan, id=2505]

false

Employee [firstName=Saon, lastName=Sikder, id=2502]
Employee [firstName=Rafsan, lastName=Riki, id=2503]
Employee [firstName=Md, lastName=Muaz, id=2517]
Employee [firstName=Momenatul, lastName=Islam, id=2522]
Employee [firstName=Anamul, lastName=Haq, id=2523]

5
Employee [firstName=Saon, lastName=Sikder, id=2502]
Employee [firstName=Rafsan, lastName=Riki, id=2503]
Employee [firstName=Mr., lastName=X, id=0]
Employee [firstName=Md, lastName=Muaz, id=2517]
Employee [firstName=Momenatul, lastName=Islam, id=2522]
Employee [firstName=Anamul, lastName=Haq, id=2523]
------------------
Employee [firstName=Saon, lastName=Sikder, id=2502]
Employee [firstName=Rafsan, lastName=Riki, id=2503]
Employee [firstName=Mr., lastName=X, id=0]
Employee [firstName=Md, lastName=Muaz, id=2517]
Employee [firstName=Momenatul, lastName=Islam, id=2522]
Employee [firstName=Anamul, lastName=Haq, id=2523]
Is Md Muaz 2517 is Available in the ArrayList: true
Index of Md Muaz 2517: 3
Employee [firstName=Saon, lastName=Sikder, id=2502]
Employee [firstName=Rafsan, lastName=Riki, id=2503]
Employee [firstName=Md, lastName=Muaz, id=2517]
Employee [firstName=Momenatul, lastName=Islam, id=2522]
Employee [firstName=Anamul, lastName=Haq, id=2523]
*/
