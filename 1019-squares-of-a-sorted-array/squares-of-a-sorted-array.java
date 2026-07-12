class Solution {
    public int[] sortedSquares(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int[] ans=new int[nums.length];
        int index=nums.length-1;
        while(left<=right){
            int leftsquare=nums[left]*nums[left];
            int rightsquare=nums[right]*nums[right];
            if(leftsquare>rightsquare){
                ans[index]=leftsquare;
                left++;
            }
            else{
                ans[index]=rightsquare;
                right--;
            }
            index--;
        }
        return ans;
    }
}