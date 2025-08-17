/*
 * LeetCode #128 - Longest Consecutive Sequence
 * Problem Link: https://leetcode.com/problems/longest-consecutive-sequence/
 * Solution: HashSet approach (O(n) time, O(n) space)
 */

import java.util.*;

class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> check = new HashSet<>();


        for(int num :nums){
            check.add(num);
        }


        int maxstreak=0;
      

        for(int num:check){
            if(!check.contains(num-1)){
                int currentnum=num;
                int currentstreak=1;
                while(check.contains(currentnum+1)){
                    currentnum++;
                    currentstreak++;
                }

                maxstreak=Math.max(maxstreak,currentstreak);
            }
       }

        
     return maxstreak;
    }   
    
}
