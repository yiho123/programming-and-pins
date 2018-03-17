Problem Description
( Continue from the question "Leap year or not?")

Below is excerpted from Wikipedia

Friday the 13th, also known as Black Friday, is considered an unlucky day in Western superstition. It occurs when the 13th day of the month in the Gregorian calendar is a Friday.
Given a year, write a program to determine whether this year have any Black Fridays. If yes, output those months with black Friday. Otherwise, output "Lucky".

You can only use the fact that 01-01-2016 is a Friday, and start deducing if any of the 13th day of the months of the input year is a Friday or not.

You may need to write a function to determine if a year is leap year or not to help your deduction. Note that if a year is leap year, then it has 366 days including 29 February as an intercalary day.
It is easy to Google the source code for checking leap year: 
http://www.programiz.com/cpp-programming/examples/leap-year
You may also need the following code so that in the program you can easily know how many days we have in each month (You also need to consider if a year is leap year or not, if so, there are 29 days in February instead of 28.).
const string MONTH[] = {"January","February","March","April","May","June", "July","August","September","October","November","December"}; 
int days_in_month[] = {31,28,31,30,31,30,31,31,30,31,30,31}; 
Input Specification
The year (an integer).

Output Specification
Output the full names of the months of all Black Fridays in the inputted year (in ascending order, one per line); if there are none, output a single string "Lucky".