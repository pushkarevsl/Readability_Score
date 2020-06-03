import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner (System.in);
        String str = scanner.next ();

        String alphabet ="abcdefghijklmnopqrstuvwxyz";

        if(alphabet.contains (str)){
            System.out.println ("true");
        }else{
            System.out.println ("false");
        }
    }
}