class Solution {
    public int[] topKFrequent(int[] nums, int k) {
    Map<Integer, Integer> integerCount = new HashMap<>();

    for (int i : nums) {
        integerCount.put(i, integerCount.getOrDefault(i, 0) + 1);
    }

    List<LinkedList<Integer>> list = new ArrayList<>();

    for (int i = 0; i <= nums.length; i++) {
        list.add(new LinkedList<>());
    }

    for (int i : integerCount.keySet()) {
        int frequency = integerCount.get(i);
        list.get(frequency).add(i);
    }

    int index = 0;
    int[] topFrequentElements = new int[k];

    for (int i = list.size() - 1; i >= 1; i--) {
        if (k == 0) {
            break;
        }
        while (k != 0 && !list.get(i).isEmpty()) {
            topFrequentElements[index++] = list.get(i).pollFirst();
            k--;
        }
    }

    return topFrequentElements;
  }
}
