#include<iostream>
using namespace std;


bool aw (string x, string y)
{
    if (x == "paper" && y == "rock")
        return true;
    else if (x == "scissors" && y == "paper")
        return true;
    if ( x == "rock" && y == "scissors")
        return true;
}


int main()
{
int n;
cin >> n;


int ma = 0;
int mb = 0;

string *a = new string[n];
string *b = new string[n];

for ( int i = 0; i < n; i++)
{
    cin >> a[i];
}
for (int u = 0; u < n ; u++)
{
     cin >> b[u];
}
for (int j = 0; j < n; j++)
{

    if (b[j] != a[j])
      {
          if (aw (a[j],b[j]) == true)
            ma++;
          else
            mb++;
      }

}


cout << ma << " " << mb;

return 0;


}
