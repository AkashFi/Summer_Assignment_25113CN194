import java.util.*;

public class xpowern {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a base number : ");
        int x = input.nextInt();
        System.out.print("Enter base raise to power : ");
        int n = input.nextInt();

        if(x==0 && n==0) {
            System.out.print("Undifined");
            
        }
        int result1 = 1;
        float result2 = 1;
        if(n>=0) {
            for(int i=1; i<=n; i++){
                result1 = result1 * x;
            }
            System.out.print(result1);
        }
        else{
            for(int i=1; i<=-n; i++) {
                result2 = result2 * x;
            }
            result2 = 1 / result2;
            System.out.print(result2);
        }
        input.close();
        
    }
}
