class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> list = new ArrayList<>();

        int[] currentInterval = intervals[0];

        for(int i = 1; i < intervals.length; i++){
            if(intervals[i][0] <= currentInterval[1] && intervals[i][1] > currentInterval[1]){
                currentInterval[1] = intervals[i][1];                          
            }
            else if(intervals[i][0] > currentInterval[1]){
                list.add(currentInterval);
                currentInterval = intervals[i];
            }
        }

        list.add(currentInterval);
        int size = list.size();
        int[][] merged = new int[size][2];

        for(int i = 0; i < size; i++){
            merged[i] = list.get(i);
        }

        return merged;
    }
}
