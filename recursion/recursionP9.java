//WAP to check if the array is sortes in increasing order or not

package recursion;

public class recursionP9 {
    public static boolean isSorted(int arr[], int index) {
        if (index == arr.length - 1) {
            return true;
        }
        if (arr[index] < arr[index + 1]) {
            return isSorted(arr, index + 1);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 6, 7 };
        System.out.println(isSorted(arr, 0));
    }
}
