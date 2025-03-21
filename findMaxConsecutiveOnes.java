import java.util.*;

public class findMaxConsecutiveOnes{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int maxi=0;
        int count=0;
        for(int i=0;i<n;i++){
            if(a[i]==1){
                count++;
            }
            else{
                maxi=Math.max(count,maxi);
                count=0;
            }
        }
        maxi=Math.max(count,maxi);
        System.out.println("Maximum : "+ maxi);

    }
}