
import java.io.FileReader;
import java.io.IOException;

public class MainClass {

	public static void main(String[] args) throws IOException {

	
		FileReader fw = new FileReader("C:\\Users\\saons\\Desktop\\Example\\saon.txt");
		
		int ch;
		
		while((ch=fw.read())!=-1) {
			System.out.print((char)(ch));
		}
		fw.close();
	

	}

}
