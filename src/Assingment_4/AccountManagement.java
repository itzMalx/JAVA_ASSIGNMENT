package Assingment_4;
class Account {
	private String id;
	private String name;
	private int balance;
	Account(String id, String name){
		this.id = id;
		this.name = name;
		this.balance = 0;
	}
	Account(String id, String name, int balance){
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getBalance() {
		return balance;
	}
	public int credit(int amount) {
		balance += amount;
		return balance;
	}
	public int debit(int amount) {
		if(amount <= balance) {
			balance -= amount;
		} else {
			System.out.println("Amount exceeded balance");
		}
		return balance;
	}
	public int transferTo(Account another, int amount) {
		if(amount <= balance) {
			this.balance -= amount;
			another.balance += amount;
		} else {
			System.out.println("Amount exceeded balance");
		}
		return balance;
	}
	public String toString() {
		return "Account[id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}
}
public class AccountManagement {
	public static void main(String[] args) {
		Account a1 = new Account("A101","Ram",5000);
		Account a2 = new Account("A102","Ravi");
		System.out.println(a1);
		System.out.println(a2);
		a1.credit(2000);
		a1.debit(1000);
		a1.transferTo(a2,1500);
		System.out.println("After Transactions:");
		System.out.println(a1);
		System.out.println(a2);
	}
}
