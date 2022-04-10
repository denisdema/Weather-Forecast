
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter name of city");
        String qyteti= input.nextLine();
        System.out.println("Enter the pattern of country ");
        String weather= input.nextLine();
        System.out.println("Enter date of the city for weather ");
        long date = input.nextLong();

    }
}
