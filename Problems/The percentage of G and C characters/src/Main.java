import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner (System.in);
        String string = scanner.next ( );
        String[] strings = string.split ("");

        int count = 0;
        final int length = strings.length;
        for (String i : strings) {
            if (i.equalsIgnoreCase ("g") || i.equalsIgnoreCase ("c")) {
                count++;
            }
        }
        double result = (double) count / length * 100;
        System.out.println (result);
    }
}