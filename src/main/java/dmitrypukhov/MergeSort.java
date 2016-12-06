package dmitrypukhov;

/**
 * Created by dima on 12/6/16.
 */
public class MergeSort {
    /**
     * Sort entry point
     * @param arr
     * @return
     */
    public int[] sort(int[] arr) {
        int[] sorted = sort(arr, 0 ,arr.length);
        return sorted;
    }

    private int[] sort(int[] arr, int start, int end) {

        if(start == end) {
            return new int[0];
        }

        if(start + 1 == end) {
            return new int[]{arr[start]};
        }

        // Split and sort parts
        int middle = (start + end) / 2;
        int[] sortedLeft = sort(arr, start, middle);
        int[] sortedRight = sort(arr, middle, end);

        // Merge 2 sorted parts
        int[] merged = merge(sortedLeft, sortedRight);
        return merged;
    }

    /**
     * Merge 2 sorted arrays
     * @param arr1
     * @param arr2
     * @return
     */
    private int[] merge(int[] arr1, int[] arr2){
        int[] merged = new int[arr1.length + arr2.length];

        // Copy sorted chunks
        int i1 = 0, i2 = 0, i3 = 0;
        while(i1 < arr1.length && i2 < arr2.length) {

            if(arr1[i1] < arr2[i2]) {
                merged[i3++] = arr1[i1++];
            } else {
                merged[i3++] = arr2[i2++];
            }
        }

        // Copy tail
        while(i1 < arr1.length) {
            merged[i3++] = arr1[i1++];
        }
        while(i2 < arr2.length) {
            merged[i3++] = arr2[i2++];
        }

        return merged;

    }
}
