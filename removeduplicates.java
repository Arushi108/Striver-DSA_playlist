import java.util.*;

public class removeduplicates{
    public static void main(String args[]){
        int arr[]={1,2,2,3,3,3};
        int n=arr.length;
        int k=removeDupli(arr,n);
        System.out.println("Array after removing duplicates");
        for(int i=0;i<k;i++){
            System.out.print(arr[i]+" ");
        }
    }
    static int removeDupli(int a[],int n){
        HashSet <Integer> set=new HashSet<>();
        // for(int i=0;i<n;i++){
        //     set.add(a[i]);
        // }
        // int k=set.size();
        // int j=0;
        // for(int x:set){
        //     a[j++]=x;
        // }
        int j=0;
        for(int i=0;i<n;i++){
            if(!set.contains(a[i])){
                set.add(a[i]);
                a[j++]=a[i];
            }
        }
        return a.size();

    } 
    //or use a LinkedHashSet which preserves the insertion order of the elements
}
//T.C => O(NLogN)(to add elements in the set)+O(N) (for the loop used)
//S.C => O(N)
//Hashset always stores unique elements in it and that too in ascending order





//optimal method by 2ptr approach   
public class removeduplicates {
    public static void main(String[] args) {
        int[] arr={1,1,2,2,2,3,3};
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                arr[i+1]=arr[j];
                i++;
            }
        }
        int size=i+1;
        System.out.println("Unique elements:"+size);
        for(i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
//T.C => O(N)