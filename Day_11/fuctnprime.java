import java.util.*;

public class fuctnprime {
    static int prime(int n) {
        int count = 0;
        for(int i=2; i<=n/2; i++) {
            if(n % i == 0) {
                count++;
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) { 

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number  : ");
        int num = input.nextInt();
        int result = prime(num);
        if(result==0) {
            System.out.print(num+" is a Prime number");
        }
        else{
            System.out.print(num+" is not a prime number ");
        }
        input.close();
    }
}
