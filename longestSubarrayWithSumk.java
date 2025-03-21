
// public class longestSubarrayWithSumk{
//     public static void main(String[] args) {
//         int[] arr={-50,0,52};
//         int num=2;
//         int n=arr.length;
//         int maxi=0;
//         for(int i=0;i<n;i++){
//             int sum=0;
//             for(int j=i;j<n;j++){
//                 // for(int k=i;k<j;k++){
//                 //     sum+=arr[k];
//                 //     if(sum==num){
//                 //         maxi=Math.max(maxi,j-i+1);
//                 // }
//                 sum+=arr[j];
//                 if(sum==num){
//                     maxi=Math.max(maxi,j-i+1);
//                 }
//                 }
                
                
//             }
//             System.out.print(maxi);
//         }
        
//     }
// T.C => O(N^2)


//Better Solution using Hashing 
//prefix sum from random elements covering k and using reverse mathematics
public class longestSubarrayWithSumk{
    public static void main(String[] args) {
        
        
    }
}