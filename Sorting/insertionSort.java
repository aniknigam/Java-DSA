public class insertionSort {
    public static void main(String[] args) {
        int[] arr = { 8, 1, 4, 5, 3, 9 };

        // outer loop
        // outer loop is starting from 1 because at 0 index the element is considered as
        // sorted

        for (int i = 1; i < arr.length; i++) {
            // first element of unsorted element is stored in temp
            int temp = arr[i];
            // j = j - 1 because we are moving right to left
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
