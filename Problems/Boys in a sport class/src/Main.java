import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        // put your code here
        int[] ints = new int[3];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = scanner.nextInt ( );
        }
        scanner.close ( );


        if ((ints[0] >= ints[1] && ints[1] >= ints[2])
                ||
                (ints[2] >= ints[1] && ints[1] >= ints[0])) {
            System.out.println ("true");
        }else {
            System.out.println ("false");
        }
    }
}