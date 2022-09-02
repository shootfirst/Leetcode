class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=0,h=nums.length-1,m;
        while(l<=h){
            m=(l+h)/2;
            if(nums[m]<target) l=m+1;
            else if(nums[m]>target) h=m-1;
            else return m;
        }
        return l;
    }
}