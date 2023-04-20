import java.util.Scanner;

public class Bob {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String userInput = scanner.next();
        boolean confirm;


        do {


            if (userInput.contains("!")) {
                System.out.println("Whoa, chill out!");
            } else if (userInput.equals("")) {
                System.out.println("Fine. Be that way!");
            } else if (userInput.contains("?")) {
                System.out.println("Sure");
            } else {
                System.out.println("Whatever");
            }

            System.out.println("Do you want to continue. [y/n]");
            confirm = scanner.next().equalsIgnoreCase("y");
        } while(confirm);


    }

    }




