#include <iostream>
using namespace std;

bool leap(int x)
{


    if (x % 4 == 0)
    {
        if (x % 100 == 0)
        {
            if (x % 400 == 0)
               return true;
            else
                return false;
        }
        else
            return true;
    }
    else
        return false;


}

int main()
{
int year;
const string MONTH[] = {"January","February","March","April","May","June", "July","August","September","October","November","December"};

int lp = 0;
int y;
cin >> year;
if(year < 2016) {
for (int i = year; i < 2016; i++)
{
    if (leap(i))
        lp++;
}
y = 2016 - year - lp;
int d;
d = y * 365 + lp * 366;
int a[12];    // week day of the first day of that month

a[0] = (5 - d ) % 7;
    a[1] = (a[0] + 31 ) % 7;
    if (leap(year))
    a[2] = (a[1] + 29) % 7;
    else
        a[2] = (a[1] + 28) % 7;

    a[3] = (a[2] + 31 ) % 7;
    a[4] = (a[3] + 30 ) % 7;
    a[5] = (a[4] + 31 ) % 7;
    a[6] = (a[5] + 30 ) % 7;
    a[7] = (a[6] + 31 ) % 7;
    a[8] = (a[7] + 31 ) % 7;
    a[9] = (a[8] + 30 ) % 7;
    a[10] = (a[9] + 31 ) % 7;
    a[11] = (a[10] + 30 ) % 7;
    int b = 0;

    for(int i = 0; i < 12; i++)
        cout << a[i] << endl;

    for (int i = 0; i < 12; i++)
        {
            if( (a[i] + 12) % 7 == 5 )
                cout << MONTH[i] << endl;
                b++;
        }
        if (b == 0)
            cout << "Lucky";

}

if(year > 2016) {
for (int i = 2016; i < year; i++)
{
    if (leap(i))
        lp++;
}
y = year - 2016 - lp;
int d;
d = y * 365 + lp * 366;
int a[12];    // week day of the first day of that month

a[0] = (5 + d ) % 7;
    a[1] = (a[0] + 31 ) % 7;
    if (leap(year))
    a[2] = (a[1] + 29) % 7;
    else
        a[2] = (a[1] + 28) % 7;

    a[3] = (a[2] + 31 ) % 7;
    a[4] = (a[3] + 30 ) % 7;
    a[5] = (a[4] + 31 ) % 7;
    a[6] = (a[5] + 30 ) % 7;
    a[7] = (a[6] + 31 ) % 7;
    a[8] = (a[7] + 31 ) % 7;
    a[9] = (a[8] + 30 ) % 7;
    a[10] = (a[9] + 31 ) % 7;
    a[11] = (a[10] + 30 ) % 7;
    int b = 0;

    for(int i = 0; i < 12; i++)
        cout << a[i] << endl;

    for (int i = 0; i < 12; i++)
        {
            if( (a[i] + 12) % 7 == 5 )
                cout << MONTH[i] << endl;
                b++;
        }
        if (b == 0)
            cout << "Lucky";

}

if(year == 2016)
    cout << "May";




return 0;
}
