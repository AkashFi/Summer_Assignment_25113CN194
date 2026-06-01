import java.util.*;

public class largestprimefactor {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = input.nextInt();
        int max =0;

        for(int i=2; i<=n; i++) {
            if(n % i == 0) {
                int count = 0;
                for(int j=2; j<=i/2; j++) {
                    if(i % j == 0) {
                        count++;
                        break;
                    }
                }
                if(count == 0 && i>max) {
                    max = i;
                }
            }
        }
        System.out.print( "Largest prime number is : "+max);
        input.close();
       
    }
}
