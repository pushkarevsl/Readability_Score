import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        final String[] str = scanner.nextLine ( ).split (" ");
        int max = 0;

        for (int i = 1; i < str.length; ++i) {
            if (str[i].length ( ) > str[max].length ( )) {
                max = i;
            }
        }
        System.out.println (str[max]);
    }
}
//    Everyone of us has all we need