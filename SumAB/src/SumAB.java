import java.util.Scanner;

public class SumAB {
    public static void main(String[] args) {
        //test with 2 pos int;
        int test1 = sum(20,10);
        System.out.println("Test 1 with 2 positive integers: " + test1 + "\n");

        //test with 2 neg int;
        int test2 = sum(-20,-10);
        System.out.println("Test 2 with 2 negative integers: " + test2 + "\n");

        //test with double;
        double test3 = sum(35.55,75.55);
        System.out.println("Test 3 with 2 double numbers: " + test3 + "\n");

        //test with user inputs
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();
        
        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();

        double userTest = sum(num1, num2);
        System.out.printf("Your sum is: %.2f%n", userTest);

        input.close();

    }

    //sum() method with int
    public static int sum(int a, int b) {
        int output = a + b;
        return output;
    }

    //sum() method with long
    public static long sum(long a, long b) {
        long output = a + b;
        return output;
    }

    //sum() method with float
    public static float sum(float a, float b) {
        float output = a + b;
        return output;
    }

    //sum() method with double
    public static double sum(double a, double b) {
        double output = a + b;
        return output;
    }
}
