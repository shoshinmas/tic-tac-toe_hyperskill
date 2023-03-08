import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bokA = scanner.nextInt();
        int bokB = scanner.nextInt();
        int bokC = scanner.nextInt();

        if (bokA + bokB > bokC && bokA + bokC > bokB && bokB + bokC > bokA) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}