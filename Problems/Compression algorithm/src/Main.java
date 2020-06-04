import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String num = sc.next ( );

        char[] chars = num.toCharArray ( );
        int counter = 1;
        int i;

        for (i = 1; i < chars.length; i++) {

            if (chars[i - 1] == chars[i] && i <= chars.length - 1) {
                counter++;
                continue;
            }
            System.out.print (String.valueOf (chars[i - 1]) + counter);
            counter = 1;
        }
        System.out.print (String.valueOf (chars[i - 1]) + counter);
    }
}