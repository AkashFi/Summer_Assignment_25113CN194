import java.util.*;

public class setbitofnum {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = input.nextInt();
        int r; // remainder
        int count = 0;
        int n1=n;

        while(n>0) {
            r = n % 2;
            n = n / 2;
            if(r==1) {
                count++;
            }
            // System.out.print(count);
        }
        n = n1;
        System.out.print("Set bit of " + n1 +" is : "+count);
        input.close();
    }
}
