package code401challenges;

public class BinarySearch {

    public static int binarySearch(int[] testArr, int key)
    {

        int start = testArr[0];
        int end = testArr.length -1;


        while (start < end){

           int middle = (start + end) / 2;

           if (testArr[middle] == key){
           System.out.println(middle);
               return middle;
           }
           else if( testArr[middle] < key){
               start = middle + 1;

           }
           else if(testArr[middle] > key){
               end = middle -1;
           }


        }

return -1;


    }




}
