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

        if (random.nextInt(100) == 0) {
            System.out.println("Alright, you've got all the necessary paperwork, and... you're all set! Next!");
        } else {
            System.out.println("Are you joking?  You seriously don't have the paperwork?  Pathetic. MWAHAHAHAHAHAHAH!!  NEXT!!!");
        }
    }
}
