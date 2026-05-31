import java.util.*;

public class primerange {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter beginning range : ");
        int beg = sc.nextInt();
        System.out.print("Enter ending range : ");
        int end = sc.nextInt();


        for(int n=beg; n<=end; n++) {
            int count=0;
            if(n<2) {
                continue;
            }
            for(int i=2; i<=n/2; i++) {
                if(n%i==0) {
                    count++;
                    break;
                }
            }
            if(count==0) {
                System.out.print(n + " ");
            }
        }
        sc.close();
    }
}
