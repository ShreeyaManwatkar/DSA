#include <iostream>
#include <vector>
#include <climits>
using namespace std;

int MaxSum(const vector<int> nums){
    int maxSum = INT_MIN;
    int currSum = 0;

    for (int val : nums) {
        currSum += val;
        maxSum= max(currSum, maxSum);

        if(currSum<0){
            currSum=0;
        }
    }
 return maxSum;
}

int main() {
    vector<int> arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    
    int maxSum = MaxSum(arr);
    cout << "Maximum subarray sum is: " << maxSum << endl;

    return 0;
}
