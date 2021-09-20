package question1.driver;

import question1.service.Transaction;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Transaction transaction = new Transaction();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of transaction array\n");
        int transactionSize = scanner.nextInt();
        int[] transactionValues = new int[transactionSize];
        System.out.println("Enter the values of array\n");
        for (int i = 0; i < transactionSize; i++) {
            transactionValues[i] = scanner.nextInt();
        }
        System.out.println("Enter the total no of targets that needs to be achieved\n");
        int totalTargets = scanner.nextInt();
        int loopValue = 1;
        do {
            System.out.println("Enter the value of target\n");
            int targetValue = scanner.nextInt();
            int transactionCount = transaction.getTargetTransactions(transactionValues, targetValue);
            if (transactionCount != -1)
                System.out.println("Target achieved after " + transactionCount + " transactions\n");
            else System.out.println("Given target is not achieved");
            loopValue++;
        } while (loopValue <= totalTargets);
        scanner.close();
    }
}
