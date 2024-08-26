public class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        Collections.sort(intervals, (a, b) -> a.start - b.start); //sorts the arraylist based on start time of each interval by increasing order

        for(int i = 0; i < intervals.size() - 1; i++){
            if(intervals.get(i).end > intervals.get(i+1).start){
                return false;
            }
        }
        return true;
    }
}
