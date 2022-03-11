import java.util.Scanner;

public class Calculator {
    private int num1;
    private int num2;
    private String operator;
    private String output = "";

    // Constructor to initialize the calculator
    public Calculator() {
        // Get user input
        Scanner scanCalc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        num1 = Integer.parseInt(scanCalc.nextLine());

        System.out.print("Enter an operator: ");
        operator = scanCalc.nextLine();

        System.out.print("Enter the second number: ");
        num2 = Integer.parseInt(scanCalc.nextLine());

        switch (operator){
            case "+":
                output = add(num1, num2);
                break;

            case "-":
                output = subtract(num1, num2);
                break;

            case "*":
                output = multiply(num1, num2);
                break;

            case "/":
                output = divide(num1, num2);
                break;

            default:
                break;

        }
        System.out.println(output);
    }

    public String add(int a, int b) {
        return num1+" + "+ num2 + " = " +(a+b);
    }

    public String subtract(int a, int b) {
        return  num1+" - "+ num2 +" = " +(a-b);
    }

    public String multiply(int a, int b) {
        return  num1+" x "+ num2 +" = "+(a*b);
    }

    public String divide(int a, int b) {
        return  num1+" / "+ num2 +" = "+(a/b);
    }
}