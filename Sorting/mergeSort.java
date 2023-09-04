public class mergeSort {

    public static void conquer(int arr[], int si, int mid, int ei) {
        // create new array to sort the divided part

        int merged[] = new int[ei - si + 1];// [5-0+1]= 6

        int indx1 = si;
        int indx2 = mid + 1;
        int x = 0;// tracking merged array

        while (indx1 <= mid && indx2 <= ei) {
            if (arr[indx1] <= arr[indx2]) {
                merged[x] = arr[indx1];
                x++;
                indx1++;
            } else {
                merged[x] = arr[indx2];
                x++;
                indx2++;
            }
        }

        while (indx1 <= mid) {
            merged[x] = arr[indx1];
            x++;
            indx1++;
        }

        while (indx2 <= ei) {
            merged[x] = arr[indx2];
            x++;
            indx2++;
        }

        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }

    }

    public static void divide(int arr[], int si, int ei) {// si - starting index, ei- ending index
        if (si >= ei) {
            // means we have reached the stage where we cannot further divide the array
            return;
        }

        // find the mid
        // way1- mid = (si+ei)/2;
        // way2 - this is more optimize way because we don't face space issue or index
        // out of bound issue.
        int mid = si + (ei - si) / 2;
        // call recursive method
        divide(arr, si, mid);// for 1 half
        divide(arr, mid + 1, ei);// for 2 half

        // Now we will conquer

        conquer(arr, si, mid, ei);

    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        int n = arr.length;

        divide(arr, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }
}
