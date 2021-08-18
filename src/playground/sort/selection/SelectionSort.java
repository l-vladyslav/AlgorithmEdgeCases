package playground.sort.selection;

import playground.utils.Utils;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] input = new int[]{8, 1, 4, 7, 2, 3, 9, 0};
        selectionSort(input);
        System.out.println(Arrays.toString(input));
    }

    public static void selectionSort(int[] a) {
        int out, in, min;
        for (out = 0; out < a.length - 1; out++) {
            min = out;
            for (in = out + 1; in < a.length; in++) {
                if (a[in] < a[min]) min = in;
            }
            Utils.swap(a, out, min);
        }
    }
}
