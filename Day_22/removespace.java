import java.util.*;

public class removespace {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        char[] ch = str.toCharArray();

        
        for(int i=0; i<ch.length; i++) {
            if(ch[i] == ' ') {
                continue;
            }
            System.out.print(ch[i]);
        }
        input.close();
    }
}
