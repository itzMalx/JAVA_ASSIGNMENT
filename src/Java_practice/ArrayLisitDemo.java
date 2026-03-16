package Java_practice;
import java.util.*;
public class ArrayLisitDemo {
	public static void main(String[]args) {
		ArrayList<String>Arr=new ArrayList<String>();
		System.out.println("Inital Siza of Array List is"+Arr.size());
		Arr.add("C");
		Arr.add("A");
		Arr.add("E");
		Arr.add("B");
		Arr.add("D");
		Arr.add("F");
		Arr.add(1,"G");
		System.out.println("After Insert the size of array list is"+Arr.size());
		System.out.println("Contents of ArrayList"+Arr);
		Arr.remove("F");
		Arr.remove(2);
		System.out.println("Contents of ArrayList"+Arr);
	}

}
