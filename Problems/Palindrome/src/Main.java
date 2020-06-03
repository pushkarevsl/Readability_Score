import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner (System.in);
        String str = scanner.next ( );

        StringBuilder sb = new StringBuilder (str);

        if(str.equals (sb.reverse ().toString ())){
            System.out.println ("yes");
        }else {
            System.out.println ("no");
        }
    }
}