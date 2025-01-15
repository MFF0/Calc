
import java.util.Scanner;

public class GCD {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two positive integers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int j = 0;

        for (int k = 1; k < a || k < b; k++) {
            if (a % k == 0 && b % k == 0) {
                j = k;
            }
        }
        System.out.println(j + " is the greatest common divisor");
    }
}
