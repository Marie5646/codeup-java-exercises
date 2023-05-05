package Contacts;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.io.BufferedReader;

public class Contacts {


    public Contacts() throws IOException {
    }

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);


        int choice;

        do {
            System.out.println("1. View contacts");
            System.out.println("2. Add a new contact.");
            System.out.println("3. Search a contact by name.");
            System.out.println("4. Delete an existing contact.");
            System.out.println("5. Exit.");
            System.out.print("Enter an option (1, 2, 3, 4 or 5): ");

            choice = input.nextInt();

            switch (choice) {
                case 1:
                    viewContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    searchByName();
                    break;
                case 4:
//                    System.out.println("What name would you like to delete?");
//                    String deleteLine = input.nextLine();
//                    input.nextLine();
//                    deleteContact("/Users/asiaautrey/IdeaProjects/codeup-java-exercises/src/Contacts/contacts.txt",deleteLine);
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice, please try again");
            }
        } while (choice != 5);
    }

    public static void viewContacts() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("/Users/asiaautrey/IdeaProjects/codeup-java-exercises/src/Contacts/contacts.txt"));
        String line = reader.readLine();
        while (line != null) {
            System.out.println(line);
            // read next line
            line = reader.readLine();
        }
    }


    public static void addContact() throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a name");
        String name = input.nextLine();
        System.out.println("Enter phone number");
        String phoneNumber = input.nextLine();
        File addfile = new File("/Users/asiaautrey/IdeaProjects/codeup-java-exercises/src/Contacts/contacts.txt");
        if (!addfile.exists()) {
            addfile.createNewFile();
        }
        FileWriter fw = new FileWriter(addfile, true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);
        pw.printf(name + "|" + phoneNumber);

        System.out.println("Data successfully appended at the end of file");
    }


    public static void searchByName() throws IOException {
        List<String> allLines = Files.readAllLines(Paths.get("/Users/asiaautrey/IdeaProjects/codeup-java-exercises/src/Contacts/contacts.txt"));
        System.out.println("What name would you like to search?");
        Scanner input = new Scanner(System.in);
        String search;
        search = input.nextLine();

        for (String line : allLines) {
            if (line.contains(search)) {
                System.out.println(line);
              break;
            }
        }

    }

//    public static void deleteContact() throws IOException {
//        System.out.print("Enter name to delete: ");
//        String name = input.next();
//
//        List<String> lines = Files.readAllLines(filepath, charConvert);
//
//        boolean found = false;
//        for (int i = 0; i < lines.size(); i++) {
//            if (lines.get(i).toLowerCase().contains(name.toLowerCase())) {
//                System.out.println("Are you sure you want to delete this contact?");
//                System.out.println(lines.get(i));
//                System.out.println("Enter y for yes or n for no:");
//                String choice = input.next();
//
//                if (choice.equalsIgnoreCase("y")) {
//                    lines.remove(i);
//                    System.out.println("Contact deleted");
//                } else {
//                    System.out.println("Contact not deleted");
//                }
//
//                found = true;
//                break;
//            }
//        }
//
//        if (!found) {
//            System.out.println("No contacts found for name: " + name);
//        } else {
//            Files.write(filepath, lines, charConvert);
//        }
//    }


}













    


