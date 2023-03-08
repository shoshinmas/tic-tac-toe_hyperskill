import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fourDigitNumber = scanner.nextInt();

        int lengthOfInt = String.valueOf(fourDigitNumber).length();

        if (lengthOfInt != 4) {
            System.out.println("Not a 4 digit integer");
        } else {

            String checkPalindrome = String.valueOf(fourDigitNumber);
            if (checkPalindrome.charAt(0) == checkPalindrome.charAt(3) &&
                    checkPalindrome.charAt(1) == checkPalindrome.charAt(2)) {
                System.out.println("1");
            }  else {
                System.out.println("37");
            }
        }
    }
}