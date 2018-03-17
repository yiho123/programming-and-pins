#include <iostream>
#include <cstdlib>

using namespace std;


struct Node
{
    int key;
    Node *next;
};

void headInsert(Node *&head, int k);
bool isSorted(Node *head);
int n;
int main()
{
    Node *head = NULL;


    cin >> n;
    int inputK;
    for (int i=0 ; i< n ; i++)
    {
        cin >> inputK ;
        headInsert(head, inputK);
    }

    if(isSorted(head)){
        cout << "Yes";
    }else{
        cout << "No";
    }

}

void headInsert(Node *&head, int k)
{
    Node *newNode = new Node;
    newNode -> key = k;
    newNode -> next = head;
    head = newNode;
}

// Please implement your bool isSorted(Node *head) here...
bool isSorted(Node *head)
{
  int i = 0;
    Node *previous;
    Node *current;
    previous = head;
    current = head -> next;

    while (current != NULL)
    {
        if ( (previous -> key) <= (current -> key ))
        {
            i++;
        }

        current = current -> next;
        previous = previous -> next;
    }
    if (i==n-1)
        return true;
    else
        return false;

}

