package merge;

import java.util.Arrays;

public class Solution2 {
    public static void main(String[] args) {
        int[] nums = {2,3,5,3,25,4,50};
        mergeSort1(nums, 0, nums.length-1);
        System.out.println(Arrays.toString(nums));
    }


    static void mergeSort1(int[] nums, int l, int u) {
        if(l<u)
        {
            int m=(l+u)/2;
            mergeSort1(nums,l,m);
            mergeSort1(nums,m+1,u);
            merge1(nums,l,m,u);
        }
    }
    static void merge1(int[] nums, int l, int m, int u){
        int len1 = m-l+1;
        int len2 = u-m;
        int[] left = new int[len1];
        int[] right = new int[len2];
        for(int x = 0; x < len1; x++) {
            left[x] = nums[x + l];
        }
        for(int x = 0; x < len2; x++) {
            right[x] = nums[x + m + 1];
        }
        int i = 0, j = 0, k = l;
        while(i < len1 && j < len2){
            if(left[i] < right[j]){
                nums[k] = left[i];
                i++;
            }else{
                nums[k] = right[j];
                j++;
            }
            k++;
        }
        while(i < len1){
            nums[k] = left[i];
            i++;
            k++;
        }
        while(j < len2){
            nums[j] = right[j];
            j++;
            k++;
        }
    }
}
