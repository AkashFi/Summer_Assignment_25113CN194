import java.util.*;

public class sumrec {
    static int sum(int n){
        if(n==0) {
            return 0;
        }
        else{
            return n + sum(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = input.nextInt();
        int s = sum(num);
        System.out.print("All the sum of "+num+" is : "+s);
        input.close();
    }
}
