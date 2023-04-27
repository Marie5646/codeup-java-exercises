package util;
import java.util.Scanner;

public class Input {


    private final Scanner scanner;


    public Input(Scanner scanner) {
        this.scanner = scanner;
    }

    public Input() {
        scanner = new Scanner(System.in);
    }

    public String getString(String Prompt) {
        System.out.println(Prompt);
        return scanner.nextLine();

    }





//    public boolean yesOrNo() {
//        String userInput = getString("Enter [yes/no");
//        if (userInput.equals("yes")) {
//            return true;
//        } else if (userInput.equals("no")) {
//            return false;
//
//        }


        public int getInt(int min, int max) {

            System.out.print("Enter a number between " + min + " & " + max);
            int userNum = scanner.nextInt();
            if (userNum > min & userNum < max) {
                return userNum;
            }
            return getInt(min,max);
        }

        public int getInt() {
            System.out.print("Enter a number");
            int userNum1 = scanner.nextInt();
            return userNum1;

        }


        public double getDouble( double min, double max){
            System.out.println("Enter a number between " + min + " & " + max);
            double userNum = scanner.nextDouble();
            if (userNum < min & userNum > max) {
                return getDouble(min, max);
            }
            return userNum;
        }


        public double getDouble () {
            System.out.print("Enter a number");
            double userDouble = scanner.nextInt();
            return userDouble;
        }


    }







