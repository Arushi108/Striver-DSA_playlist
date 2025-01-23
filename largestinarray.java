// import java.util.*;


// public class largestinarray{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int a[] = new int[n];
//         for(int i=0;i<n;i++){
//             a[i] = sc.nextInt();
//             }
//         System.out.println("Largest element is: "+sort(a));

//     }
//     static int sort(int arr[]){
//         Arrays.sort(arr);
//         return arr[arr.length-1];
//     }
// }

import java.util.*;

public class largestinarray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Largest element is: "+findlargest(a));

    }
    static int findlargest(int arr[]){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

}