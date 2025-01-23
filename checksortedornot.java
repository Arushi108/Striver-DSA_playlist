import java.util.*;

public class checksortedornot{
    public static void  main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]= new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        if (isSorted(a, n)) {
            System.out.println("Array is sorted.");
        } else {
            System.out.println("Array is not sorted.");
        }

    }
    static boolean isSorted(int a[],int n){
        for (int i = 1; i < n; i++) {
            if (a[i-1]<= a[i]) { 
            }
            else{
                return false;
            }
        }
        return true;

    }
}