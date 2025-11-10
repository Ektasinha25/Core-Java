import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		ArrayList<String> state = new ArrayList<>();
		
		state.add("Madhya Pradesh");
		state.add("Kerela");
		state.add("Rajasthan");
		state.add("tamil nadu");
		
		System.out.println("Original list: " + state);
		
		state.set(1, "Gujrat");
		
		System.out.println("Modified list: " + state);
	}

}
