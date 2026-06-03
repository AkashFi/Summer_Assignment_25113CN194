import java.util.*;

public class fiborec {
    static int fibo(int n) {
        if(n==0 || n==1) {
            return n;
        }
        else{
            return fibo(n-1)+fibo(n-2);
        }
    }   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = input.nextInt();

        for(int i=0; i<num; i++) {
            int f = fibo(i);
            System.out.print(f+"\t");
        }
        input.close();
    }
}
