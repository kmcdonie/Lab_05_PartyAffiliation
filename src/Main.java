import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Choose your party affiliation:");
        System.out.println("D - Democrat");
        System.out.println("R - Republican");
        System.out.println("I - Independent");
        System.out.println("Enter the first letter of your party affiliation");

        String input = in.next();

        if (input.equals("D")) {
            System.out.println("You get a Democratic Donkey");
        } else if (input.equals("R")) {
            System.out.println("You get a Republican Elephant");
        } else if (input.equals("I")) {
            System.out.println("You get an Independent Person");
        } else {
            System.out.println("You get Other");
        }
        in.close();
    }
}