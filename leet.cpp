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

        if(list1 == nullptr){
            return list2;
        }
        else if(list2 == nullptr){
            return list1;
        }

        ListNode* e = new ListNode();
        ListNode* head_ptr = e;

        while(list1 != nullptr && list2 != nullptr){
            if(list1->val <= list2->val){
                e->val = list1->val;
                list1 = list1->next;
            }
            else{
                e->val = list2->val;
                list2 = list2->next;
            }


            if(list1 != nullptr && list2 != nullptr){
                ListNode* tmp =  new ListNode();
                e->next = tmp;
                e = tmp;
            }
        }



        while(list1 != nullptr){
            ListNode* tmp =  new ListNode();
            tmp->val = list1->val;
            e->next = tmp;

            e = tmp;
            list1 = list1->next;
        }

        while(list2 != nullptr){
            ListNode* tmp =  new ListNode();
            tmp->val = list2->val;
            e->next = tmp;

            e = tmp;
            list2 = list2->next;
        }


        return head_ptr;
    }
};


int main() {
    Solution sol;
    int number = 100;  // Test input

    ListNode ln1 = ListNode();
    ln1.val = 1;
    ListNode ln2 = ListNode();
    ln2.val = 2;
    ListNode ln3 = ListNode();
    ln3.val = 4;

    ListNode ln4 = ListNode();
    ln4.val = 1;
    ListNode ln5 = ListNode();
    ln5.val = 3;
    ListNode ln6 = ListNode();
    ln6.val = 4;

    ln1.next = &ln2;
    ln2.next = &ln3;

    ln4.next = &ln5;
    ln5.next = &ln6;

    ListNode* tmp = &ln1;
    while (tmp != NULL)
    {
        std::cout<< (*tmp).val << ", ";
        tmp = (*tmp).next;
    }
    std::cout<<std::endl;

    tmp = &ln4;
    while (tmp != NULL)
    {
        std::cout<< (*tmp).val << ", ";
        tmp = (*tmp).next;
    }
    std::cout<<std::endl;
    
    ListNode* result = sol.mergeTwoLists(&ln1, &ln4);

    while (result != NULL)
    {
        std::cout<< result->val << std::endl;
        result = result->next;
    }
    
    
    return 0;
}