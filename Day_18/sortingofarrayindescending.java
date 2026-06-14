import java.util.*;

public class sortingofarrayindescending {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of element: ");
        int n = input.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            System.out.print("Enter arr["+i+"]: ");
            arr[i] = input.nextInt();
        }
        for(int i=0; i<n-1; i++){
            for( int j=i+1; j<n; j++) {
                if(arr[i]<arr[j]) {

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }
        System.out.print("Sorted Array in descending order: ");
        for(int i=0; i<n; i++) {
            System.out.print(arr[i]+" ");
        }
        input.close();
    }  
}
