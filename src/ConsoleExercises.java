import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args){
        double pi = 3.14159;
        System.out.printf("| %-10s | %-8s | %4s |%n", "NUMBER", "SQUARED", "CUBED");
        System.out.printf("The value of Pi is: %.2f \n" ,pi);

        Scanner scanner= new Scanner(System.in);
////        System.out.println("Enter a Int:  \n");
//
//        int userNum = scanner.nextInt();
//
//        System.out.println("You entered: --> \"" + userNum + "\" <--");
//
//        System.out.println("Enter three words:  \n");
//
//
//        String userInput1 = scanner.next();
//        String userInput2 = scanner.next();
//        String userInput3 = scanner.next();
//
//        System.out.println("You entered: --> \"" + userInput1 + "\" <--");
//        System.out.println("You entered: --> \"" + userInput2 + "\" <--");
//        System.out.println("You entered: --> \"" + userInput3 + "\" <--");
//
//        System.out.println("Enter a sentence");
//
//        String userSentence = scanner.nextLine();
//
//        System.out.println("You entered: --> \"" + userSentence + "\" <--");


        System.out.println("Enter the length of your classroom");
        String userLength = scanner.nextLine();
        System.out.println("You entered: --> \"" + userLength + "\" <--");

        System.out.println("Enter the width of your classroom");
        String userWidth = scanner.nextLine();
        System.out.println("You entered: --> \"" + userWidth + "\" <--");

        int width = Integer.parseInt( userWidth );
        int length = Integer.parseInt( userLength );


        System.out.println("The area of your class is --> \"" + width * length + "\" <--");
        System.out.println("The perimeter of your class is --> \"" + 2 * width * 2 * length + "\" <--");





    }
}
