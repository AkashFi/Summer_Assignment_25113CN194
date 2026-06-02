import java.util.*;
import java.lang.Math;

public class binarytodecimal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter binary number : ");
        int n = input.nextInt();
        int r; // remainder
        int d=0; // decimal

        int i = 0;
        while(n>0) {
            r = n % 10;
            d = (int)Math.pow(2,i) * r + d;
        // we use (int) becuase of single value otherwise it return double value like 8.0
            n = n / 10;
            i++;
        }
        System.out.print("Decimal value is : "+d);
        input.close();
    }
}
