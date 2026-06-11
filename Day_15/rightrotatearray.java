import java.util.*;

public class rightrotatearray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = input.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            System.out.print("Enter arr["+i+"]: ");
            arr[i] = input.nextInt();
        }
        int temp = arr[n-1];
        for(int i=n-1; i>0; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
        for(int i=0; i<n; i++) {
            System.out.print(arr[i]+" ");
        }
        input.close();
    }
}
