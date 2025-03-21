import java.util.*;

// public class twoSum{
//     public static void main(String[] args) {
//         int[] arr={2,7,11,15};
//         int target=9;
//         int n=arr.length;
//         System.out.println(mysum(arr,n,target));
        
//     }
//     public static int[] mysum(int[] arr,int n,int target){
//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                 if(arr[i]+arr[j]==target){
//                    return new int[]{i,j};
//                 }
//             }
//         }
//         return new int[]{-1,-1};

//     }
// }
// T.C => O(N^2)


//Better solution try to reduce time complexity
// public class twoSum{
//     public static void main(String[] args) {
//         int[] arr={2,6,5,8,11};
//  HashMap<Integer,Integer> uni=new HashMap<>();
//         int target=14;
//         for(int i=0;i<arr.length;i++){
//      if(!uni.containsKey(target-arr[i])){
//                 uni.put(arr[i],i);
//             }
//             else{
//                 System.out.print(uni.get(target-arr[i])+" "+i);
//                 return;
//             }

//         }
//     }
    
// }
// T.C => O(N)
//its O(N X log(N))
//S.C => O(N) every element is dumped into the map




//Optimal solution without using a map
//for variety 1 like only returning yes or no if 2sum is possible optimal solution is the best otherwise the better solution if want to return the indices as well
public class twoSum{
    public static void main(String[] args) {
        int[] arr={2,6,11};
        int target=14;
        System.out.println(tell(arr,target));
        

    }
    public static boolean  tell(int arr[],int target){
        Arrays.sort(arr); // T.C => NlogN
        int left=0,right=arr.length-1;
        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum==target){
                return true;
            }
            if(sum<target){
                left++;
            }
            else{
                right--;
            }
           

        }
         return false;

    }
}
