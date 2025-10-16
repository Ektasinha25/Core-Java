import java.util.Scanner;
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("number 1: ");
		
		if(sc.hasNextDouble()) {
			
			double d1 = sc.nextDouble();
			
			System.out.print("number 2: ");
			
			if(sc.hasNextDouble()) {
			double d2 = sc.nextDouble();
			
			double result = (d1+d2)/2;
			System.out.println("average: "+ result);
			}else {
				System.out.println("entered number is not double");
			}
		}
		else {
			System.out.println("entered number is not double");
		}
		
	}

}
