import java.util.*;
import java.util.Random;

public class guessinggame {
    public static void main(String[] args) {

        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1;

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To  Number Guessing Game!");
        int guess;


        do {
            System.out.print("Enter Your guess: ");
               guess  = input.nextInt();
            if(guess>secretNumber) {
                System.out.println("Too Hight! ");
            }
            else if(guess<secretNumber) {
                System.out.println("Too Low!");
            }
            else {
                System.out.println("Correct guess! ");
            }
        }   while(guess != secretNumber);
        input.close();     
    }
}