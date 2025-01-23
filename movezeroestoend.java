
// public class movezeroestoend{
//     public static void main(String[] args) {
//         int arr[]={1,0,2,3,2,0,0,4,5,1};
//         int n=arr.length;
//         toend(arr,n);
//         for(int i=0;i<n;i++){
//             System.out.print(arr[i]+" ");
//         }
        
//     }
//     public static void toend(int arr[],int n){
//         for(int i=0;i<n;i++){
//             if(arr[i]==0){
//                 for(int j=i+1;j<n;j++){
//                     int temp=arr[i];
//                     arr[i]=arr[j];
//                     arr[j]=temp;
                
//             }
//             }
            
//         }


//     }

// }


//optimal solution
public class movezeroestoend{
    public static void main(String[] args) {
        int j=-1;
        int nums[]={1,2,0,3,2,4,0,0,5,6};
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                j=i;
                break;
            }
        }
        if(j==-1)return;
        for(int i=j+1;i<nums.length;i++){
            if(nums[i]!=0){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            j++;
            }
    }
}
}
//T.C => O(x)+O(N-x) => O(N)
//S.C => O(1)

    
