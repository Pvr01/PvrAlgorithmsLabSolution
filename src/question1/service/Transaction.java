package question1.service;

public class Transaction {

    public int getTargetTransactions(int[] values, int target) {
        int countSum = 0;
        for (int i = 0; i <= values.length - 1; i++) {
            countSum += values[i];
            if (target <= countSum) return i + 1;
        }
        return -1;
    }
}
