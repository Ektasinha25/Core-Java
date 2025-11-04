import java.util.Scanner;

class ExceptionLineTooLong extends Exception {
    public ExceptionLineTooLong() {
        super("The string is too long");
    }
}

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	     System.out.println("Enter a string: ");
	     String input = sc.nextLine();
	     

	        try {
	            int length = input.length();
	            System.out.println("Length of the string: " + length);

	            if (length > 80) {
	               
	                throw new ExceptionLineTooLong();
	            }

	            System.out.println("The string length is acceptable.");

	        } catch (ExceptionLineTooLong e) {
	           
	            System.out.println("Error: " + e.getMessage());
	        }

	        sc.close();
	}

}
