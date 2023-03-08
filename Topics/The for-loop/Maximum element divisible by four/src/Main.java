import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var max = 0;
        for (int i = 0, end = scanner.nextInt(); i < end; i++) {
            var element = scanner.nextInt();
            max = element % 4 == 0 && element > max ? element : max;
        }
        System.out.println(max);
    }
}