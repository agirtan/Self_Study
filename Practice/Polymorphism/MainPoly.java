package Practice.Polymorphism;

import java.util.Scanner;

public class MainPoly {

    public static void main(String[] args) {

//        Movie theMovie =Movie.getMovie("Science", "Star Wars");
//        theMovie.watchMovie();

        Scanner s = new Scanner(System.in);
        while(true){
            System.out.print("Enter type : ");
            String type= s.nextLine();
            if("Qq".contains(type)){
                break;
            }
            System.out.println("Enter Movie Title : ");
            String title = s.nextLine();
            Movie movie = Movie.getMovie(type,title);
            movie.watchMovie();
        }
    }
}
