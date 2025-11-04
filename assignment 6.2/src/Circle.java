
// Custom exception class
class NegativeDiameterException extends Exception {
    public NegativeDiameterException() {
        super("Diameter cannot be negative");
    }
}

// Circle class
public class Circle {
    // Attributes (center coordinates and diameter)
    private double myX;
    private double myY;
    private double myDiameter;

    // Default constructor
    public Circle() {
        this.myX = 0.0;
        this.myY = 0.0;
        this.myDiameter = 100.0;
    }

    // Parameterized constructor
    public Circle(double x, double y, double diameter) throws NegativeDiameterException {
        if (diameter < 0) {
            throw new NegativeDiameterException();
        }
        this.myX = x;
        this.myY = y;
        this.myDiameter = diameter;
    }

    // Accessor methods
    public double getMyX() {
        return myX;
    }

    public double getMyY() {
        return myY;
    }

    public double getMyDiameter() {
        return myDiameter;
    }

    // Mutator (setter) for diameter — maintaining class invariant
    public void setMyDiameter(double diameter) throws NegativeDiameterException {
        if (diameter < 0) {
            throw new NegativeDiameterException();
        }
        this.myDiameter = diameter;
    }

    // Display circle information
    public void display() {
        System.out.println("Center: (" + myX + ", " + myY + ")");
        System.out.println("Diameter: " + myDiameter);
    }

    // Main method to test the Circle class
    public static void main(String[] args) {
        try {
            // Default circle
            Circle c1 = new Circle();
            System.out.println("Default Circle:");
            c1.display();

            // Custom circle
            Circle c2 = new Circle(5.5, 3.2, 50);
            System.out.println("\nCustom Circle:");
            c2.display();

            // Attempt to set negative diameter (will throw exception)
            System.out.println("\nTrying to set negative diameter...");
            c2.setMyDiameter(-10);

        } catch (NegativeDiameterException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

