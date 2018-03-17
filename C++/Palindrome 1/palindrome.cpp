#include<iostream>
using namespace std;

int y = 0;

bool is_palindrome(int input[], int numOfSlots);
int main(){
    int n;
    cin >> n;
    int *input = new int[n]; // A dynamic array with n slots
    for (int i = 0 ; i < n ; i++){
        cin >> input[i];
    }

    if (is_palindrome(input,n) == true ){
        cout << "This is a palindrome.";
    }else{
        cout << "This is NOT a palindrome.";
    }


    return 0;
}

// Implement the is_palindrome() function here...

bool is_palindrome(int input[], int numOfSlots)
{

for (int m = 0; m < numOfSlots ; m++)
{
if ( input[m] == input [numOfSlots - m - 1] )

y++;

}

if ( y == numOfSlots )
    return true;
else
    return false;


}


