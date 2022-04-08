import java.io.*;
import java.util.Scanner;

public class ExpensesTracker {
    public static void main(String[] args) throws IOException{
        // Create FileWriter & Scanner objects & y/n string
        Scanner scan = new Scanner(System.in);

        FileWriter fileWriter = new FileWriter("expenses.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        PrintWriter printWriter = new PrintWriter(bufferedWriter);

        Scanner fileScan = new Scanner(new File("expenses.txt"));

        boolean again;
        String name;
        String itemPurchased;
        double amountPaid;

        // Start gathering information inside the loop you will start
        do{
            System.out.print("Enter your name: ");
            name = scan.nextLine();

            System.out.print("What did you purchase? ");
            itemPurchased = scan.nextLine();

            System.out.print("How much did you pay? (in USD) ");
            amountPaid = Double.parseDouble(scan.nextLine());

            printWriter.write(name + " purchased "+itemPurchased+ " for "+ amountPaid + " US Dollars.\n");

            System.out.print("Would you like to log another purchase? (Y/N) ");
            String userAnswer = scan.nextLine();

            if(userAnswer.equals("Y") || userAnswer.equals("y")){
                again=true;
            }else {
                System.out.println("Get off of ZoodMall!");
                again= false;
            }
        }while(again);

        printWriter.close();
        fileWriter.close();

        System.out.print("Would you like to read a summary of your purchases? (Y/N) ");
        String readSummary = scan.nextLine();

        if(readSummary.equals("Y") || readSummary.equals("y")){
            while(fileScan.hasNextLine()){
                System.out.println(fileScan.nextLine());
            }
        }
        // Close ClassWriter & Scanner objects
        scan.close();
        fileScan.close();
    }
}
