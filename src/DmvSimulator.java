import java.util.Random;

public class DmvSimulator {
    public static void main(String[] args) {
        System.out.println("Welcome to the DMV!");

        Random random = new Random();
        int number = random.nextInt(1, 200);
        System.out.println("Your number is " + number + ". Please wait until it is called.");

        for (int i = 0; i < 199; i++) {
            int called = ((i + number) % 199) + 1;
            System.out.println("Number " + called + "? ... Number " + called + "?");
        }

        System.out.println("Sorry, you don't have the necessary paperwork.");
    }
}
