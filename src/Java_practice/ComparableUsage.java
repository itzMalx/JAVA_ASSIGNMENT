package Java_practice;
import java.io.*;
import java.util.*;
class Mobile implements Comparable<Mobile>{
	private String name;
	private int ram;
	private int price;
	Mobile(String name, int ram, int price){
		this.name = name;
	    this.ram = ram;
		this.price = price;
	}
	String getName() {
		return name;
	}
	int getRam() {
		return ram;
	}
	int getPrice() {
		return price;
	}
	void setRam(int ram) {
		this.ram = ram;
	}
	void setName(String name) {
		this.name = name;
	}
	void setPrice(int price) {
		this.price = price;
	}
	public int compareTo(Mobile o) {
		if(this.ram > o.getRam()) {
			return 1;
		}
		else {
			return -1;
		}
	}
	
}

public class ComparableUsage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Mobile> mobileList = new ArrayList<>();
		mobileList.add(new Mobile("Redmi",16,800));
		mobileList.add(new Mobile("Apple",8,100));
		mobileList.add(new Mobile("Samsung",4,600));
		Collections.sort(mobileList);
		System.out.println("Mobiles After Sorting : ");
		System.out.println("Name"+"\t"+"Ram"+"\t"+"Price");
		for(Mobile mb : mobileList) {
			System.out.println(mb.getName()+"\t"+mb.getRam()+"\t"+mb.getPrice());
		}
	}

}