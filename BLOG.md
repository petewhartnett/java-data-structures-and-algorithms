# SORTING BLOG




## Insertion Sort - 

### PSUEDO CODE 

The Psuedo Code was provided by codefellows 401d7 repo 
SelectionSort(int []arr)   
    DECLARE n <-- arr.Length; 
    FOR i = 0; i to n - 1  
        DECLARE min <-- i; 
        FOR j = i + 1 to n 
            if (arr[j] < arr[min]) 
                min <-- j; 
 
        DECLARE temp <-- arr[min]; 
        arr[min] <-- arr[i]; 
        arr[i] <-- temp; 
        
### PASS ONE
 
 On the first Pass the algorithim will evaluate the 1 and 7 and the 1 will be found smaller and moved to the left.
 
### PASS TWO 
 
 On Pass two the 4 and the 7 will be evaluated and becuase 4 is less then 7 they will both remain in place.
 
### PASS THREE 
 
 The Third Pass demonstrates the true benefit of insertion sort, the three will be evaluated and is less then 7 so it will be pushed
 left one, then 3 will be evaluated with 4 and found smaller it will move left again. This will complete the algorithim leaving the array
 in a sorted form to return to the user. 
 
 
## EFFICIENCY
This will have an efficiency of 0 (n2) O of n squared. It is this efficiency because there are a for loop and a while loop being used, so it
will grow exponentially based on the size of the array. 
