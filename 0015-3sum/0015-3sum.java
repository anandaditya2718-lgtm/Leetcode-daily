class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set <List<Integer>> res = new HashSet<>();
        if(nums.length ==0){
            return new ArrayList<>(res);
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            int s = i+1;
            int e= nums.length-1;
            while(s<e){
                int sum = nums[s] + nums[e];
                if(sum==-nums[i]){
                    res.add(Arrays.asList(nums[i], nums[s++], nums[e--]));
                }
                else if(sum > -nums[i]){
                    e--;
                }
                else if(sum < -nums[i]){
                    s++;
                }
            }
        }
        return new ArrayList<>(res);
        }
}