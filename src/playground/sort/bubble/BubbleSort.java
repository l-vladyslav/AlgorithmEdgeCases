package playground.sort.bubble;

import playground.utils.Utils;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] input = new int[]{8, 1, 4, 7, 2, 3, 9, 0};
        bubbleSort(input);
        System.out.println(Arrays.toString(input));
    }

    public static void bubbleSort(int[] a) {
        for (int out = a.length - 1; out > 1; out--) {
            for (int in = 0; in < out; in++) {
                if (a[in] > a[in+1]) Utils.swap(a, in, in + 1);
            }
        }
    }
}
