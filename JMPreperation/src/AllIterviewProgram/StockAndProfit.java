package AllIterviewProgram;

public class StockAndProfit {
    public static void main(String[] args) {

        int stock[] = {1,2,3,4,5,6};
        int profit= 0;
        for(int i=1;i<stock.length;i++){
            if(stock[i] > stock[i-1]){
                profit += (stock[i] - stock[i-1]);
            }
        }

        System.out.println("Profit is : "+profit);
    }
}
