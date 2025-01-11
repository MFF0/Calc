package p.calc;

import java.util.Scanner;

public class Calc {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two integers: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        System.out.printf("The largest number between %.2f and %.2f is %.2f %n", a, b, MAth.Max(a, b));
        System.out.printf("The GCD betweem %.2f and %.2f is %.2f %n", a, b, MAth.GCD(a, b));
        System.out.printf("The sum of all numbers between %.2f and %.2f inclusive is %.2f %n", a, b, MAth.sumBetween(a, b));
    }
}
