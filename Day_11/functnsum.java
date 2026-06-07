import java.util.*;

public class functnsum {
    static int sum(int a,int b) {
        return a+b;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int x = input.nextInt();
        System.out.print("Enter the second number : ");
        int y = input.nextInt();
        int s = sum(x,y);
        System.out.print("Sum of two number is : "+s);
        input.close();
    }
}