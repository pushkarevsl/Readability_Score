package readability;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] sentences = input.split("[.?!]");
        String[] words = input.split("\\s");

        double averageWords = (double) words.length / sentences.length;

        if (averageWords > 10) {
            System.out.println("HARD");
        } else {
            System.out.println("EASY");
        }
    }

//    public static void main(String[] args) {
//        String str1 = "aaabbcccdaa";
//        String str2 = " ";
//
//        for (int i = 0; i < str1.length(); i++) {
//            char ch = str1.charAt(i);
//            if (ch != str2.charAt(str2.length() - 1)) {
//                str2 += ch;
//            }
//        }
//        System.out.println (str2);
//    }
}

