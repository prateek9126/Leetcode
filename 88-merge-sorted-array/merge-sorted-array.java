import java.util.*;
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        /*int p=0;
        int q=0;
        int a = nums1.length;
        int b = nums2.length;
        int c=a+b;
        int arr[]=new int[m+n];
        int k=0;
        while(p<m && q<n){
            if(nums1[p]<=nums2[q]){
                arr[k++]=nums1[p++];
            }
            else{
                arr[k++]=nums2[q++];
            }
        }
        while(p<nums1.length){
            arr[k++]=nums1[p++];
        }
        while(q<nums2.length){
            arr[k++]=nums2[q++];
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }*/
        int p = 0;
        int q = 0;
        int arr[] = new int[m + n];
        int k = 0;

        while (p < m && q < n) {

            if (nums1[p] <= nums2[q]) {
                arr[k++] = nums1[p++];
            }
            else {
                arr[k++] = nums2[q++];
            }
        }

        while (p < m) {
            arr[k++] = nums1[p++];
        }

        while (q < n) {
            arr[k++] = nums2[q++];
        }

        for (int i = 0; i < arr.length; i++) {
            nums1[i] = arr[i];
        }
    }
}


        /*int arr[]=new int[nums1.length+nums2.length];
        int k=0;
        Boolean t=true;
        int b=0;
        for(int j=0;j<nums1.length;j++){
            if(nums1[j]==0){
                for(int i=j;i<nums1.length;i++){
                    if(num1[i]!=0){
                        t=false;
                    }
                    if(t){
                        break;
                    }
                }
            }
            b=b+1;
        }
        for(int i=0;i<b;i++){
            arr[i]=nums1[i];
            k++;
        }
        Boolean f=true;
        int p=0;
        for(int j=0;j<nums2.length;j++){
            if(nums1[j]==0){
                for(int i=j;i<nums2.length;i++){
                    if(num1[i]!=0){
                        f=false;
                    }
                    if(f){
                        break;
                    }
                }
            }
            p+p+1;
        }
        for(int i=k+1;i<p;i++){
            arr[i]=nums2[i-k];
        }
        Arrays.sort(arr);*/
        /*int i = m - 1;    
        int j = n - 1;   

        for (int k = m + n - 1; k >= 0 && j >= 0; k--) {
            if (i >= 0 && nums1[i] > nums2[j]) {
            nums1[k] = nums1[i];
            i--;
        } else {
            nums1[k] = nums2[j];
            j--;
        }
        }*/



        
    