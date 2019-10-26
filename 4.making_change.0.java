// java.util.* and java.util.streams.* have been imported for this problem.
// You don't need any other imports.

public static int makeChange(int[] coins, int amount) {
    if (amount < 0) return 0;
    if (amount == 0) return 1;
    int[] ways = new int[amount + 1];
    for (int i=0; i<=amount; i++) {
        ways[i] = 0;
    }
    ways[0] = 1;
    for (int coin=coins.length-1; coin>=0; coin--) {
        int coinVal = coins[coin];
        for (int currAmount=coinVal; currAmount<=amount; currAmount+=1) {
            ways[currAmount] += ways[currAmount-coinVal];
        }
    }
    return ways[amount];
}
