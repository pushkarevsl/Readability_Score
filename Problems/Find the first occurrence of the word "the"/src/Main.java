import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner (System.in);
        String string = scanner.nextLine ( );

        final int the = string.toLowerCase ().indexOf ("the");
        System.out.println (the);
    }
}