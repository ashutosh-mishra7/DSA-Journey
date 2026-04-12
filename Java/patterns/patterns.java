public class patterns {
    public static void main(String[] args) {
        // solid pattern
        /*
         * int n = 8;
         * for (int i = 1; i <= n; i++)
         * 
         * {
         * for (int j = 1; j <= n; j++)
         * 
         * {
         * System.out.print("* ");
         * }
         * System.out.println();
         * }
         */

        // Tringle pattern
        /*
         * int n = 5;
         * for (int i = 1; i<=n; i++){
         * for(int j = 1; j<=i; j++){
         * System.out.print("* ");
         * }
         * System.out.println();
         * }
         */

        // rombus patterns
        /*
         * int n = 8;
         * for(int i = 1; i<=n; i++){
         * for(int j = 1; j<=n-i; j++){
         * System.out.print(" ");
         * }
         * for(int j =1; j<=n; j++){
         * System.out.print("* ");
         * }
         * System.out.println();
         * }
         */

        // inverted pattern

        /*
         * int n =7;
         * for(int i = n; i>=1; i--){
         * for(int j = 1; j<=i; j++){
         * System.out.print("* ");
         * }
         * System.out.println();
         * }
         */

        // piramid pattern

        /*
         * int n = 8;
         * for(int i = 1; i<=n; i++){
         * for(int j = 1; j<=n-i; j++){
         * System.out.print(" ");
         * }
         * for(int j = 1; j<=2*i-1; j++){
         * System.out.print("*");
         * }
         * System.out.println();
         * }
         */

        // inverted piramid
        /*
         * int n = 8;
         * for (int i = 1; i <= n; i++) {
         * for (int j=1;j<=i-1; j++) {
         * System.out.print(" ");
         * }
         * for (int j =1; j<=2*(n-i)+1; j++) {
         * System.out.print("*");
         * }
         * System.out.println();
         * }
         */

        // hollow

        int n = 4;
        int m = 6;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {

                // sirf boundary pe star print hoga
                if (i == 1 || i == n || j == 1 || j == m) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }

    }

}