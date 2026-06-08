import java.util.*;

public class perfectfunctn {
    static int perfect(int n) {
        int sum = 0;
        for(int i=1; i<n; i++){
            if(n % i == 0){
                sum+=i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number  : ");
        int num = input.nextInt();
        int p = perfect(num);

        if(p==num) {
            System.out.print(num+" is a perfect number ");
        }
        else{
            System.out.print(num+" is not a perfect number");
        }
        input.close();



    }
}