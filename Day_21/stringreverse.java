import java.util.*;

public class stringreverse {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        char[] ch = str.toCharArray();

        System.out.print("Reverse String is: ");
        for(int i=ch.length-1; i>=0; i--) {
            System.out.print(ch[i]);
        }
        input.close();
    }
}
