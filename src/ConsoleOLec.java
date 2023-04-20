import java.util.Scanner;
public class ConsoleOLec {
    public static void main (String[] args){
        String name = "123";
        String cohortName ="Kotlin";
        System.out.print("Favorite number " + name + "\n" );
        System.out.println("Favorite number " + name);
        System.out.printf("Favorite Number is %s, and favorite cohort is %s %n", cohortName, name);


        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the day today? \n ");

        String userInput = scanner.next();
//        using println
//        System.out.println("You entered: --> \"" + userInput + "\" <--");
//        System.out.printf("You entered: %s %n" , userInput);



//
//       using nextint()
        System.out.println("Enter Something: ");
        String userInput2 = scanner.nextLine();
        System.out.print("You entered: " + userInput2);



        System.out.println("Enter a number: ");
        int userNum = scanner.nextInt();
        System.out.print("Your favorite number is: " + userNum);

    }
}
