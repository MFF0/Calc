package p.calc;

public class MAth {

    public static double Max(double a, double b) {
        if (a >= b) {
            return a;
        }

        return b;
    }

    public static double POw(double a, double b) {
        double result = 0;
        for (int i = 1; i <= b; i++) {
            result = a * a;
        }
        return result;
    }

    public static double GCD(double a, double b) {
        double result = 1;
        for (int i = 1; i <= a || i <= b; i++) {
            if (a % i == 0 & b % i == 0) {
                result = i;
            }
        }
        return result;
    }

    public static double sumBetween(double a, double b) {
        double temp = 0;
        double result = 0;
        if (a != b) {
            if (a > b) {
                temp = a;
                a = b;
                b = temp;
            }
            result = ((b - a + 1) * (a + b)) / 2;
        }
        return result;
    }

}
