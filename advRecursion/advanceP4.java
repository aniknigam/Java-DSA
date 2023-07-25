package advRecursion;

public class advanceP4 {

    // Recursive function to find the number of ways to invite 'n' people to the
    // party
    // considering they can attend either as singles or in pairs.
    public static int callGuest(int n) {

        // Base case: If there's only one person or no one to invite, there's only one
        // way.
        if (n <= 1) {
            return 1;
        }

        // Recursive call for inviting the next person as a single.
        int way1 = callGuest(n - 1);

        // Recursive call for inviting the next person along with one of the remaining
        // (n-1) people as a pair.
        // There are (n-1) options for choosing the pair, and once chosen, the problem
        // reduces to inviting the
        // remaining (n-2) people.
        int way2 = (n - 1) * callGuest(n - 2);

        // Summing up the number of ways when inviting as single or pair.
        return way1 + way2;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println("Number of ways to invite " + n + " people to the party: " + callGuest(n));
    }
}
