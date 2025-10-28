//----------------------------HCF/GCD---------------

#include <iostream>
using namespace std;

// Function to find HCF using Euclidean Algorithm
int findHCF(int a, int b) {
    while (b != 0) {
        int temp = b;
        b = a % b;  
        a = temp;   
    }
    return a;  
}

int main() {
    int num1, num2;
    cout << "Enter first number: ";
    cin >> num1;
    cout << "Enter second number: ";
    cin >> num2;

    int hcf = findHCF(num1, num2);

    cout << "HCF of " << num1 << " and " << num2 << " is: " << hcf << endl;

    return 0;
}
