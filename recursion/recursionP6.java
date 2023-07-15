package recursion;

public class recursionP6 {
    public static int xtoPown(int x, int n) {

        // base condition 1
        if (n == 0) {
            return 1;
        }

        // base condition 2
        if (x == 0) {
            return 0;
        }

        // more optimize way to solve this problem
        // for even
        // if (n % 2 == 0) {
        // return xtoPown(x, n / 2) * xtoPown(x, n / 2);
        // }
        // for odd
        // else {
        // return xtoPown(x, n / 2) * xtoPown(x, n / 2) * x;
        // }

        int x_ = xtoPown(x, n - 1);
        int result = x * x_;
        return result;
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 5;

        int output = xtoPown(x, n);
        System.out.println(output);
    }
}
