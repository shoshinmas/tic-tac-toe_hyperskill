import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cityInput = scanner.nextLine();

        System.out.println(cityInput.endsWith("burg"));
    }
}