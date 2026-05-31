import java.util.*;
public class pallindrome {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = input.nextInt();
        int r;
        int rev=0;
        int n1=n;

        while(n>0) {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        if(rev==n1) {
            System.out.print(rev+" : is palindrome");
        }
        else{
            System.out.print(rev+" : is not a palindrome");
        }


    }
}
