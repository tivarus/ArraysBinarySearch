import java.util.Comparator;
import java.util.List;
import java.util.Collections;
public class Arrays {
    static int binarySearch(byte[] a, byte key) {
        return java.util.Arrays.binarySearch(a, key);
    }

    static int binarySearch(byte[] a, int fromIndex, int toIndex, byte key) {
        return java.util.Arrays.binarySearch(a, fromIndex, toIndex, key);
    }

    static int binarySearch(char[] a, char key) {
        return java.util.Arrays.binarySearch(a, key);
    }

    static int binarySearch(char[] a, int fromIndex, int toIndex, char key) {
        return java.util.Arrays.binarySearch(a, fromIndex, toIndex, key);
    }

    static int binarySearch(double[] a, double key) {
        return java.util.Arrays.binarySearch(a, key);

    }

    static int binarySearch(double[] a, int fromIndex, int toIndex, double key) {
        return java.util.Arrays.binarySearch(a, fromIndex, toIndex, key);
    }

    static int binarySearch(float[] a, float key) {
        return java.util.Arrays.binarySearch(a, key);

    }

    static int binarySearch(float[] a, int fromIndex, int toIndex, float key) {
        return java.util.Arrays.binarySearch(a, fromIndex, toIndex, key);
    }

    static int binarySearch(int[] a, int key) {
        return java.util.Arrays.binarySearch(a, key);
    }

    static int binarySearch(int[] a, int fromIndex, int toIndex, int key) {
        return java.util.Arrays.binarySearch(a, fromIndex, toIndex, key);

    }

    static int binarySearch(long[] a, long key) {
        return java.util.Arrays.binarySearch(a, key);

    }

    static int binarySearch(long[] a, int fromIndex, int toIndex, long key) {
        return java.util.Arrays.binarySearch(a, fromIndex, toIndex, key);

    }

    static int binarySearch(short[] a, short key) {
        return java.util.Arrays.binarySearch(a, key);

    }

    static int binarySearch(short[] a, int fromIndex, int toIndex, short key) {
        return java.util.Arrays.binarySearch(a, fromIndex, toIndex, key);
    }

    static <T> int binarySearch(T[] a, T key, Comparator c) {
        return Arrays.binarySearch(a, key, c);
    }

    static <T> int binarySearch(T[] a, int fromIndex, int toIndex, T key, Comparator c) {
        return Arrays.binarySearch(a, fromIndex, toIndex, key, c);
    }
    public static <T extends Comparable<? super T>> int binarySearch(List<? extends T> list, T key) {
    return Collections.binarySearch(list, key);
    }

    static <T> int binarySearch(List<? extends T> list, T key, Comparator<? super T> c) {
        return Collections.binarySearch(list, key, c);
    }

}
