package types;

//Сортировка пузырьком

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] array = {29, 1, 5, 90, 8, 9, 25, 11, 89};
        int size = array.length;
        int temp;
        System.out.println(Arrays.toString(array));

        int count;
        do {
            count = 0;
            for (int i = 0; i < size - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    count++;
                }
            }
        } while (count > 0);

        System.out.println(Arrays.toString(array));
    }
}
