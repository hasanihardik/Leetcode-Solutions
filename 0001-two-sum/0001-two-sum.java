class Solution {
    public int[] twoSum(int[] nums, int target) {
        // store key index pair in map

        HashMap<Integer,Integer> map = new HashMap<>();
        int more = -1;

        for(int i=0;i<nums.length;i++){
            more = target - nums[i];
            if(map.containsKey(more)){
                return new int[]{i,map.get(more)};
            }
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};


    }
}