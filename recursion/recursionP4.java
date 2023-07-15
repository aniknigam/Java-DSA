//calculate the factorial of the number n with the help of recursion 
package recursion;

public class recursionP4 {

    public static int calculateFact(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        int fact_nm1 = calculateFact(n - 1);
        int fact_n = n * fact_nm1;
        return fact_n;
    }

    public static void main(String[] args) {
        int n = 5;
        int ans = calculateFact(n);
        System.out.println(ans);

    }
}
