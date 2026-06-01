import java.util.*;

public class checkperfect {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = input.nextInt();
        int sum = 0;

        for(int i=1; i<n; i++) {
            if(n % i == 0) {
                sum+=i;
            }
        }
        if(sum==n) {
            System.out.print(n +" is perfect number");
        }
        else{
            System.out.print(n +" is not perfect number");
        }
        input.close();
    }    
}
