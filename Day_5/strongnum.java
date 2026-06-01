import java.util.*;

public class strongnum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = input.nextInt();
        int sum=0;
        int r;  // remainder
        int n1 = n;

        while(n>0) {
            r = n % 10;
            int fact = 1;
            for(int i=1; i<=r; i++){
                fact = fact * i;
            }
            sum = sum + fact;
            n = n/ 10;
        }
        n = n1;
        if(sum==n) {
            System.out.print(n + " is a strong number");
        }
        else{
            System.out.print(n + " is not a strong number");
        }
        input.close();
    }
}
