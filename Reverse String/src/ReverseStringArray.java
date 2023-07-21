import java.util.Scanner;

public class ReverseStringArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        char[] array = str.toCharArray();

        System.out.print("Reverse String using Array is: ");

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]); 
        }
        
        input.close();
    }
}
