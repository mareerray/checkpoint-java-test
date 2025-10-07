import java.util.*;

public class HarmoniousFusion {
    public int[] merge(int[] arr1, int[] arr2) {
        int len1 = arr1.length, len2 = arr2.length;
        int[] result = new int[len1 + len2];
        int i = 0, j = 0, k = 0;

        // Merge while both arrays have elements left
        while (i < len1 && j < len2) {
            if (arr1[i] <= arr2[j]) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }
        }
        // Copy rest of arr1 if any left
        while (i < len1) {
            result[k++] = arr1[i++];
        }
        // Copy rest of arr2 if any left
        while (j < len2) {
            result[k++] = arr2[j++];
        }

        return result;
    }
}