import java.util.*;
import java.lang.Math;

public class armstrongfuctn {
    static int armstrong(int n){
        int n1 = n,count = 0, sum = 0;
        while(n>0) {
            n = n/10;
            count++;
        }
        n = n1;
        while(n>0) {
            int r = n % 10;
            sum += Math.pow(r,count);
            n = n/10;
        }
        return sum;

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = input.nextInt();

        int a = armstrong(num);
        if(a==num) {
            System.out.print(num+" is armstrong number ");
        }
        else{
            System.out.print(num+" is not armstrong number");
        }
        input.close();
    }
}
