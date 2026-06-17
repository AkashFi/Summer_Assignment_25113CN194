import java.util.*;

public class stringlength {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        char[] ch = str.toCharArray();
        
        int len = 0;
        for(int i=0; i<ch.length; i++) {
            len++;
        }
        System.out.print(len);
        input.close();
        
    }
}
