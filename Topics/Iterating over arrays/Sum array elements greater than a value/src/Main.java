import java.sql.Array;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int size = scanner.nextInt();
        int[] arrayEl = new int[size];

        for (int i = 0; i < size; i++) {
            arrayEl[i] = scanner.nextInt(); // read the next number of the array
        }

        int numberN = scanner.nextInt();

        for (int n : arrayEl) {
            if (n > numberN) {
                sum += n;
            }
        }

        System.out.println(sum);
    }
}