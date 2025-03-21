import java.util.*;
// Brute solution 
//Merge sort // T.C => O(NlogN) , S.C => O(N)

//Better solution 
//keep three count cnt0 cnt1 and cnt2 iterate through array count all these and then overwrite the array these many times 
//T.C => O(2N) 

//Optimal solution => will iterate only once through the array
//T.C => O(N) , S.C => O(1) no extra space required
//cuz with every iteration mid++ or high-- one element is sorted always since entire array is unsorted so it will end up taking upto n iterations
// DUTCH NATIONAL FLAG ALGORITHM
public class sort012{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int low=0,mid=0,high=nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                swap(nums,low,mid);
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                swap(nums,mid,high);
                high--;
            }
        }
        
    }
    public static void swap(int[] nums,int a,int b){
       int temp=nums[a];
       nums[a]=nums[b];
       nums[b]=temp;
    }
}
