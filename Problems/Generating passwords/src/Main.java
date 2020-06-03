import java.util.*;

public class Main {

    public static void main(String[] args) {
        final Scanner scr = new Scanner (System.in);

        final int a = scr.nextInt ( );
        final int b = scr.nextInt ( );
        final int c = scr.nextInt ( );
        final int n = scr.nextInt ( );

        char[] password = new char[n];

        int i = 0;
        for (int j = 0; i < a; i++, j++) {
            password[i] += 'A' + (j % 26);
        }
        for (int j = 0; i < (a + b); i++, j++) {
            password[i] += 'a' + (j % 26);
        }
        for (int j = 0; i < n; i++, j++) {
            password[i] = (char) ('0' + (j % 10));
        }
        for (int j = 0; j < n; j++) {
            System.out.print (password[j]);
        }
    }
}