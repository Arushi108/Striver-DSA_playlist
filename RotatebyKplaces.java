// import java.util.*;

// public class RotatebyKplaces{
//     public static void main(String[] args) {
//         int arr[]={1,2,3,4,5,6,7};
//         int n=arr.length;
//         Scanner sc=new Scanner(System.in);
//         System.out.print("How many spaces : ");
//         int d=sc.nextInt();
//         leftrotate(arr,n,d);
//     }
//     static void leftrotate(int[] arr,int n,int d){
//         d=d%n;
//         int temp[]=new int[d];
//         for(int i=0;i<d;i++){
//             temp[i]=arr[i];
//         }
//         for(int i=d;i<n;i++){
//             arr[i-d]=arr[i];
//         }
//         for(int i=0;i<d;i++){
//             arr[n-d+i]=temp[i];
//         }
//         for(int i=0;i<n;i++){
//             System.out.print(arr[i]+" ");
//         }

//     }
// }
//SC => O(d) cuz used temporary array as an extra space
//TC => O(d)+O(n-d)+O(d) => O(n+d)


//Optimal solution in space O(1)

import java.util.*;

public class RotatebyKplaces {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int n = arr.length;
        
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        
        // Normalize d to ensure it's within the bounds of the array
        d = d % n;
        
        // Rotate the array by 'd' places
        reverse(arr, 0, d - 1);      // Reverse the first part (0 to d-1)
        reverse(arr, d, n - 1);      // Reverse the second part (d to n-1)
        reverse(arr, 0, n - 1);      // Reverse the entire array to get the final rotated array
        
        // Print the rotated array
        System.out.print("Rotated array: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

    // Method to reverse elements in the array from index 'start' to 'end'
    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            // Swap elements at start and end indices
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Move towards the center
            start++;
            end--;
        }
    }
}
//T.C => O(d)+O(n-d)+O(n)=)(2n)
//S.C => O(1) no extra space is used
