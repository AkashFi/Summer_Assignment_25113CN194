import java.util.*;

public class lowertoupper {
    public static void main(String[] args) {

        // taking string from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        // To store string as Array of character
        char[] ch = str.toCharArray();
        
       for(int i=0; i<ch.length; i++) {
        if(ch[i]>='a' && ch[i]<='z') {
            ch[i] = (char)(ch[i]-32);
        }
        System.out.print(ch[i]);
       }
       input.close();
        
    }
}
