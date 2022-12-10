# shell-sort-heap-sort-


comapare shell sort and heap sort 


 Write a HeapSort and a Shell Sort. They should both be recursive or both be iterative, so that the 
overhead of recursion will not be a factor in your comparisons. In this case, iteration is recommended. Be 
sure to justify your choice. Also, consider how your code would have differed if you had made the 
other choice.  
 
The strategy behind a Shell Sort is to create a more nearly optimal environment for a simple, relatively 
inefficient sort technique, namely Simple Insertion Sort. This optimal environment allows the simple 
strategy to be efficient. Use the following sets of increments  
 
1, 4, 13, 40, 121, 364, 1093, 3280, 9841, 29524 (Knuth’s sequence)  
1, 5, 17, 53, 149, 373, 1123, 3371, 10111, 30341  
1, 10, 30, 60, 120, 360, 1080, 3240, 9720, 29160  
One or more sets of increments of your choice. 
 
 
 You will have four different Shell sorts to run. 
 
 
Heap Sort is a practical sort to know and is based on the concept of a heap. It has two phases: Build the 
heap and extract the elements in sorted order from the heap. Altogether, you will have five sorts: 1 Heap 
and 4 Shell.  
 
Create input files of four sizes: 25,50, 200, 500 integers. For each size file, make three versions. On the 
first, use a randomly ordered data set. On the second, use the integers in reverse order. On the third, use 
the integers in normal ascending order. (You may use a random number generator or shuffle function to 
create the randomly ordered file. It is important to avoid too many duplicates. Keep them to about 1%). 
 
 Your program should access the system clock to get some time values for the different runs. The call to 
the clock should be placed as close as possible to the beginning and the end of each sort. If other code is 
included, it may have a large, fixed, cost, which would tend to drown out the differences between the 
runs, if any. Why take a chance! If you get too many zero time data values or any negative time 
values then you must fix the problem. One way to do this is to use larger files than those specified. 
Another solution is to perform the sorting in a loop, N times, and calculates an average value. You would 
need to be careful to start over with unsorted data, each time through the loop.  
 
Turn in a analysis comparing the two sorts and their performance. Be sure to comment on the relative 
runtimes of the various runs, the effect of the order of the data, the effect of different size files, and the 
effect of different increment sizes for the Shell Sort. Which factor has the most effect on the efficiency? 
Be sure to consider both time and space efficiency. Be sure to justify your data structures. As time 
permits consider implementing a Straight Insertion Sort to compare with Shell Sort. Also, consider files of 
size 10,000 or additional random files - perhaps with 15-20% duplicates. Your write-up must include a 
table of the times obtained.  
 
The source code you turn in needs to print out the sorted values 
