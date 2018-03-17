Overview: In this exercise, you will enhance class MyDate that you used in Lab 6a to allow two MyDate objects to be compared. The method of comparison can then be used to arrange a list of dates in order.

 

Enhancing class MyDate

 

Without declaring any new instance variables, develop the following methods for comparing two MyDate objects:

 

1.      Method equals that overrides the default equals. This method returns true if the years, months, and days of the two objects being compared are the same.

 

2.      Method public int compareTo(MyDate date). This method:

 

·         Returns a negative integer if the object calling this method is earlier in time than the object in the parameter. There is no restriction on the exact value of the negative integer.

·         Returns zero if the dates of the two objects are the same in time (same year, same month, and same days).

·         Returns a positive integer if the object calling this method is later in time than the object in the parameter. There is no restriction on the exact value of the positive integer.

 

 

class SortingMyDate

 

This class provides two class methods to arrange an array of dates into order into an arraylist. Both methods accept two parameters: MyDate[] arr and ArrayList<MyDate> list. arr contains the dates to be arranged. Note that this array may be empty. The methods put the MyDate objects in list according to the order required, either ascending or descending. You can assume list must be empty when the method is called. arr should not be modified in the method.

 

To arrange the dates in order, put the first element (if there is any) of arr in list. Then, for each other element date in arr, use the compareTo method to compare with an item in list from the beginning and identify the right position to put date in list. You should always maintain list in the order, either ascending or descending, you need.

 

Method public static void ascendSort(MyDate[] arr, ArrayList<MyDate> list) arranges dates from earlier ones to later ones.

 

Method public static void descendSort(MyDate[] arr, ArrayList<MyDate> list) arranges dates from later ones to earlier ones.

 

Driver program MyDateDriver.java has been provided for testing your implementation. The correct output is as follows:

 

Test the correctness of method equals...

date1.equals(date2) returns true

 

Dates in ascending order:

[29/8/1842, 18/10/1860, 9/6/1898, 16/3/1910, 10/10/1911, 15/8/1945, 1/9/1962, 1/7/1997, 1/4/2003, 18/8/2011]

 

Dates in descending order:

[18/8/2011, 1/4/2003, 1/7/1997, 1/9/1962, 15/8/1945, 10/10/1911, 16/3/1910, 9/6/1898, 18/10/1860, 29/8/1842]