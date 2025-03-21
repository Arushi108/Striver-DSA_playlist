
public class stockBuyAndSell{
    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};
        int n=prices.length;
        System.out.print(maxProfit(prices,n));
        
        
    }
    static int maxProfit(int[] prices,int n){
        int mini=Integer.MAX_VALUE;
        int profit=0;
        for(int i=0;i<n;i++){
            mini=Math.min(mini,prices[i]);
            profit=Math.max(profit,prices[i]-mini);
        }
        return profit;

    }
}
// Dynamic programming -> remembering the past  like we did mini and profit
// T.C => O(N) S.C => O(1)