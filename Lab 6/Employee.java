import java.util.Scanner;
import java.text.NumberFormat;

public class Employee {
    // Initializing variables
    private String firstName;
    private String lastName;
    private int age;
    private double salary;
    NumberFormat formatter = NumberFormat.getCurrencyInstance();

    public Employee() {
        // Get user input
        Scanner scan = new Scanner(System.in);

        System.out.print("Please input the employee's First Name: ");
        firstName = scan.nextLine();

        System.out.print("Please input the employee's Last Name: ");
        lastName = scan.nextLine();

        System.out.print("Please input the employee's Age: ");
        age = scan.nextInt();

        System.out.print("Please input the employee's Salary: ");
        salary = scan.nextDouble();

        System.out.println(this);

    }

    public String toString() {
        return "Employee Information: "+firstName+" "+lastName+", "+age+", "+formatter.format(salary);
    }
}