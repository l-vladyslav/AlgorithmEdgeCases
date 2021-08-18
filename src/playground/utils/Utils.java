package playground.utils;

public class Utils {
    public static void swap(int[] a, int previous, int next) {
        int temp = a[previous];
        a[previous] = a[next];
        a[next] = temp;
    }
}
