Problem specification
Consider the following struct Node in a Linked List.
struct Node {
  int key;
  Node *next;
};
An empty linked list is defined in the main function as follows:
Node *head = NULL;
Two functions are already given for us

A function void headInsert(Node *&head, int k); that inserts a new node with key equals to k ,  to the Linked list pointed by the head pointer head.
void headInsert(Node *&head, int k)
{
    Node *newNode = new Node;
    newNode -> key = k;
    newNode -> next = head;
    head = newNode;
}
Write a function isSorted() to that returns true if the linked list is sorted in ascending order according to key from the first node to the last node. 
bool isSorted(Node *head);
Skeleton program
Please download the skeleton program here.

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

int main()
{
    Node *head = NULL;

    int n;
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



Input specification
The program should read

An integer n, followed by
n keys  (as stored in the variables inputK in the main function of the skeleton program)
Each key value pair read will then call the function headInsert(head, inputK); to insert a new node with key as inputK as the first node in the Linked List pointed to by the head pointer head.

Output specification

The last 3 lines of the main function calls isSorted in this way: 

    if(isSorted(head)){
        cout << "Yes";
    }else{
        cout << "No";
    }
It will display "Yes" if the Linked list is sorted in ascending order, false otherwise.