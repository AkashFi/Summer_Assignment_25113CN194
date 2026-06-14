import java.util.*;

public class binarysearch {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = input.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            System.out.print("Enter arr["+i+"]: ");
            arr[i] = input.nextInt();
        }
        // taking searching element from the user
        System.out.print("Enter searching element: ");
        int key = input.nextInt();

        int loc = -1;
        int beg = 0, end=n-1;
        while(beg<=end) {
            int mid = (beg+end)/2;
            if(arr[mid] == key) {
                loc = mid;
                System.out.print(key+" element is found at "+loc+" index");
                break;
            }
            else if(arr[mid]>key) {
                end = mid-1;
            }
            else{
                beg = mid+1;
            }
        }
        if(loc == -1) {
            System.out.print( "Element is not found: ");
        }
        input.close();


    }
}
