import java.util.*;

public class arraypairsum {
    public static void main(String[] args) {

        // user input for size of an array
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = input.nextInt();
        int[] arr = new int[n];

        // user input for an array
        for(int i=0; i<n; i++) {
            System.out.print("Enter arr["+i+"]: ");
            arr[i] = input.nextInt();
        }
        // input for target number
        System.out.print("Enter target number: ");
        int target = input.nextInt();

        for(int i=0; i<n; i++) {
            for(int j=i+1; i<n; j++) {
                if(arr[i] + arr[j] == target) {
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
        input.close();
    } 
}
