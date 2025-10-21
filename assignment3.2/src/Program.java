import java.util.Scanner;

class Customer{
	
	private int accNum;
	private int balance;
	private int chargedNum;
	private int creditApplied;
	private int creditLimit;
	
	public Customer(int accNum, int balance, int chargedNum, int creditApplied, int creditLimit) {
		this.accNum = accNum;
		this.balance = balance;
		this.chargedNum = chargedNum;
		this.creditApplied = creditApplied;
		this.creditLimit = creditLimit;
	}
	
	public void newBalance() {
		int newBal = this.balance + this.chargedNum - this.creditApplied;
		System.out.println("New Balance: "+ newBal);
		
		if(newBal > creditLimit) {
			System.out.println("Credit limit exceeded");
		}
		else {
			System.out.println("Credit limit not exceeded");
		}
	}
}
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Account Number: "); 
		int accNum = sc.nextInt();
		
		System.out.print("balance at the beginning of the month : "); 
		int balance = sc.nextInt();
		
		System.out.print(" total of all items charged by the customer this month: "); 
		int chargedNum = sc.nextInt();
		
		System.out.print("total of all credits applied to the customer’s account this month: "); 
		int creditApplied = sc.nextInt();
		
		System.out.print(" allowed credit limit: "); 
		int creditLimit = sc.nextInt();
		
		Customer c = new Customer(accNum, balance,chargedNum, creditApplied, creditLimit);
		c.newBalance();
	}

}
