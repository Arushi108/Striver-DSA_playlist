import java.util.*;
//brute force solution
public class IntersectionofArrays{
    public static void main(String[] args) {
        int arr1[]={1,2,2,3,3,4,5,6};
        int arr2[]={2,3,3,5,6,6,7};
        int n1=arr1.length;
        int n2=arr2.length;
        ArrayList<Integer>in=new ArrayList<>();
        int[] arr=new int[n2];
        Arrays.fill(arr,0);
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if(arr1[i]==arr2[j] && arr[j]==0){
                    in.add(arr1[i]);
                    arr[j]=1;
                    break;
                }
                if(arr1[i]<arr2[j]){break;}
            }
        }
        for(int x:in){
            System.out.print(x+" ");
        }

    }
}
//T.C => O(n1 X n2);
//S.c => O(n2) //approximately equals to this













//optimal solution
// public class IntersectionofArrays{
//     public static void main(String[] args) {
//         int arr1[]={1,2,2,3,3,4,5,6};
//         int arr2[]={2,3,3,5,6,6,7};
//         int n1=arr1.length;
//         int n2=arr2.length;
//         int i=0,j=0;

//         ArrayList<Integer> Intersection=new ArrayList<>();
//         while(i<n1 && j<n2){
//             if(arr1[i]<arr2[j]){
//                 i++;
//             }
//             else if(arr1[i]>arr2[j]){
//                 j++;
//             }
//             else{
//                 Intersection.add(arr1[i]);
//                 i++;
//                 j++;
//             }

//         }
//         for(int x:Intersection){
//             System.out.print(x+" ");
//         }
//     }
// }