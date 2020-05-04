import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int bridgeNumber = scanner.nextInt();
        String result = "";

        for (int i = 1; i <= bridgeNumber; i++) {

            int bridgeHeight = scanner.nextInt();
            if (bridgeHeight <= height) {
//                System.out.println("Will crash on bridge " + i);
                result = "Will crash on bridge " + i;
                break;
            } else if (bridgeHeight > height) {
                //System.out.println("Will not crash");
                result = "Will not crash";
            }
        }
        System.out.println(result);
    }
}

