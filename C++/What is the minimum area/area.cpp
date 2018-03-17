#include<iostream>
#include<cmath>
using namespace std;

int Calculate (int **V,int i, int j)
{
    int A;
    if(abs(V[i][0]-V[j][0]) > abs(V[i][1] - V[j][1]))
    {
      A = pow(V[i][0]-V[j][0],2);
        return A ;  }

    else
    {
        A = pow(V[i][1] - V[j][1],2) ;
        return A;    }
}

int main()
{

int N;
cin >> N;




int **V;
	// allocation
	V = new int*[N];
	for(int i = 0; i < N; i++)
		V[i] = new int[2];




for (int i = 0; i < N; i++)
{
    for(int j = 0; j < 2; j++)
    {
        cin >> V[i][j];
    }
}


int **A;
A = new int *[N];
for (int i = 0; i < N; i++)
{
		A[i] = new int[N];
}

for (int i = 0; i < N; i++)
{
    for (int j = 0; j < N; j++)
    {
        A[i][j] = Calculate(V,i,j);
    }
}



int *small = new int[N-1];
small[0] = A[0][1];
for (int i = 1; i < N; i++)
{
    small[i] = A[i][i-1];
}



for (int i = 0; i< N; i++)
{
    for(int j = 0; j < N ; j++)
    {
        if (A[i][j] <= small[i] && A[i][j] != 0)
            small[i] = A[i][j];
    }
}

int smallest = small[0];
for (int i = 0; i < N-1; i++)
{
   if (small[i+1] <= smallest)
    smallest = small[i+1];
}




cout << smallest;

return 0;
}
