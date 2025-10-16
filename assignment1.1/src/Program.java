import java.util.Scanner;
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Java Test");
		System.out.print("Enter Number: ");
		num = sc.nextInt();
		System.out.println("Number: "+ num);
		
		String binary = Integer.toBinaryString(num);
		System.out.println("Binary equivalent: "+ binary);
		
		String hexa = Integer.toHexString(num);
		System.out.println("Hexadecimal equivalent : "+ hexa);
		
		String octal = Integer.toOctalString(num);
		System.out.println("Octal equivalent : "+ octal);
	}

}
