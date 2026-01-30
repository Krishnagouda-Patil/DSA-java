import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums ={10,8,11,23,6,2};
        int target=14;
        int [] result = twoSum(nums,target);
        System.out.println("Indices of the two numbers: [" + result[0] + ", " + result[1] + "]");
    }

    public static int[] twoSum(int[] nums,int target){
        Map<Integer,Integer> map = new java.util.HashMap<>();
        for(int i=0;i<nums.length;i++){
            int diff = target-nums[i];
            if(map.containsKey(diff)){
                return new int[]{map.get(diff), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}
