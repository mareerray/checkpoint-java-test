public class BubbleSort extends Sorter {
    @Override
    public void sort() {
        // Retrieve the array to be sorted from the parent Sorter class
        int[] arr = getArray();
        // Store the length for convenience
        int size = arr.length;
        // Flag to track if any swap occurred in the current pass
        boolean swapped;

        // Outer loop: run (size - 1) passes over the array
        for(int i = 0; i < size-1; i++) {
            swapped = false; // No swaps have been made yet in this pass
            // Inner loop: Compare each pair of adjacent elements
            // After each pass, the largest unsorted element "bubbles" to its correct position
            for (int j = 0; j < size-i-1; j++) {
                // If element at j is greater than element at j+1, swap them
                if (arr[j] > arr[j+1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true; // Record that a swap occurred
                }
            }
            // If no swaps happened in this pass, the array is already sorted
            if (!swapped) break;
        }
    }
}