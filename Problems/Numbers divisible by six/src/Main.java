import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int numberOfInputs = scanner.nextInt();
        for (int i = 0; i < numberOfInputs; i++) {
            int number = scanner.nextInt();
            if (number % 6 == 0) {
                sum = sum + number;
            }
        }
        System.out.println(sum);
    }
}