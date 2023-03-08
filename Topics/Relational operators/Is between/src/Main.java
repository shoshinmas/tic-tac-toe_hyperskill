import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int noBetween = scanner.nextInt();
        int no2 = scanner.nextInt();
        int no3 = scanner.nextInt();

        if (((noBetween <= no3) && (noBetween >= no2)) || ((noBetween >= no3) && (noBetween <= no2))) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

    }
}