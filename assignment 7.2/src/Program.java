import java.util.*;


class Student {
    private int roll;
    private String name;
    private String city;
    private double marks;

  
    public Student(int roll, String name, String city, double marks) {
        this.roll = roll;
        this.name = name;
        this.city = city;
        this.marks = marks;
    }


    public int getRoll() { return roll; }
    public String getName() { return name; }
    public String getCity() { return city; }
    public double getMarks() { return marks; }

  
    @Override
    public String toString() {
        return "Roll: " + roll + ", Name: " + name + ", City: " + city + ", Marks: " + marks;
    }
}

public class Program {
    public static void main(String[] args) {
        Student[] students = {
            new Student(101, "Ekta", "Mumbai", 85.5),
            new Student(102, "Aman", "Delhi", 92.0),
            new Student(103, "Riya", "Mumbai", 92.0),
            new Student(104, "Karan", "Delhi", 75.0),
            new Student(105, "Tina", "Chennai", 88.5)
        };

     
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
              
                int cityCompare = s2.getCity().compareToIgnoreCase(s1.getCity());
                if (cityCompare != 0)
                    return cityCompare;

             
                int marksCompare = Double.compare(s2.getMarks(), s1.getMarks());
                if (marksCompare != 0)
                    return marksCompare;

               
                return s1.getName().compareToIgnoreCase(s2.getName());
            }
        });

    
        System.out.println("Sorted Students:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}

