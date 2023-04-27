//package movies;
//import movies.Movie;
//import movies.MoviesArray;
//import java.util.Objects;
//import java.util.Scanner;
//
//
//public class MoviesApplication {
//
//    public static void main(String[] args){
//    boolean choice= true;
//    Movie[] movieArray= MoviesArray.findAll();
//    Scanner scanner = new Scanner(System.in);
//
//
//   while(true){
//       System.out.println("Enter your choice: ");
////       System.out.println("0 - exit");
//       System.out.println("1 - view all movies");
//       System.out.println("2 - view movies in the animated category");
//       System.out.println("3 - view movies in the drama category");
//       System.out.println("4 - view movies in the horror category");
//       System.out.println("5 - view movies in the scifi category");
//       int userInt = scanner.nextInt();
//       switch (userInt) {
//           case 1 -> {
//               for (Movie movie : movieArray)
//                   System.out.printf("Movie Title: %s Movie Category: %s%n", Movie.getName(), Movie.getCategory());
//           }
//           case 2 -> {
//               for (Movie movie : movieArray) {
//                   if (Movie.getCategory().equals("animated")) {
//                       System.out.printf("Movie Title: %s Movie Category: %s%n", Movie.getName(), Movie.getCategory());
//                   }
//               }
//           }
//           case 3 -> {
//               for (Movie movie : movieArray) {
//                   if (Movie.getCategory().equals("drama")) {
//                       System.out.printf("Movie Title: %s Movie Category: %s%n", Movie.getName(), Movie.getCategory());
//                   }
//               }
//           }
//           case 4 -> {
//               for (Movie movie : movieArray) {
//                   if (Movie.getCategory().equals("horror")) {
//                       System.out.printf("Movie Title: %s Movie Category: %s%n", Movie.getName(), Movie.getCategory());
//                   }
//               }
//           }
//           case 5 -> {
//               for (Movie movie : movieArray) {
//                   if (Movie.getCategory().equals("sci-fi")) {
//                       System.out.printf("Movie Title: %s Movie Category: %s%n", Movie.getName(), Movie.getCategory());
//                   }
//               }
//           }
//           default -> System.out.println("default case");
//       }
//   }
//
//
//    }
//
//
//
//
//
//
//
//
//
//
//
//}
