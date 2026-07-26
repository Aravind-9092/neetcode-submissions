class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        HashMap <Integer,Integer> map = new HashMap<>();
        List <Integer> result = new ArrayList<>();

        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();

            if(value > n/3){
             result.add(key);
            }
           
        }

        return result;





    }
}