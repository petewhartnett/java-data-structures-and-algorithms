package code401challenges;

public class ArrayReverse {


        public static int[] ReversedArray ( int[] array){
            int[] arr = array;
            int i = 0;
            int j = arr.length - 1;
            int temp = 0;

            while (i < j) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            return arr;
        }


}