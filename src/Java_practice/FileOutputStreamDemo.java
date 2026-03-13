package Java_practice;
import java.io.FileOutputStream;
public class FileOutputStreamDemo {
	public static void main(String[]args) {
		String data="Welcome to java portal!!!Have a happy learing";
		try {
			FileOutputStream output=new FileOutputStream("output.txt");
			byte[]array=data.getBytes();
			output.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
