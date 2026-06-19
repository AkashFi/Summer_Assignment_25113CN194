import java.util.*;

public class firstrepeatingchar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        char[] ch = str.toCharArray();

        for(int i=0; i<ch.length; i++) {
            for(int j=i+1; j<ch.length; j++) {
                if(ch[i] == ch[j]) {
                    System.out.print("First Repeating Character is: "+ch[i]);
                    return;
                }
                input.close();
            }
        }
        input.close();
    }
}
