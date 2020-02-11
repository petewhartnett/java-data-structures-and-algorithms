package InsertionSort;
//https://www.baeldung.com/java-insertion-sort  this was referenced to get a further explanation of the call stack and to check my logic on the Big O



public class InsertionSort {


    public static void insertionSort(int [] arr){

  for(int i = 1; i < arr.length; i++){
      int j = i -1;
      int temp = arr[i];

      while(j >= 0 && arr[j] > temp){
          arr[j + 1] = arr[j];

          j = j -1;

      }
      arr[j + 1] = temp;
  }

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);


        }


    }

}
