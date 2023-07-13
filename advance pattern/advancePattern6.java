public class advancePattern6 {
    public static void main(String[] args) {
        int n = 10;
        // upper
        for (int i = 1; i <= n; i++) {
            // star and the space
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // space
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
             // star and the space
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        //lower
        for (int i = n; i >= 1; i--) {
             // star and the space
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // space
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
             // star and the space
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}



// *                  *
// **                **
// * *              * *
// *  *            *  *
// *   *          *   *
// *    *        *    *
// *     *      *     *
// *      *    *      *
// *       *  *       *
// *        **        *
// *        **        *
// *       *  *       *
// *      *    *      *
// *     *      *     *
// *    *        *    *
// *   *          *   *
// *  *            *  *
// * *              * *
// **                **
// *                  *