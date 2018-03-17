Overview: In this exercise, you will define an interface for “adding two objects.” You will also enhance class Fraction and class MyDate to implement some interfaces.

 

Interface Addable

 

There is a single abstract method in this interface to represent the behavior that the object of this class can be added with another object of this class. The method is:

 

Addable add(Addable obj);

 

Define interface Addable.

 

 

Enhancing classes

 

Modify class MyDate that you developed in Lab 6b so that MyDate implements Comparable. Later date is “larger.”

 

Enhance class Fraction that you developed in Lab 2a to implement both Comparable and Addable. Two fractions are the same if their numerical values are the same. Adding two fractions together results in another fraction.

 

class FindLargest

 

This class has a single method public static Comparable findLargest(Comparable[] arr) that returns the largest element in arr. If arr is empty, the method returns null. Develop this class.