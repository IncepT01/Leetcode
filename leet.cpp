#include<iostream>
#include <list>


 //* Definition for singly-linked list.
struct ListNode {
    int val;
    ListNode *next;
    ListNode() : val(0), next(nullptr) {}
    ListNode(int x) : val(x), next(nullptr) {}
    ListNode(int x, ListNode *next) : val(x), next(next) {}
};

class Solution {
public:
    ListNode* mergeTwoLists(ListNode* list1, ListNode* list2) {
        
    }
};


int main() {
    Solution sol;
    int number = 100;  // Test input

    ListNode ln1 = ListNode();
    ln1.val = 1;
    ListNode ln2 = ListNode();
    ln2.val = 4;
    ListNode ln3 = ListNode();
    ln3.val = 7;

    ListNode ln4 = ListNode();
    ln4.val = 2;
    ListNode ln5 = ListNode();
    ln5.val = 10;
    ListNode ln6 = ListNode();
    ln6.val = 11;

    ln1.next = &ln2;
    ln2.next = &ln3;

    ln4.next = &ln5;
    ln5.next = &ln6;
    
    bool result = sol.mergeTwoLists(&ln1, &ln4);

    ListNode* tmp = &ln1;
    while (tmp != NULL)
    {
        std::cout<< (*tmp).val << std::endl;
        tmp = (*tmp).next;
    }
    
    
    return 0;
}