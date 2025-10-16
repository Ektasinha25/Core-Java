import java.util.Scanner;

class Invoice{
	
	private String partName;
	private String partDesc;
	private int quantity;
	private double price;
	
	public Invoice(String partName, String partDesc, int quantity, double price) {
		this.partName = partName;
		this.partDesc = partDesc;
		this.quantity = quantity;
		this.price = price;
	}
	
	public void setPartName(String partName) {
		this.partName = partName;
	}
	public String getPartName() {
		
		return this.partName;
	}
	
	public void setPartDesc(String partDesc) {
		this.partDesc = partDesc;
	}
	public String getPartDesc() {
		return this.partDesc;
	}
	
	public void setQuantity(int quantity) {
		if(this.quantity < 0) {
			this.quantity = 0;
		} else {
		this.quantity = quantity;}
	}
	public int getQuantity() {
		return this.quantity;
	}
	
	public void setPrice(double price) {
		if(this.price < 0) {
			this.price = 0;
		} else {
		this.price = price;}
	}
	public double getPrice() {
		return this.price;
	}
	
	public double invoiceAmount() {
		return this.quantity * this.price;
	}
	
	public void displayInvoice() {
		System.out.println("Inovide details: ");
		System.out.println("part name: "+ this.partName);
		System.out.println("part description: "+ this.partDesc);
		System.out.println("Quantity: "+ this.quantity);
		System.out.println("Price: "+ this.price);
		System.out.println("Total Invoice: "+ invoiceAmount());
	}

}

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("part name: ");
		String partName = sc.next();
		
		System.out.print("part Description : ");
		String partDesc = sc.nextLine();
		
		System.out.print("Quantity : ");
		int quantity = sc.nextInt();
		
		System.out.print("price : ");
		double price = sc.nextDouble();
		
		Invoice i = new Invoice(partName, partDesc, quantity, price);
		i.displayInvoice();
	}

}
