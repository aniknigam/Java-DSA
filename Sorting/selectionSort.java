public class selectionSort {

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String[] args) {
        int[] arr = { 8, 3, 7, 2, 5, 1 };

        for (int i = 0; i < arr.length - 1; i++) {
            // we are assuming the first element to be the smallest
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[smallest]) {
                    // we are changing the index value of smallest
                    smallest = j;
                }
            }
            // we are swaping an array
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        // this is the function or method that will print the sorted array
        printArray(arr);
    }
}
