class Solution {
    public int longestSquareStreak(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int maxStreak = 0;

        
        for (int num : nums) {
            if (num == 0) continue;
            
            int current = num;
            int streak = 0;

           
            while (numSet.contains(current)) {
                streak++;
                
               
                if (current > Math.sqrt(Integer.MAX_VALUE)) break;
                current = current * current;
            }

            
            if (streak > 1) {
                maxStreak = Math.max(maxStreak, streak);
            }
        }

        return maxStreak == 0 ? -1 : maxStreak;
    }
}