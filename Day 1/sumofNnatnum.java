import java.util.*;

public class sumofNnatnum {
    public static void main(String[] args) {

         Scanner input = new Scanner(System.in);
         System.out.print("Enter a number : ");

         int n = input.nextInt();
         int sum=0;

         for(int i=1; i<=n; i++) {
            sum=sum+i;
         }
         System.out.print(sum);
    }
    
}
