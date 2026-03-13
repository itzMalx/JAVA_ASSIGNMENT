package Assingment_4;
class Product{
	private int productId;
	private String productName;
	private double price;
	private int quantity;
	Product(int productId,String productName,double price,int quantity){
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}
	public void setQuantity(int newQty){
		if(newQty >= 0){
			this.quantity = newQty;
		}else{
			System.out.println("Invalid quantity");
		}
	}
	public double calculateTotal(){
		return price * quantity;
	}
	public String getProductDetails(){
		return "Product ID : "+productId+
			   "\nProduct Name : "+productName+
			   "\nPrice : "+price+
			   "\nQuantity : "+quantity+
			   "\nTotal : "+calculateTotal();
	}
	public int getProductId(){
		return productId;
	}
}
class Cart{
	private Product[] products;
	private int count;
	Cart(int size){
		products = new Product[size];
		count = 0;
	}
	public void addProduct(Product p){
		if(count < products.length){
			products[count++] = p;
		}else{
			System.out.println("Cart is full");
		}
	}
	public void removeProduct(int productId){
		boolean found = false;
		for(int i=0;i<count;i++){
			if(products[i].getProductId() == productId){
				found = true;
				for(int j=i;j<count-1;j++){
					products[j] = products[j+1];
				}
				count--;
				System.out.println("Product removed");
				break;
			}
		}
		if(!found){
			System.out.println("Product not found");
		}
	}
	public double calculateCartTotal(){
		double total = 0;
		for(int i=0;i<count;i++){
			total += products[i].calculateTotal();
		}
		return total;
	}
	public void displayCartItems(){
		System.out.println("---- CART ITEMS ----");
		for(int i=0;i<count;i++){
			System.out.println(products[i].getProductDetails());
			System.out.println();
		}
		System.out.println("Cart Total : "+calculateCartTotal());
	}
}
public class CartTest{
	public static void main(String[] args){
		Cart cart = new Cart(5);
		Product p1 = new Product(101,"Mouse",500,2);
		Product p2 = new Product(102,"Keyboard",800,1);
		Product p3 = new Product(103,"Headset",1200,1);
		cart.addProduct(p1);
		cart.addProduct(p2);
		cart.addProduct(p3);
		cart.displayCartItems();
		cart.removeProduct(102);
		System.out.println("\nAfter removal:");
		cart.displayCartItems();
	}
}
