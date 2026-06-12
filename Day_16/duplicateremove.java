import java.util.*;

public class duplicateremove {
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
        for(int i=0; i<n; i++) {
            int count = 0;
            for(int j=i+1; i<n; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                }
            }
            if(count==0) {
                System.out.print(arr[i]+" ");
            }
        }
        input.close();
    } 
}
