package dsaAlgo;

import java.util.Arrays;
import java.util.HashMap;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            int compliment = target - nums[i];

           if(hm.containsKey(compliment)){
                return new int[]{hm.get(compliment),i};
            }

           hm.put(nums[i], i);
        }

        return new int[]{};
    }
    
    public static void main(String[] args) {
    	TwoSum ts = new TwoSum();
       int[] nums = {2,7,11,15};
    	int target = 9;
    	int[] result = ts.twoSum(nums, target);
    	System.out.print(Arrays.toString(result)) ;
    }
}