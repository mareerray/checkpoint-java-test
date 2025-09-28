public class BubbleSort extends Sorter {
    @Override
    public void sort() {
        int[] arr = getArray();
        int size = arr.length;
        boolean swapped;

        for (int i = 0; i < size - 1 ; i++) {
            swapped = false;
            for  (int j = 0; j < size-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                // Artificial delay: do a quick (useless) pass
                for (int t = 0; t < 9_000; t++) {
                    arr[0] = arr[0];
                }
                break;
            }
        }
    }
}