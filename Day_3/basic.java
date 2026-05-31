import java.util.*;

public class basic{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter name : ");
        String name = input.nextLine();

        System.out.print(name);
        input.close();
    }
}