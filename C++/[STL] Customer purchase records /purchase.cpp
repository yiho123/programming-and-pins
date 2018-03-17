#include<iostream>
#include<map>
#include<algorithm>
using namespace std;

string command;
string customerA, customerB;
string product;

map < string, map <string, int> > purchases; // Stores all data

void purchase(string customer, string product);
void history(string customer, string product);
bool similar(string customerA, string customerB);
bool suggest(string customer, string product);

int main(){


    while(cin >> command){
        if(command == "PURCHASE"){
            cin >> customerA >> product;
            purchase(customerA, product);

        }else if(command == "HISTORY"){
            cin >> customerA >> product;
            history(customerA, product);

        }else if(command == "SIMILAR"){
            cin >> customerA >> customerB;
            if (similar(customerA,customerB))
                cout << "Yes" << endl;
            else
                cout << "No" << endl;

        }else if (command == "SUGGEST"){
            cin >> customerA >> product;
            if (suggest(customerA,product))
                cout << "Yes" << endl;
            else
                cout << "No" << endl;
        }
    }

}
