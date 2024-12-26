
public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2){
        int i = 0;
        int j = 0;
        int[] result = new int[arr1.length + arr2.length];

        while (i < arr1.length) {
            result[i] = arr1[i];
            i++;
        }

        while (j < arr2.length) {
            result[i] = arr2[j];
            i++;
            j++;
        }

        // return null;
        return result;
    }
}
