import java.util.*;

public class maxoccuringchar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        char[] ch = str.toCharArray();
        
        int maxCount = 0;
        char maxoccur = '\0';

        for(int i=0; i<ch.length; i++) {
            int count = 0;
            for(int j=i+1; j<ch.length; j++) {
                if(ch[i]>='A' && ch[i]<='Z') {
                    if(ch[i] == ch[j] || ch[i] == (ch[j]-32)) {
                        count++;
                    }
                }
                if(ch[i]>='a' && ch[i]<='z') {
                    if(ch[i] == ch[j] || ch[i] == (ch[j]-32)) {
                        count++;
                    }
                }
            }
            if(count>maxCount) {
                maxCount = count;
                maxoccur = ch[i];

            }
        }
        System.out.print("Character: "+ maxoccur + " is maximum occuring character with frequency: " +(maxCount+1));
        input.close();
    }
}
