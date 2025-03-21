// public class maxSubArray{
//     public static void main(String[] args) {
//         int[] arr={-2,-3,4,-1,-2,1,5,-3};
//         int n=arr.length;
//         int maxi=Integer.MIN_VALUE;
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                 int sum=0;
//                 for(int k=i;k<j;k++){
//                     sum+=arr[k];
//                 }
//                 maxi=Math.max(maxi,sum);
//             }
            

    
//         }
//         System.out.print("Maximum sum of subaaray is : "+maxi);
//     }
// }
// T.C = O(N^3)
// S.C => O(1)



//better solution 
// public class maxSubArray{
//     public static void main(String[] args) {
//         int[] arr={-2,-3,4,-1,-2,1,5,-3};
//         int n=arr.length;
//         int maxi=Integer.MIN_VALUE;
//         for(int i=0;i<n;i++){
//             int sum=0;
//             for(int j=i;j<n;j++){
//                 sum+=arr[j];
//                 maxi=Math.max(maxi,sum);
//             }
            

    
//         }
//         System.out.print("Maximum sum of subaaray is : "+maxi);
//     }
// }
// T.C => O(N^2)
// S.C => O(1)



//Optimal solution -> KADANE'S ALGORITHM
public class maxSubArray{
    public static void main(String[] args) {
        int[] arr={-2,-3,4,-1,-2,1,5,-3};
        int n=arr.length;
        int maxi=Integer.MIN_VALUE;
        int sum=0;
        int ansStart=-1;
        int ansEnd=-1;
        int start=-1;
        for(int i=0;i<n;i++){
            if(sum==0) start=i;
            sum+=arr[i];
            if(sum>maxi){
                maxi=sum; //agar sum bda hogya maxi se toh maxi ko wo dedo 
                ansStart=start;
                ansEnd=i;
            }
            else if(sum<0){
                sum=0; // we will initialize sum to 0 agar sum negative mai jayega toh wrna chota bnn jayega wo
            } // chahe negative numbers se sum kam hora ho but atleast it is giving some positive addition isliye we will take it but maxi mai wo tabhi jayega jab bda hoga usse
        }
        System.out.print(maxi);

    }

}
// T.C => O(N)
// S.C => O(1)