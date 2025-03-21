//         int[] nums={0,3,1};
//         for(int i=1;i<nums.length;i++){
//             int flag=0;
//             for(int j=0;j<nums.length;j++){
//                 if(nums[j]==i){
//                     flag=1;
//                     break;
//                 }
//             }
//             if(flag==0){
//                 System.out.println(i);

//             }

//         }

//      }
// }
//T.C => O(N X N)
//S.C => O(1)




//Better solution using hash array
// public class missingNumber{
//     public static void main(String[] args) {
//         int[] a={9,6,4,2,3,5,7,0,1};
//         int n=a.length;
//         int ans=missing(a,n);
//         System.out.print("missing number: "+ans);
//     }
//     public static int missing(int[] num,int n){
//         int[] hash=new int[n+1];
//         for(int i=0;i<n;i++){
//             hash[num[i]]++;
//         }
//         for(int i=1;i<=n;i++){
//             if(hash[i]==0){
//                 return i;
//             }
//         }
//         return -1;
//     } 
// }
//T.C => O(2N)
//S.C => O(1)


//optimal solution


// public class missingNumber {
//     public static void main(String args[]) {
//         int N = 5;
//         int a[] = {1, 2, 4, 5};
//          int sum = (N * (N + 1)) / 2;

//         //Summation of all array elements:
//         int s2 = 0;
//         for (int i = 0; i < N - 1; i++) {
//             s2 += a[i];
//         }

//         System.out.print(sum - s2);
//     }
// } 


// using XOR
public class missingNumber {
    public static void main(String args[]) {
       int[] nums={3,0,1};
       int n=nums.length;
       int xor1=0;
       int xor2=0;
       for(int i=0;i<n;i++){
        xor1^=nums[i];
        xor2^=(i+1);
       }
       System.out.print(xor1^xor2);
} 
}




