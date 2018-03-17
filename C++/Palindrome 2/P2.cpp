#include<iostream>

using namespace std;
int main()


{

string x;
getline(cin,x);

int j = 0;

int i = 0;
for ( i ; i < x.length() ; i++)
{

    if (isspace(x[i] ) || ispunct(x[i]))
    {
        x.erase(i,1);

        i = 0;
    }



}

int a = 0;




for (int w = 0; w < x.length() ; w++)
{
    if ( toupper(x[w]) == toupper ( x[x.length() - 1 -w])  )
        a++;

}



if ( a == x.length() )
cout << "Yes" << endl;
else
    cout << "No" << endl;



return 0;


}
