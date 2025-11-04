
public class Program {
	
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("nitin");
		StringBuilder reverse = sb.reverse();
		
		if(sb == reverse) {
			System.out.println("String is a palindrome"); 
		}
		else {
			System.out.println("String is not a palindrome"); 
		}
	}
}
