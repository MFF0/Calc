package p.calc;
public class MultiplicationTable {

    public static void main(String[] args) {
        System.out.println("          Multplication table");

        for (int column = 1; column <= 9; column++) {
            System.out.println("");
            for (int row = 1; row <= 9; row++) {
                System.out.printf("%4d", row * column);

            }
        }
    }
}
