class Solution {
    public int findNumbers(int[] nums) {
        int evenCount=0;
        for(int num:nums){
            int digits=countDigits(num);
            if(digits%2==0){
                evenCount++;
            }
        }
        return evenCount;
    }
private int countDigits(int num){
    int count=0;
        while(num>0){
            count++;
            num/=10;
        }
        return count;
    }
}