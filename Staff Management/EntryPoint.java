import java.util.Scanner;

public class EntryPoint {

    public static void main(String[] args) {
        String firstName;
        String lastName;
        int age;
        double salary;

        Scanner scan = new Scanner(System.in);

        System.out.print("Please input the employee's First Name: ");
        firstName = scan.nextLine();

        System.out.print("Please input the employee's Last Name: ");
        lastName = scan.nextLine();

        System.out.print("Please input the employee's Age: ");
        age = scan.nextInt();

        System.out.print("Please input the employee's Salary: ");
        salary = scan.nextDouble();

        Employee employee = new Employee(firstName, lastName, age, salary);

        System.out.println(employee.toString());



        // Bonus Part
        int random = (int)(Math.random()*10+1);
        Employee[] employeesList = new Employee[random];
        int insertions = random;
        for(int i=0; i<random; i++){

            System.out.println("You have "+(insertions--)+" insertions left !!");

            System.out.print("Please input the employee's First Name: ");
            firstName = scan.nextLine();

            System.out.print("Please input the employee's Last Name: ");
            lastName = scan.nextLine();

            System.out.print("Please input the employee's Age: ");
            age = Integer.parseInt(scan.nextLine());

            System.out.print("Please input the employee's Salary: ");
            salary = Double.parseDouble(scan.nextLine());

            employeesList[i] = new Employee(firstName, lastName, age, salary);

        }

        for (Employee value : employeesList) {
            System.out.println(value.toString());
        }
    }
}
