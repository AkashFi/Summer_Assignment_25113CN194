import java.util.*;
public class sumofdigit {
    public static void main(String[] args){

        Scanner input =  new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = input.nextInt();
        int sum=0;
        int r;  // remainder

        while(n>0) {
            r=n%10;
            sum=sum+r;
            n=n/10;
        }
        System.out.print("Sum of digits of number is "+sum);
    }
}
