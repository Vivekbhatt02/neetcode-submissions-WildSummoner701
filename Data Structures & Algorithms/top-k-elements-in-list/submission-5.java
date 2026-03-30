class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num: nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        PriorityQueue<Integer> queue=new PriorityQueue<>((a,b)->map.get(a)-map.get(b));

        for(int value: map.keySet()){
            queue.add(value);
            if(queue.size()>k){
                queue.poll();
            }
        }

        int[] solution=new int[k];
        for(int i =0;i<k;i++){
            solution[i]=queue.poll();
        }

        return solution;
    }
}
