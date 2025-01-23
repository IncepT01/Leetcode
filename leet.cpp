#include<iostream>
#include <list>

class Solution {
public:
    bool isPalindrome(int x) {
        std::list<int> nums;

        while(x > 0){
            int rem = x % 10;
            nums.push_back(rem);
            x = x - rem;
            x = x/10;
        }

        int n = nums.size();


        for(int num : nums){
            std::cout<<num<<" ";
        }


        if(n > 0){
            std::list<int>::iterator it = nums.begin();
            std::list<int>::reverse_iterator bit = nums.rbegin();



            for(int i = 0; i < n/2; i++){

                //std::cout<<*it<<std::endl;
                //std::cout<<*bit<<std::endl;
                if(*it != *bit){
                    return false;
                }

                ++it;
                ++bit;
            }

            return true;
        }
        

        return false;
    }

};


int main() {
    Solution sol;
    int number = 100;  // Test input
    bool result = sol.isPalindrome(number);
    std::cout << "Is the number " << number << " a palindrome? " << (result ? "Yes" : "No") << std::endl;
    
    return 0;
}