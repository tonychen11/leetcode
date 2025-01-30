class Solution {
    public int leastInterval(char[] tasks, int n) {
        Map<Character, Integer> map = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        Queue<int[]> queue = new LinkedList<>();
        int time = 0;

        for(char c : tasks){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(char c : map.keySet()){
            pq.add(map.get(c));
        }

        while(!pq.isEmpty() || !queue.isEmpty()){
            if(!queue.isEmpty() && queue.peek()[1] == time){
                pq.add(queue.poll()[0]);
            }
            time++;
            if(!pq.isEmpty()){
                int num = pq.poll();
                if(num > 1){
                    int[] arr = {num - 1, time + n};
                    queue.add(arr);
                }
            }

        }

        return time;
    }
}
