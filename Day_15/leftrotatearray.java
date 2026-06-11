import java.util.*;

public class leftrotatearray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = input.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            System.out.print("Enter arr["+i+"]: ");
            arr[i] = input.nextInt();
        }
        int temp = arr[0];
        for(int i=1; i<n; i++) {
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
        for(int i=0; i<n; i++) {
            System.out.print(arr[i]+" ");
        }
        input.close();
    }
}
