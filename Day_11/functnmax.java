import java.util.*;

public class functnmax {
    static int maximum(int a,int b) {
        if(a>b) {
            return a;
        }
        else{
            return b;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = input.nextInt();
        int m = maximum(num1,num2);
        System.out.print("Maximum number is  : "+m);
        input.close();

    }
}
