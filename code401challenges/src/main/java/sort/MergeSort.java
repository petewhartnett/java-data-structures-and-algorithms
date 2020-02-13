package sort;

public class MergeSort {


    public static int[] mergeSort(int [] arr){

        int n = arr.length;

        int middle = n/2;

        int[] left = new int[middle];
        int[] right = new int[n - middle];

        for(int i =0; i < middle; i++){
            left[i] = arr[i];
        }
        for(int j = 0; j < n - middle; j++){
            right[j] = arr[j];
        }

        mergeSort(left);
        mergeSort(right);

     return  merge(left, right, arr);

    }

    public static int[] merge(int[] left, int[] right, int[] arr){

        int i = 0;
        int j = 0;
        int k = 0;


        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;

            }
            k++;
        }
            if (i == left.length) {
                arr[k] = left[i];

            }
            else{
                arr[k] = right[i];
            }


        return arr;

    }

}
