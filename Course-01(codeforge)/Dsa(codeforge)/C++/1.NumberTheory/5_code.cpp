//----------------------------Number of trailing Zeroes of Factorial n---------------

#include <bits/stdc++.h> // Includes all standard C++ libraries

using namespace std;

int countTrailingZeroes(int n)
{
    int count = 0;

    for (int i = 5; n / i >= 1; i *= 5)
    {
        count += n / i;
    }

    return count;
}

int main()
{

    int n;
    cout << "Enter a number: ";
    cin >> n;

    cout << "Number of trailing zeroes in " << n << "! is " << countTrailingZeroes(n) << endl;

    return 0;
}