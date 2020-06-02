
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] strArray = scanner.nextLine().split("");

        int sum = 0;
        for (int i = 0; i < 6; ++i) {
            if (i < 3) {
                sum += Integer.parseInt(strArray[i]);
            } else {
                sum -= Integer.parseInt(strArray[i]);
            }
        }
        System.out.println(sum == 0 ? "Lucky" : "Regular");
    }
}