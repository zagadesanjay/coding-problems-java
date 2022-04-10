package com.sz.leetcode;

import java.util.*;

public class ThreeSum_15 {

	public static void main(String[] args) {
		
		int arr[] = new int[] {-1,0,1,2,-1,-4};
		Set<Integer> dups = new HashSet<>();
		 
//		 System.out.println(dups.add(-1));
//		 System.out.println(dups.add(0));
		for (int i = 0; i < arr.length; ++i)
			if(dups.add(arr[i])) {
				System.out.println("Inside " + i);
			}
		
		
		
		threeSum2(new int[] {-1,0,1,2,-1,-4});
		
		// [-4, -1, -1, 0, 1, 2]
		
		
	}
	
	
	public static List<List<Integer>> threeSum2(int[] nums) {
        Set<List<Integer>> res = new HashSet<>();
        Set<Integer> dups = new HashSet<>();
        Map<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < nums.length; ++i)
            if (dups.add(nums[i])) {
                for (int j = i + 1; j < nums.length; ++j) {
                    int complement = -nums[i] - nums[j];
                    if (seen.containsKey(complement) && seen.get(complement) == i) {
                        List<Integer> triplet = Arrays.asList(nums[i], nums[j], complement);
                        Collections.sort(triplet);
                        res.add(triplet);
                    }
                    seen.put(nums[j], i);
                }
            }
        return new ArrayList(res);
    }
	
	
	public static List<List<Integer>> threeSum(int[] nums) {
	      
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<List<Integer>> ();
        
        for(int i = 0; i < nums.length; i++){
            if(i == 0 || nums[i-1] != nums[i])
                search(nums, i, result);
        }
        return result;
    }
	
	public static void search(int[]nums, int i, List<List<Integer>> result){
        
        int lo = i+1, hi = nums.length -1;
        
        while(lo < hi){
            int sum = nums[i] + nums[lo] + nums[hi];
            if(sum < 0){
                lo++;
            } else if(sum > 0){
                hi--;
            } else {
                
                result.add(Arrays.asList(nums[i], nums[lo++],  nums[hi--]));
                while(lo < hi && nums[lo] == nums[lo-1]){
                    lo++;
                }
            }    
        }
    }
	
	
	

}
