package Assignment;
import java.util.*;
public class ClothShowroom {
  public static void main(String[] args) {
	  Scanner in = new Scanner(System.in);
	  int cost = in.nextInt();
	  double paid;
	  if(cost < 2000) {
		  paid = cost-(cost*0.05);
	  }else if(cost >= 2000 && cost < 5000) {
		  paid = cost-(cost*0.25);
	  }else if(cost >= 5000 && cost < 10000) {
		  paid = cost-(cost*0.35);
	  }else {
		  paid = cost-(cost*0.50);
	  }
	  System.out.println(paid+" ");
	  in.close();
  }
}
