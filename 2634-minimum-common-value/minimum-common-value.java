class Solution {
    private boolean isThere(int[] arr, int num){
    int start = 0;
    int end = arr.length - 1;
    while(start <= end){
        int mid = (start + end) / 2;
        if(num == arr[mid]){
            return true;
        }
        else if(num > arr[mid]){
            start = mid + 1;
        }
        else{
            end = mid - 1;
        }
    }
    return false;
}
    public int getCommon(int[] nums1, int[] nums2) {
        for(int i=0; i< nums1.length; i++){
            if(isThere(nums2, nums1[i])){
                return nums1[i];
            }
        }
        return  -1;
    }
}