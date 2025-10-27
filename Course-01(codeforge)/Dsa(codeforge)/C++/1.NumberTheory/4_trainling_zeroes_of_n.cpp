#include <iostream>
using namespace std;

int countTrailingZeroes(int n) {
    int count = 0;
    while (n >= 5) {
        n /= 5;
        count += n;
    }
    return count;
}

int main() {
    int n;
   
    cin >> n;
    cout << "Trailing zeroes in " << n << "! = " << countTrailingZeroes(n);
    return 0;
}
