import java.util.Scanner;

public class Main {

    public static NetflixOriginal instantiateFromInput(Scanner scanner) {
        NetflixOriginal show = new NetflixOriginal();

        System.out.print("Please enter the name of the show: ");
        show.setName(scanner.nextLine());

        System.out.print("Please enter the star rating: ");
        show.setStarRating(Double.parseDouble(scanner.nextLine()));

        System.out.print("Please enter the genre: ");
        show.setGenre(scanner.nextLine());

        return show;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NetflixOriginal[] shows = new NetflixOriginal[2];

        for (int i = 0; i < shows.length; i++) {
            shows[i] = instantiateFromInput(scanner);
            System.out.println(shows[i].getName() + "," + shows[i].getStarRating() + "," + shows[i].getGenre());
        }

        scanner.close();
    }
}
