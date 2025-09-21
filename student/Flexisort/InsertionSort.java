public class InsertionSort extends Sorter {
    @Override
    public void sort() {
        // Retrieve the array to be sorted from the parent Sorter class
        int[] arr = getArray();
        // Store the length for convenience
        int size = arr.length;

        // Loop from the second element to the end
        for (int i = 1; i < size; i++) {
            int key = arr[i]; // Value to be inserted into the sorted part
            int j = i - 1;
            // Move elements greater than key to one position ahead to make space
            while (j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            // Insert the key at its correct position
            arr[j+1] = key;
        }
    }
}