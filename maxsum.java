class Solution{
    public int maxSubarray(int[] nums){
        int maxInt=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
            maxInt=Math.max(maxInt, sum);
            if(sum<0){
                sum=0;
            }
            
        }
        return maxInt;
    }
}
class maxSum{
    public static void main(String[] args) {
        
    }
}