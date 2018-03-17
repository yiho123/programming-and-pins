Overview: In this exercise, you will define static instance variable and static method in a class called Check that represents bank checks. Given a list of checks, you have to develop a simple financial report of the checks.

 

class Check

 

Develop a class that represents bank checks. Each check has the following attributes:

1.      Payee: name of the recipient of the check

2.      Check Number: The serial number of the check. The first check should be numbered as 1001, the second one is 1002, and so on.

3.      Amount: the cash amount of this check.

4.      Date: the date of the check was issued. Class MyDate has been provided for this attribute.

 

You should also define one static variable in class Check so that an appropriate check number is assigned to a check when it is instantiated.

 

Define constructor public Check(String name, int amt, MyDate date) that initiates the payee, amount of the check, and date according to the parameters. An appropriate check number should be assigned inside this constructor.

 

You can define other methods as needed.

 

class CheckSummary

 

Develop method printSummary(ArrayList<Check>) that prints out a summary of the list of checks passed in the parameter. You have to use appropriate modifiers and return type for this method. You should first study how printSummary is invoked in the driver program CheckDriver.java. The summary of checks consists of the following:

 

1.      The details of each check

The check number, payee, amount of the check, and date of the check is printed out line by line for each check.

 

2.      A statement showing the number of the next check

 

3.      A financial summary of the total amount of checks in each month that at least a check was issued. You can assume the checks in the list are arranged by number and by date. That is, a check with larger check number must be issued at a later date than a check with smaller check number.

 

4.      The total amount of all the checks

 

The following is the output of the CheckDriver.java provided. [Different sections are highlighted using different colors.]

 

Check No: 1001, Payee: Peter, Amount: 100, Date: 11/8/2017

Check No: 1002, Payee: Mary, Amount: 200, Date: 17/8/2017

Check No: 1003, Payee: John, Amount: 600, Date: 1/9/2017

Check No: 1004, Payee: John, Amount: 400, Date: 12/10/2017

Check No: 1005, Payee: Mary, Amount: 700, Date: 11/11/2017

Check No: 1006, Payee: Betty, Amount: 100, Date: 20/12/2017

Check No: 1007, Payee: Alice, Amount: 300, Date: 5/1/2018

Check No: 1008, Payee: Peter, Amount: 200, Date: 31/1/2018

Check No: 1009, Payee: Alice, Amount: 300, Date: 22/3/2018

The next check number is 1010

The total amount of the checks issued in 2017/8 is 300

The total amount of the checks issued in 2017/9 is 600

The total amount of the checks issued in 2017/10 is 400

The total amount of the checks issued in 2017/11 is 700

The total amount of the checks issued in 2017/12 is 100

The total amount of the checks issued in 2018/1 is 500

The total amount of the checks issued in 2018/3 is 300

The total amount is 2900