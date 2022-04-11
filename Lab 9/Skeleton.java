import java.util.Scanner;

public class Skeleton {
    public static void main(String[] args) {
        final double ASSIGNMENT_PERCENTAGE = 0.3;
        final double ATTENDANCE_PERCENTAGE = 0.05;
        final double MIDTERM_PERCENTAGE = 0.3;

        Scanner scan = new Scanner(System.in);
        // Initialize array of integers

        // 5 Graded assignments
        int[] assignmentGrades = new int[5];
        int labsAttended;
        int midtermGrade;

        double assignmentsTotal=0.0, attendanceTotal=0.0, midtermTotal=0.0;

        // for loop to get user input & store in array
        for (int i = 0; i < assignmentGrades.length; i++) {
            System.out.print("Enter assignment "+ (i+1) +" grade: ");
            assignmentGrades[i] = scan.nextInt();
        }
        System.out.println();
        System.out.print("Enter number of labs attended: ");
        labsAttended = scan.nextInt();

        System.out.println();
        System.out.print("Enter a midterm grade: ");
        midtermGrade = scan.nextInt();

        // for loop to iterate over the array & perform calculations
        for (int i = 0; i < assignmentGrades.length; i++) {
            assignmentsTotal +=assignmentGrades[i];
        }
        assignmentsTotal = (assignmentsTotal/assignmentGrades.length)*ASSIGNMENT_PERCENTAGE;
        attendanceTotal = ((labsAttended/7.0)*100)*ATTENDANCE_PERCENTAGE;

        midtermTotal = midtermGrade*MIDTERM_PERCENTAGE;
        // display output to user

        System.out.println("Assignments (30%): "+assignmentsTotal+"\n");
        System.out.println("Attendance (5%): "+attendanceTotal+"\n");
        System.out.println("Midterm (30%): "+midtermTotal+"\n");
    }
}