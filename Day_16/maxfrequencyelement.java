import java.util.*;

public class maxfrequencyelement {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = input.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            System.out.print("Enter arr["+i+"]: ");
            arr[i] = input.nextInt();
        }
        int maxFreq = 0;
        int maxEle = arr[0];
        for(int i=0; i<arr.length; i++) {
            int count = 0;
            for(int j=0; j<arr.length; j++) {
                if(arr[i]==arr[j]) {
                    count++;
                }
            }
            if(count>maxFreq) {
                maxFreq = count;
                maxEle = arr[i];
            }
        }
        System.out.println("Maximum Frequency is: "+maxFreq);
        System.out.print("Maximum Frequency element is: "+maxEle);
        input.close();
    }
}
