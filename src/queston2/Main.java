package queston2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        DenominationProvider denominationProvider = new DenominationProvider();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of currency denominations\n");
        int currencySize = scanner.nextInt();
        System.out.println("Enter the currency denominations value\n");
        int[] currencyValues = new int[currencySize];
        for (int i = 0; i < currencySize; i++) {
            currencyValues[i] = scanner.nextInt();
        }
        System.out.println("Enter the amount you want to pay\n");
        int amount = scanner.nextInt();
        denominationProvider.getPaymentApproach(currencyValues, currencySize, amount);
        scanner.close();
    }
}
