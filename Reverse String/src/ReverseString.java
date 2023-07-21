import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();

        String rev = "";
        char character;

        for (int i = 0; i < str.length(); i++) {
            character = str.charAt(i);
            rev = character + rev;
        }

        System.out.println("Reverse String is: " + rev);

        input.close();
    }
}
