class Main {

    /**
     * It prints the text "It works correctly" to the standard output
     */

    public static void main(String[] args) {
//        System.out.println("It works correctly");

        String pattern = "\\.jav.";

        boolean tr = ".jav.".matches (pattern);
        System.out.println (tr);

        boolean tr2 = ".java".matches (pattern);
        System.out.println (tr2);

        boolean matches = ".javq".matches (pattern);
        System.out.println (matches );

        final boolean matches1 = "_java".matches (pattern);
        System.out.println (matches1);

        final boolean matches2 = ".jav".matches (pattern);
        System.out.println (matches2 );

        final boolean matches3 = "java".matches (pattern);
        System.out.println (matches3 );
    }
}