import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstNumber = scanner.next();
        String operator = scanner.next();
        String secondNumber = scanner.next();

        switch (operator) {
            case "+":
                long noOne = Long.parseLong(firstNumber);
                long noTwo = Long.parseLong(secondNumber);
                System.out.println(noOne + noTwo);
                break;
            case "-":
                long noOneMinus = Long.parseLong(firstNumber);
                long noTwoMinus = Long.parseLong(secondNumber);
                System.out.println(noOneMinus - noTwoMinus);
                break;
            case "*":
                long noOneMulti = Long.parseLong(firstNumber);
                long noTwoMulti = Long.parseLong(secondNumber);
                System.out.println(noOneMulti * noTwoMulti);
                break;
            case "/":
                long noOneDiv = Long.parseLong(firstNumber);
                long noTwoDiv = Long.parseLong(secondNumber);
                if (noTwoDiv == 0) {
                    System.out.println("Division by 0!");
                } else {
                    System.out.println(noOneDiv / noTwoDiv);
                }                
                break;
            default:
                System.out.println("Unknown operator");
                break;
        }
    }
}
