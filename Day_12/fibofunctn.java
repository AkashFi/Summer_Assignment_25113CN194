import java.util.*;

public class fibofunctn {
    static void fibo(int n) {
        int a=0,b=1,c;
        for(int i=1; i<=n; i++) {
            System.out.print(a+"\t");
            c = a+b;
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = input.nextInt();
        fibo(num);
        input.close();
    }
}
