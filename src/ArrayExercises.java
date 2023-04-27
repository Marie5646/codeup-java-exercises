import java.util.Arrays;
import java.util.Random;

public class ArrayExercises {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person[]people = new Person[3];
        people[1]= new Person("Asia");
        people[2]= new Person("Alex");
        people[3]= new Person("Latasha");
        for(int i= 0;i< people.length;i++){
            System.out.println(people[i]);
        }

        Person Norma= new Person("Norma");
//        Person people= addPerson(people, Norma);

    }

      public static Person[] addPerson(Person[] array, Person newPerson ){
          Person[] people= Arrays.copyOf(array, array.length + 1);
          people [people.length- 1] = newPerson;
          return  people;

}






}
