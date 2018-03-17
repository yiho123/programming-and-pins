#include<iostream>
using namespace std;
bool leapyear (int y);
int main()
{
int x;

while (1==1)
{

cout << "Enter a year (or negative number to quit): ";
cin >> x;
if ( x < 0 )
{
cout << "Bye!" << endl;
break;  }

else
if (leapyear (x) == true )
cout << x <<" is a leap year." << endl;
else if (leapyear(x) == false)
    cout << x <<" is not a leap year." << endl;
}

return 0;



}

bool leapyear (int y)
{
    if ( y % 4 == 0 && y % 100 != 0)
        return true;
    else if ( y % 400 == 0)
    return true;

    else
        return false;
}


