import java.util.*;

public class lcm {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int x = input.nextInt();
        System.out.print("Enter the second number : ");
        int y = input.nextInt();
        int z;
        int a = x;
        int b = y;

        while(y!=0) {
            z = y;
            y = x % y;
            x = z;

        }
        System.out.print("LCM is  : "+(a*b)/x);
        input.close();

    }
}
