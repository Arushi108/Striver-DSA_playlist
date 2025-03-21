import java.util.*;

// public class rearrangeArray{
//     public static void main(String[] args) {
//         int[] arr={3,1,-2,-5,2,-4};
//         int n=arr.length;
//         int[] ans=new int[n];
//         int[] pos=new int[n/2];
//         int[] neg=new int[n/2];
//         int j=0;int k=0;
//         for(int i=0;i<n;i++){
//             if(arr[i]>0){
//                 pos[j]=arr[i];
//                 j++;
//             }
//             else{
//                 neg[k]=arr[i];
//                 k++;
//             }
//         }
//         for(int i=0;i<n/2;i++){
//             ans[2*i]=pos[i];
//             ans[2*i+1]=neg[i];
//         }
//         for(int i=0;i<n;i++){
//             System.out.print(ans[i]+" ");
//         }
//     }
// }

//T.C => O(2N)
//S.C=> O(N)


//Optimal
public class rearrangeArray{
    public static void main(String[] args) {
        int[] nums={3,1,-2,-5,2,-4};
        int[] ans=new int[nums.length];
        int posIndex=0,negIndex=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                ans[negIndex]=nums[i];
                negIndex+=2;

            }
            else{
                ans[posIndex]=nums[i];
                posIndex+=2;
            }
        }
        for(int i=0;i<nums.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
    
}
// T.C => O(N)
//S.C => O(N)