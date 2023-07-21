import java.util.Arrays;

public class ReverseStringSort {
    public static void main(String[] args) {
        String[] array = {"h","e","l","l","o"};
        ReverseStringSort.reverse(array);

        String arrayString = Arrays.toString(array);
        
        System.out.print("Reverse string is: " + arrayString);
    }

    public static void reverse(String[] arr) {
        for (int i = 0; i < arr.length/2; i++) {
            // Creating a temp variable that = the first element         ex: temp = h     ---> {temp,"e","l","l","o"}
            // Then set the first element = second element                      h = e     ---> {"e","e","l","l","o"}
            // Then second element = temp                                       e = temp  ---> {"e","h","l","l","o"}

            String temp = arr[i];
            arr[i] = arr[arr.length - i -1];
            arr[arr.length - i - 1] = temp;
        }
    }
}