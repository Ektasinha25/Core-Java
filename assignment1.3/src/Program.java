import java.util.Scanner;

public class Program {

	public static int menuList() {
		Scanner sc = new Scanner(System.in);
		System.out.println("0. Exit");
		System.out.println("1. Dosa");
		System.out.println("2. idli");
		System.out.println("3. Samosa");
		System.out.println("4. Generate Bill");
		System.out.println("Enter you Choice");
		int choice = sc.nextInt();
		return choice;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice, quantiy;
		double total = 0;
		
		while((choice = menuList())!=0) {
			
			if(choice == 4) {
				System.out.println("your total bill is: rs." + total);
				break;
			}
			
			System.out.println("Enter quantity");
			int quantity = sc.nextInt();
			
			switch(choice) {
			case 1:
				total += 30 * quantity;
				System.out.println(quantity + "dosa added");
				break;
				
			case 2:
				total += 25 * quantity;
				System.out.println(quantity + "idli added");
				break;
				
			case 3: 
				total += 10 * quantity;
				System.out.println(quantity + "samosa added");
				break;
			}
			
			System.out.println("--------------");
		}
	}
}
		
	