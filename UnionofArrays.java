import java.util.*;

// public class UnionofArrays{
//     public static void main(String[] args) {
//         int arr1[] = {1, 1, 2, 3};
//         int arr2[] = {2, 3, 4, 4, 5, 6};
//         int n=arr1.length;
//         int m=arr2.length;
//         ArrayList<Integer> Union = FindUnion(arr1, arr2, n, m);
//         System.out.println("Union of arr1 and arr2 is ");
//         for (int val: Union){
//             System.out.print(val+" ");
//         }
        
// }
// static ArrayList<Integer> FindUnion(int arr1[], int arr2[], int n, int m) {
//     HashMap <Integer,Integer > freq=new HashMap<>();
//     ArrayList<Integer> Union=new ArrayList<>();
//     for (int i = 0; i < n; i++){
//          freq.put(arr1[i],freq.getOrDefault(arr1[i],0)+1);
//     }
//     for (int i = 0; i < m; i++){
//           freq.put(arr2[i],freq.getOrDefault(arr2[i],0)+1);
//     }
//     for (int it: freq.keySet()){
//         Union.add(it);
//         }
//   return Union;
// }
// }


//Using ordered Set 
// public class UnionofArrays{
//     public static void main(String[] args) {
//         HashSet<Integer> st=new HashSet<>();
//         int arr1[]={1,1,2,3,4,5};
//         int arr2[]={2,3,4,4,5,6};
//         for(int i=0;i<arr1.length;i++){
//             st.add(arr1[i]);
//         }
//         for(int i=0;i<arr2.length;i++){
//             st.add(arr2[i]);
//         }
//         ArrayList<Integer> Union=new ArrayList<>(st);
//         Collections.sort(Union);
//         for(int x:Union){
//             System.out.print(x+" ");
//         }
//         }
//     }



//Optimal solution 
public class UnionofArrays{
    public static void main(String[] args) {
    int arr1[]={1,1,2,3,4,5};
    int arr2[]={2,3,4,4,5,6};
    int n1=arr1.length;
    int n2=arr2.length;
    int i=0;
    int j=0;
    ArrayList<Integer> Union= new ArrayList<>();
    while(i<n1 && j<n2){
        if(arr1[i]<=arr2[j]){
            if(Union.size()==0 || Union.get(Union.size()-1)!=arr1[i]){
                Union.add(arr1[i]);
            }
            i++;
        }
        else{
            if(Union.size()==0 || Union.get(Union.size()-1)!=arr2[j]){
                    Union.add(arr2[j]);
            }
            j++;

        }
    }
    while(j<n2){
        if(Union.size()==0 || Union.get(Union.size()-1)!=arr2[j]){
            Union.add(arr2[j]);

        }
        j++;
    }
    while(i<n1){
        if(Union.size()==0 || Union.get(Union.size()-1)!=arr1[i]){
            Union.add(arr1[i]);
        }
        i++;
    }
    for(int x:Union){
        System.out.print(x+" ");
    }

    }
   
}
// T.C => O(n1+n2) => cuz it is iterating over all the elements in the array
// S.C => O(n1+n2) => worst case if all the elements are unique in both arrays 
// for extra space mention interviewer it is just to return the array and not to solve the problem
    
