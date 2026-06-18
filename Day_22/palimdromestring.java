import java.util.*;

public class palimdromestring {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        char[] ch = str.toCharArray();

        int count = 0;
        for(int i=0; i<ch.length/2; i++) {
            if(ch[i] == ch[ch.length-1-i]) {
                count++;
            }
        }
        if(count == ch.length/2) {
            System.out.print("Palindrome String");
        }
        else{
            System.out.print("Not Palindrome String");
        }
        input.close();
    }
}
