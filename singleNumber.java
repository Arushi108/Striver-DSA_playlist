import java.util.HashMap;
import java.util.Map;
// public class singleNumber{
//     public static void main(String[] args) {
//         int[] arr={1,1,2,3,3,4,4};
//         for(int i=0;i<arr.length;i++){
//             int count=0;
//             for(int j=0;j<arr.length;j++){
//                 if(arr[i]==arr[j]){
//                     count++;
//                 }
                
//             }
//             if(count==1){
//                 System.out.print("Single number : " + arr[i]);
//                 break;
//             }
            
//         }

//     }
// }
// T.C => O(N^2)



// Better solution => Hashing
// public class singleNumber{
//     public static void main(String[] args) {
//         int[] arr={1,1,2,3,3,4,4};
//         int maxi=Integer.MIN_VALUE;
//         for(int i=0;i<arr.length;i++){
//             maxi=Math.max(arr[i],maxi);
//         }
//         int[] Hash=new int[maxi+1];
//         for(int i=0;i<arr.length;i++){
//             Hash[arr[i]]++;
//         }
//         for(int i=0;i<Hash.length;i++){
//             if(Hash[i]==1){
//                 System.out.print("Single number : " + i);
//             }

//         }

//     }
// }

// T.C => O(3N)
//what if we get bigger numbers in an array so impossible to hash them in that case we can use a Map
public class singleNumber{
    public static void main(String[] args) {
        int[] arr={1,1,2,3,3,4,4};
        int n=arr.length;
        HashMap<Integer,Integer>mpp=new HashMap<>();
        for(int i=0;i<n;i++){
            int value=mpp.getOrDefault(arr[i],0);
            mpp.put(arr[i],value+1);
            
        }
        for(Map.Entry<Integer,Integer> it:mpp.entrySet()){
            if(it.getValue()==1){
                System.out.print(it.getKey());
                break;
            }
        }

    }
}
//T.C => O(NlogM)+O(n/2+1)
// S.C => O(n2+1) where n is the doubling elements and one for the single element




//Optimal Solution using Xor
// public class singleNumber {
//     public static void main(int[] nums) {
//         int xor=0;
//         for(int i=0;i<nums.length;i++){
//             xor^=nums[i];

//         }
//         System.out.print(xor);
//     }
// }