import java.util.*;
import java.lang.Math.*;

public class armstrong {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int count=0;
        int sum=0;
        int r;
        int n1=n;

        while(n>0) {
            n=n/10;
            count++;
        }
        n=n1;
        while(n>0) {
            r=n%10;
            sum+=Math.pow(r,count);
            n=n/10;
        }
        if(sum==n1) {
            System.out.print(n1+ " is a Armstrong number");
        }
        else{
            System.out.print(n1+" is not Armstrong number ");
        }
        sc.close();
    }
}
