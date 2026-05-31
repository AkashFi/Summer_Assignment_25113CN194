import java.util.*;

public class gcd {
    public static void main(String[] args) {
  
        // taking input of two numbers
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int x = input.nextInt();
        System.out.print("Enter second number : ");
        int y = input.nextInt();
        int r; // remainder

        while(x % y != 0) {
            r = x % y;
            x = y;
            y = r;
        }
        System.out.print("GCD is : "+y);
        input.close();
    }    
}
