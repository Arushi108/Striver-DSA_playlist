// public class majorityElement{
//     public static void main(String[] args) {
//         int nums[]={2,2,3,3,1,2,2};
//         int n=nums.length;
//         int cnt=0;
//         for(int i=0;i<n;i++){
//             cnt=0;
//             for(int j=0;j<n;j++){
//                 if(nums[i]==nums[j]){
//                      cnt++;
//                 }
               
//             }
//             if(cnt>n/2){
//             System.out.println(cnt);
//             break;
//             }
//         }

//     }
// }



//Better solution => Using Hashmaps
//Better solutions have t.c either O(NlogN),O(2N) or O(N)
// public class majorityElement{
//     public static void main(String[] args) {
//         int[] arr={2,2,1,1,1,2,2};
//         int n=arr.length;
//         HashMap<Integer,Integer> me=new HashMap<>();
//         for(int i=0;i<n;i++){
//             int value=me.getOrDefault(arr[i],0);
//             me.put(arr[i],value+1);
//         }

//         for(Map.Entry<Integer,Integer> it:me.entrySet()){
//             if(it.getValue()>n/2){
//                 if(it.getValue()>n/2){
//                     System.out.print(it.getKey());
//                 }
//             }
//         }

        

//     }

//}
//OR
// HashMap<Integer,Integer> me=new HashMap<>();
//         if(nums.length==1){
//             return nums[0];
//         }
//         for(int i=0;i<nums.length;i++){
//             me.put(nums[i],me.getOrDefault(nums[i],0)+1);
//             if(me.get(nums[i])>nums.length/2){
//                 return nums[i];
//             }
//         }
//         return -1;
// T.C => O(NlogN) + O(N) LogN is used when ordered map but unordered ke worst case mai it will be O(N)
// S.C => O(N) worst case if all the elements are unique




//Optimal solution
// Moore's voting algorithm
public class majorityElement{
    public static void main(String[] args) {
        int[] arr={2,2,1,3,3,2,2};
        int n=arr.length;
        int cnt=0;
        int el=arr[0];
        for(int i=0;i<n;i++){
            if(cnt==0){
                el=arr[i];
                cnt=1;
            }
            else if(arr[i]==el){
                cnt++;
            }
            else{
                cnt--;
            }
        }
        // System.out.print(el);
        int cnt1=0;
        for(int i=0;i<n;i++){
            if(arr[i]==el){
                cnt1++;
            }
        }
        if(cnt1>n/2){
            System.out.print(el);
        }

    }
}
// T.C => O(N)
// S.C => O(1)