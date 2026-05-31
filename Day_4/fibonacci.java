import java.util.*;

public class fibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int c;

        System.out.print(a+"\t");
        System.out.print(b+"\t");

        for(int i=3; i<=n; i++) {
            c = a + b;
            System.out.print(c+"\t");
            a = b;
            b = c;

        }
        sc.close();
    }
    
}
