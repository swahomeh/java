public class BubbleSort {
    public static int[] bubbleSort(int[] arr) {
        int i, j, temp = 0;
        int n = arr.length;
        for (i = 0; i < n-1; i++) {
            for (j = 0; j < n-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    // swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {63, 13, 27, 10, 22, 90, 17};
        arr = bubbleSort(arr);
        System.out.println("Sorted array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}