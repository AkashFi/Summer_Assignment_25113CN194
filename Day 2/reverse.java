import java.util.*;
public class reverse {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number  : ");
        int n = input.nextInt();
        int r; // remainder
        int rev=0; //reverse

        while(n>0) {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        System.out.print("Reverse of a number is : "+rev);
        
    }
}
