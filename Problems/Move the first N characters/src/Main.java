import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        String string = scanner.next ( );
        int value = scanner.nextInt ( );

        if (string.length ( ) < value) {
            System.out.println (string);
        }else {
            StringBuilder sb = new StringBuilder ( );
            sb.append (string.substring (value, string.length ( )))
                    .append (string.substring (0, value));

            System.out.println (sb.toString ( ));
        }
    }
}