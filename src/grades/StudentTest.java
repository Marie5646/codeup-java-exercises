package grades;

import java.util.ArrayList;
import java.util.Collection;

public class StudentTest {



    public static void main(String[] args){
     Student Mya = new Student("Mya");
     Student Sam = new Student("Sam");
     Student Bob = new Student("Bob");
     Student Leon = new Student("Leon");

     Bob.addGrades(55);
     Bob.addGrades(66);
     Bob.addGrades(90);
     Sam.addGrades(84);
     Sam.addGrades(50);
     Sam.addGrades(90);
     Mya.addGrades(100);
     Mya.addGrades(66);
     Mya.addGrades(89);
     Leon.addGrades(70);
     Leon.addGrades(86);
     Leon.addGrades(50);


     System.out.println(Leon.getGradeAverage());






    }

}
