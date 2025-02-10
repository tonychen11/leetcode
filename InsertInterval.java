class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> intervalAfterInsert = new ArrayList<>();

        int start = newInterval[0];
        int end = newInterval[1];

        for(int i = 0; i < intervals.length; i++){
            if(start > intervals[i][1]){
                intervalAfterInsert.add(intervals[i]);
            }
            else if(end < intervals[i][0]){
                int[] interval = {start, end};
                intervalAfterInsert.add(interval);
                start = intervals[i][0];
                end = intervals[i][1];
            }
            else{
                start = Math.min(start, intervals[i][0]);
                end = Math.max(end, intervals[i][1]);
            }
        }

        int[] interval = {start, end};
        intervalAfterInsert.add(interval);

        int[][] output = new int[intervalAfterInsert.size()][2];

        for(int i = 0; i < intervalAfterInsert.size(); i++){
            output[i] = intervalAfterInsert.get(i);
        }

        return output;
    }
}
