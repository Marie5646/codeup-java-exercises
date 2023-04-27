import java.util.Arrays;

public class ServerNameGenerator {

    static String[] adj = {"clean", "clear", "clever", "cloudy", "clumsy", "colorful", "combative", "comfortable", "concerned"};

    static String[] noun = {"park", "country", "person", "cat", "day", "company", "city", "fruit", "candy", "movie"};


    public static String generateName (String[] strings){
        int randElem = (int) (Math.random() * strings.length);
      return strings[randElem];
    }




    public static void main(String[] args) {
      String adjet= generateName(adj);
      String nouns= generateName(noun);
     System.out.println("your server name is: " + adjet +"-"+ nouns);


    }





}
