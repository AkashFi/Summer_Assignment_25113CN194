import java.util.Scanner;

public class unionofaaray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of elements in first array: ");
        int n1 = input.nextInt();
        int[] arr1 = new int[n1];
        System.out.print("Enter number of elements in first array: ");
        int n2 = input.nextInt();
        int[] arr2 = new int[n2];

        //taking first array from user 
        for(int i=0; i<n1; i++) {
            System.out.print("Enter arr1["+i+"]: ");
            arr1[i] = input.nextInt();
        }
        //taking second array from user 
         for(int j=0; j<n2; j++) {
            System.out.print("Enter arr2["+j+"]: ");
            arr2[j] = input.nextInt();
        }
        for(int i=0; i<n1; i++) {
            int count = 0;
            for(int j=0; j<i; j++) {
                if(arr1[i] == arr1[j]) {
                    count++;
                }
            }
            if(count == 0) {
                System.out.print(arr1[i]+" ");
            }
        }
        for(int i=0; i<n2; i++) {
            int count = 0;
            for(int j=0; j<n1; j++) {
                if(arr2[i] == arr1[j]) {
                    count++;
                }
            }
            for(int j=0; j<i; j++) {
                if(arr2[i] == arr2[j]) {
                    count++;
                }
            }
            if(count == 0) {
                System.out.print(arr2[i]+" ");
            }
        }
        input.close();

    }
}
