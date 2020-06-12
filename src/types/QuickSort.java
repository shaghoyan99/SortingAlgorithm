package types;

//Быстрая сортировка

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] array = {29, 1, 5, 90, 8, 9, 25, 11, 89};
        int endValue = array.length - 1;
        System.out.println(Arrays.toString(array));

        int[] res = sort(array, 0, endValue);
        System.out.println(Arrays.toString(res));

    }

    public static int[] sort(int[] array, int startIndex, int endIndex) {

        if (startIndex >= endIndex) {
            return  array;
        }

        int i = startIndex;
        int j = endIndex;

        int op = i - (i - j) / 2;

        while (i < j) {
            while ((i < op) && (array[i] <= array[op])) i++;
            while ((j > op) && (array[j] >= array[op])) j--;

            if (i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                if (i == op) {
                    op = j;
                } else if (j == op) {
                    op = i;
                }
            }
            sort(array,startIndex,op);
            sort(array,op+1,endIndex);
        }
        return array;
    }
}


