import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String string = scanner.next ( );
        StringBuilder sb = new StringBuilder ( );
        int lenght = string.length ( );

        if (string.length ( ) % 2 == 0) {
            sb.append (string.substring (0, (lenght / 2) - 1))
                    .append (string.substring ((lenght / 2) + 1, lenght));
            System.out.println (sb.toString ( ));
        } else {
            sb.append (string.substring (0, (lenght / 2)))
                    .append (string.substring ((lenght / 2)+1, lenght));
            System.out.println (sb.toString ( ));
        }
    }
}