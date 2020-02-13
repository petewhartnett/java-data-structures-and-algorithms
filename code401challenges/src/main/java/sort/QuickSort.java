package sort;

public class QuickSort {

// Psuedo Code provided for lab was closely followed
public void quickSort(int[] arr, int left, int right){
    if(left < right) {
        int position = partition(arr, left, right);

        //recursion below will sort both halves similar to merge sort
        quickSort(arr, left, position - 1);
        quickSort(arr, position + 1, right);
    }

}

public int partition(int arr[], int left, int right){

    //starts the pivot on the right side
    int pivot = arr[right];
    int low = (left - 1);

    for(int i = left ; i < right; i++){

        if (arr[i] <= pivot){
            low++;
           swap(arr,i,low);

        }
    }

    swap(arr,right, low + 1);
    return low + 1;

}

    public static void swap (int[] arr, int i, int low){
        int temp = arr[i];
        arr[i] = arr[low];
        arr[low] = temp;

    }




}
