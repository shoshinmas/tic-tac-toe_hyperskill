import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int exceed = 0;

        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            if (n == 0) {
                if (sum >= 1000) {
                    exceed = 1000;
                }
                break;
            } else if (sum >= 1000) {
                exceed = 1000;
            } else if (n >= 1000) {
                exceed = 1000;
                sum += n;
            } else {
                sum += n;
            }
        }
        sum -= exceed;
        System.out.print(sum);
    }
}