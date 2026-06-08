import java.util.*;

public class pallindromefunctn {
    static int pallindrome(int n){
        int n1 = n,rev=0;
        n = n1;
        while(n>0) {
            int r = n % 10;
            rev =  rev*10+r;
            n = n/10;
        }
        return rev;

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = input.nextInt();

        int p = pallindrome(num);
        if(p==num) {
            System.out.print(num+" is pallindrome number ");
        }
        else{
            System.out.print(num+" is not pallindrome number");
        }
        input.close();
    }
}
