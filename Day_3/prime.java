package Day_3;
import java.util.*;

public class prime {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = input.nextInt();
        int count=0;

        for(int i=2; i<=n/2; i++) {
            if(n%i==0) {
                count++;
                break;
            }
        }
        if(count==0) {
            System.out.print(n +"is prime number");
        }
        else{
            System.out.print(n +"is not a prime number");
        }
    }
}
