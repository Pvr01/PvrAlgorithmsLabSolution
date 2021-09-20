package queston2;

import java.util.LinkedHashMap;
import java.util.Map;

public class DenominationProvider {

    public void getPaymentApproach(int[] values, int size, int amount) {

        sort(values, 0, size - 1);
        Map<Integer, Integer> map = new LinkedHashMap<>();
        if (amount == 0) {
            System.out.println("It is a Invalid Amount");
            return;
        }
        try {
            for (int i = 0; i <= size; i++) {
                if (amount >= values[i]) {
                   int count = amount / values[i];
                    map.put(values[i], count);
                    amount = amount % values[i];
                }
            }
        } catch (Exception exception) {
            exception.getLocalizedMessage();
            return;
        }

        System.out.println("Your payment approach in order to give min no of notes will be");
        for (Map.Entry<Integer, Integer> currency : map.entrySet())
            System.out.println(currency.getKey() + ":" + currency.getValue());
    }

    private void sort(int[] notes, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            sort(notes, left, mid);
            sort(notes, mid + 1, right);
            merge(notes, left, mid, right);
        }
    }

    private void merge(int[] notes, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        for (int i = 0; i < n1; i++)
            leftArray[i] = notes[left + i];

        for (int i = 0; i < n2; i++)
            rightArray[i] = notes[mid + 1 + i];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (leftArray[i] >= rightArray[j]) {
                notes[k] = leftArray[i];
                i++;
            } else {
                notes[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            notes[k] = leftArray[i];
            i++;
            k++;
        }
    }
}
