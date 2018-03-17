Description
There are N points in a 2D plane. 

You can place any square on the plane as long as the square is rectilinearily oriented, i.e., its sides are paralleled to the x and y axis. 

What is the minimum area of a square that can cover at least two points in the plane?

Input specification:
The first line contains one integer N (2 <= N <= 100) representing the number of points in the plane.

The next N lines are the x and y coordinates of the points. The x and y coordinate values are separated by a space. 

It is guaranteed that x and y are integers and in the range of [-10000, 10000].

You can assume that the points are unique.

Output specification:
An integer represents the minimum area of a square that can cover at least two points in the plane.

Sample Input 1
3

0 0

2 1

-2 -4

Sample Output 1
4

Explanation:
A possible square for Sample 1 is with the lower left corner and upper right corner locating at (0,0) and (2,2), which can cover points (0,0) and (2,1). The area of this square is 4.



Sample Input 2
3

0 0

2 2

3 3

Sample Output 2
1

Explanation:
A possible square for Sample 2 is with the lower left corner and upper right corner locating at (2,2) and (3,3), which can cover points (2,2) and (3,3). The area of this square is 1.