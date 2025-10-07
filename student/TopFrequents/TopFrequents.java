import java.util.*;

public class TopFrequents {
    public List<Integer> findTopKFrequent(int[] nums, int k) {
        // Edge cases
        if (nums == null || nums.length == 0) return new ArrayList<>();

        // 1. Count frequencies and first occurrences
        Map<Integer, Integer> countMap = new HashMap<>();
        Map<Integer, Integer> firstIndexMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            if (!firstIndexMap.containsKey(num)) {
                firstIndexMap.put(num, i);
            }
        }

        // 2. Custom comparator: higher freq first, then lower first index
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> {
            if (b[1] != a[1]) return b[1] - a[1]; // Frequency descending
            return a[2] - b[2];                   // If tie, earlier first index
        });

        // Fill the heap
        for (int num : countMap.keySet()) {
            maxHeap.add(new int[]{num, countMap.get(num), firstIndexMap.get(num)});
        }

        // 3. Extract top K frequent elements
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < k && !maxHeap.isEmpty(); i++) {
            result.add(maxHeap.poll()[0]);
        }
        return result;
    }
}
