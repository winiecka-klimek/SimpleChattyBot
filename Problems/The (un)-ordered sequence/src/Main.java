import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String result = "";
        int number = 0;
        boolean flag = true;

        while (scanner.hasNext()) {
            int nextNumber = scanner.nextInt();
            if (nextNumber >= number) {
                number = nextNumber;
                if (nextNumber >= number) {
                    if (nextNumber <= number) {
                        flag = false;
                        break;
                    } else
                        flag = true;
                }
            } else if (nextNumber <= number) {
                number = nextNumber;
                if (nextNumber <= number) {
                    if (nextNumber >= number) {
                        flag = false;
                        break;
                    } else
                        flag = true;
                }
            } else if (number == 0) {
                flag = true;
            break;
        }

    } System.out.println(flag);

}
}