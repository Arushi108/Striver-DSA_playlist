//     public static void main(String args[]){
//         int a[]={3,4,10,6,8};
//         int n=a.length;
//         System.out.println("Second largest: " + findsecondlargest(a,n));


//     }
//     static int findsecondlargest(int arr[],int n){
//         if(n<2){
//             return -1;
//         }
//         Arrays.sort(arr);
//         for(int i=n-2;i>=0;i--){
//             if(arr[i]!=arr[n-1]){
//                 return arr[i];
//             }
//         }
//         return -1;

//     }
   
// }

public class secondlargest{
    public static void main(String args[]){
       int a[]={1,10,9,18,100};
       int n=a.length;
       System.out.println("Second largest: "+findsecondlargest(a,n));
       System.out.println("Second Smallest: "+findsecondsmallest(a,n));
    }
    static int findsecondlargest(int arr[],int n){
        int largest=arr[0];
        int slargest=-1;
        for(int i=1;i<n;i++){
            if(arr[i]>largest){
                slargest=largest;
                largest=arr[i];
            }
            else if (arr[i]<largest && arr[i]>slargest){
                slargest=arr[i];
            }
        }
        return slargest;

    }
    static int findsecondsmallest(int arr[],int n){
        int smallest=arr[0];
        int ssmallest=Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
            else if(arr[i]!=smallest && arr[i]<ssmallest){
                ssmallest=arr[i];

            }
        }
        return ssmallest;

    }
}
