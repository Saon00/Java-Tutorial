package File;

import java.io.File;

public class FileCreateClass {

	public static void main(String[] args) {

		// you can create folder in default path
		// File file = new File("example");

		File file = new File("C:\\Users\\saons\\Desktop\\Example");
		file.mkdir();

		// to get the file path
		System.out.println(file.getAbsolutePath());

		// to get the file name
		System.out.println(file.getName());

		// to delete file
		file.delete();

//		if(file.delete()) {
//			System.out.println(file.getName()+" is deleted"); }

	}

}
