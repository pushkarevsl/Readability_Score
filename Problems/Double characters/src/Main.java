import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String[] string = scanner.next ().split ("");
        StringBuilder sb = new StringBuilder ();

        for(int i=0; i<string.length; i++){
            sb.append (string[i]).append (string[i]);
        }

        System.out.println (sb.toString ( ));

    }
}