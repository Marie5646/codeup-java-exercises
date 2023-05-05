package grades;

import java.util.HashMap;
import java.util.Scanner;

public interface GradesApplication {


    public static void main(String[] args){

        HashMap<String,Student> students = new HashMap<>();

        Student Lisa= new Student("Lisa");
        Student Joanne= new Student("Joanne");
        Student Paul= new Student("Paul");
        Student Joe= new Student("Joe");



        Lisa.addGrades(77);
        Lisa.addGrades(66);
        Lisa.addGrades(88);
        Joe.addGrades(80);
        Joe.addGrades(70);
        Joe.addGrades(100);
        Paul.addGrades(55);
        Paul.addGrades(60);
        Paul.addGrades(47);
        Joanne.addGrades(83);
        Joanne.addGrades(74);
        Joanne.addGrades(105);

        students.put("lisa009",Lisa);
        students.put("JOJOgirl",Joanne);
        students.put("paul1980",Paul);
        students.put("JoeyJoe",Joe);
        String choice = null;

        do {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which user would you like more info on?");
        String userInput = scanner.next();
        if(students.containsKey(userInput)){
            int stu= userInput.hashCode();
            System.out.println("Students name: "+ students.get(userInput).getName() + " |" + " Students Avg: "+ students.get(userInput).getGradeAverage() + " |" + " Student UserName " + " |" + userInput );
        }else {
            System.out.println("user not found");
        }
            System.out.println("would you like to continue?");
            choice = scanner.next();
        } while (choice.equals("y"));
        System.out.println("GoodBye!");











    }
}
