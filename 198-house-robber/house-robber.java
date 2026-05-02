class Solution {
    public int rob(int[] nums) {
        int prev1 = 0; // max till previous house
        int prev2 = 0; // max till house before previous

        for (int num : nums) {
            int take = prev2 + num;   // rob current house
            int skip = prev1;         // skip current house
            
            int current = Math.max(take, skip);
            
            // shift values forward
            prev2 = prev1;
            prev1 = current;
        }
        
        return prev1;
    }
}