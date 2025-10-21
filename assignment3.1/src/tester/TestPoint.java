package tester;
import com.app.geometry.Point2D;
import java.util.Scanner;

public class TestPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x cords :");
		double x = sc.nextDouble();
		System.out.print("Enter y cords :");
		double y = sc.nextDouble();
		Point2D p1 = new Point2D(x,y);
		
		
		
		System.out.print("Enter x2 cords :");
		double x2 = sc.nextDouble();
		System.out.print("Enter y2 cords :");
		double y2 = sc.nextDouble();
		Point2D p2 = new Point2D(x2,y2);
		
		String detail1 = p1.getDetail();
		System.out.println(detail1);
		
		String detail2 = p2.getDetail();
		System.out.println(detail2);
		
		boolean result = p1.isEqual(p1, p2);
		System.out.println(result);
		
		double distance = p1.calculateDistance(p1, p2);
		System.out.println("Distance: "+ distance);
	}

}
