import java.sql.SQLOutput;
import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {
//        1a.Create an integer variable i with a value of 5.
//        1b.Create a while loop that runs so long as i is less than or equal to 15
//        1c. Each loop iteration, output the current value of i, then increment i by one.

//        int i = 5;
//        while (i < 16) {
//            System.out.println("i is " + i++);
//        }
//          4.for(int i = 5; i < 16; i ++) {
//            System.out.println("i is " + i);
//        }
//}
//        2a Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.

//        int i = 0;
//        do {
//            System.out.println(i += 2);
//        } while (i < 100);

//       4. for (int i = 0; i < 100; i += 2) {
//            System.out.println("i is " + i);

//        2b Alter your loop to count backwards by 5's from 100 to -10.

//
//        int i = 105;
//        do {
//            System.out.println(i -= 5);
//        } while (i > -10);

//       4. for(int i = 105; i > -15 ; i -= 5) {
//            System.out.println("i is " + i);
//        }


//        2c Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less       than 1,000,000. Output should equal:

//         long i = 2;
//        do {
//            System.out.println(i);
//              i*= i
//        } while (i < 1000000);

//
//        4. for(long i = 2; i < 1000000 ; i *= i) {
//            System.out.println("i is " + i);
//        }

//       3a Write a program that prints the numbers from 1 to 100.
//       3b For multiples of three: print “Fizz” instead of the number.
//       3c For numbers which are multiples of both three and five: print “FizzBuzz”.
//        for (int i = 0; i <= 100; i++) {
//            if (i % 5 == 0 & i % 3 == 0) {
//                System.out.println("Fizz");
//                continue;
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//                continue;
//            } else if (i % 3 == 0) {
//                System.out.println("FizzBuzz");
//            } else {
//                System.out.println(i);
//            }
//        }
//        Prompt the user to enter an integer.
//        Display a table of squares and cubes from 1 to the value entered.
//        Ask if the user wants to continue.
//        Assume that the user will enter valid data.
//        Only continue if the user agrees to.


        Scanner scanner = new Scanner(System.in);

//        boolean confirm;
//        do {
//            System.out.println("What number would you like to go up to today");
//            String userNum = scanner.nextLine();
//
//            System.out.println("Here is your table");
//            System.out.printf("| %-10s | %-8s | %4s |%n", "NUMBER", "SQUARED", "CUBED");
//
//
//            int num = Integer.parseInt(userNum);
//
//            for (long i = 0; i <= num; i++) {
//                long squared = i * i;
//                long cubed = i * i * i;
//                long number = i;
//
//                System.out.printf("| %-10s | %-8s | %4s |%n", number, squared, cubed);
//            }
//
//            System.out.print("Continue? [y/n]");
//            confirm = scanner.next().equalsIgnoreCase("y");
//        } while (confirm);
//        System.out.println("Thank you");


//        Prompt the user for a numerical grade from 0 to 100.
//        Display the corresponding letter grade.
//        Prompt the user to continue.
//        Assume that the user will enter valid integers for the grades.
//        The application should only continue if the user agrees to.
//        Grade Ranges:


        System.out.println("Enter your number grade");
        String userGrade = scanner.nextLine();

        int grade = Integer.parseInt(userGrade);

        boolean confirm;

       do {
           if (grade >= 88) {
               System.out.println("A");
           } else if (grade >= 80) {
               System.out.println("B");
           } else if (grade >= 67) {
               System.out.println("C");
           } else if (grade >= 60) {
               System.out.println("D");
           } else {
               System.out.println("F");
           }

           System.out.print("Continue? [y/n]");
            confirm = scanner.next().equalsIgnoreCase("y");
       }while (confirm);
        System.out.print("Thank you");

    }
}








