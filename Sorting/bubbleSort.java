
public class bubbleSort {

    public static int printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        return 1;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 1, 5, 2, 8, 7 };
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    // swaping anrray
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        // method to print the sorted array
        printArray(arr);
    }
}
