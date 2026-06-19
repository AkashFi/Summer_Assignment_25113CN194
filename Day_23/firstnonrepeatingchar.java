import java.util.*;

public class firstnonrepeatingchar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        char[] ch = str.toCharArray();

        for(int i=0; i<ch.length; i++) {
            int count = 0;
            for(int j=i+1; j<ch.length; j++) {
                if(ch[i] == ch[j]) {
                    count++;
                }
            }
            if(count == 0) {
                System.out.print("First Non Repeating Character is: "+ch[i]);
                return;
            }
            input.close();
        }
        System.out.print("Non Repeating Character Not Found");
        input.close();
    }
}
