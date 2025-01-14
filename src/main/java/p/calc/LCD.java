
import java.util.Scanner;

public class LCD {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two positive integers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        for (int k = 1; k < a || k < b; k++) {
            if (a % k == 0 && b % k == 0 && k != 1) {
                a = k;
            }
        }
        System.out.println(a + " is the least common divisor");
    }
}
