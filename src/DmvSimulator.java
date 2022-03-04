import java.util.Random;

public class DmvSimulator {
    public static void main(String[] args) {
        System.out.println("Welcome to the DMV!");

        Random random = new Random();
        int number = random.nextInt(1, 100);
        System.out.println("Your number is " + number + ". Please wait until it is called.");

        for (int i = 0; i < 99; i++) {
            int called = ((i + number) % 99) + 1;
            System.out.println("Number " + called + "? ... Number " + called + "?");
        }

        System.out.println("Are you joking?  You seriously don't have the paperwork?  Pathetic.  NEXT!!!");
    }
}
