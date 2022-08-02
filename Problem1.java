class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer,Integer> map = new HashMap<>();

        for(int i =0;i<nums.length;i++){
            int find = target - nums[i];
            if(map.containsKey(find) ){
                result[0]=i;
                result[1]=map.get(find);
                break;
            }
            map.put(nums[i],i);
        }

        return result;
    }
}
