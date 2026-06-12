import java.util.*;

public class missingarray {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = input.nextInt();
        int[] arr = new int[n-1];
        int sum = 0;
        
        // please enter number from 1 to n
        for(int i=0; i<arr.length; i++) {
            System.out.print("Enter arr["+i+"]: ");
            arr[i] = input.nextInt();
            sum += arr[i];
        }
        int expected_sum = n*(n+1)/2;
        int  missing = expected_sum-sum;
        System.out.print("Missing number is: "+missing);
        input.close();
    }
}