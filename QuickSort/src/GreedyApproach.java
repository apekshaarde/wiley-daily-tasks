import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.List;

public class GreedyApproach {

    public static List<Integer> coinsUsed(int[] coins, int amount) {

        Arrays.sort(coins);
        List<Integer> result = new ArrayList<>();

        for (int i = coins.length - 1; i >= 0; i--) {
            while (amount >= coins[i]) {
                amount -= coins[i];
                result.add(coins[i]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] coins = {1, 3, 4};
        int amount = 6;

        List<Integer> coinsUsed = coinsUsed(coins, amount);
        System.out.println("Coins used to make " + amount + ": " + coinsUsed);
    }
}

