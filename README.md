# java-data-structures-and-algorithms

# Reverse an Array
<!-- Short summary or background information -->
For this algorithim we took in an array of integers and reversed their order. 

## Challenge
<!-- Description of the challenge -->
The challenge was to reverse the order of the integers that were in the array

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
For this task we chose to use a while loop that had a int i set to 0 or the beginning, and int j set to the end which we used the length of the array for. We then used a temperary int to store the value of the array at position i then assigning position i to the number at the array at position j. Position j is then given the value of the temp which is the array at position i. Then position i is advanced one place and j is decresed one place until the whole array is sorted. 


while loop efficiency is 0 (n^2)


## Solution
<!-- Embedded whiteboard image -->
![](assets/algo1.JPG)





# InsertShift - Code challenge 2
<!-- Short summary or background information -->
For this algorithim we took an array and inserted a value into the middle index of the array

## Challenge
<!-- Description of the challenge -->
The challenge was to get the value inserted into the middle of the array.

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
For this we chose to create a new array that is the length of the old array + 1. We then start inserting the values of the old array into the new array with a for loop until if reaching the middle index. At the middle index the value is inserted into the array, then the next iteration the rest of the array is inputed. 


while loop efficiency is 0 (n^2)


## Solution
<!-- Embedded whiteboard image -->
![](assets/codechallenge2.JPG)



# Binary Search - Code challenge 3
<!-- Short summary or background information -->
For this algorithim we took an array of sorted values and a key, and looked up the key using the binary search method. 

## Challenge
<!-- Description of the challenge -->
The challenge was to find the key efficiently using the binary search algorithim.

## Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
For this we decided to first set the an integer to the start of the array, and one to the end. We then found the middle and created a variable for it as well. We then created a while loop that would continue until the start was not less then the end. Then in the while loop we start by checking the middle position for the key, if not there we cut off half of the algorithim depending on if the key is less or greater then the middle. Then the start or end point is adjusted to the middle depending on the less or greater operation, and the middle is recalculated. The while process begins again on each iteration until the key is found. 


while loop efficiency is 0 (nlogn)


## Solution
<!-- Embedded whiteboard image -->
![](assets/codechallenge3.JPG)