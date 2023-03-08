import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isSeq = true;

        int counter = 0;

        while (isSeq) {
            int value = scanner.nextInt();
            if (value != 0){
            counter++;}
            else { isSeq = false; }
        }
        System.out.println(counter);
    }
}
