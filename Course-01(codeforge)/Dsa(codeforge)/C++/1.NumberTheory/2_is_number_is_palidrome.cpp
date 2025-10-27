//--------------------------------
#include <bits/stdc++.h>
#define ll long long int
using namespace std;

void logic();

// Function to check if a number is a palindrome
bool isPalindrome(int num)
{
    if (num < 0)
        return false; //--- Negative numbers are not palindromes

    int original = num;
    int reversed = 0;

    while (num != 0)
    {
        int digit = num % 10;

        reversed = reversed * 10 + digit;
        num /= 10;
    }

    return original == reversed;
}

int main()
{

    logic();
    return 0;
}

void logic()
{
    int number;
    cout << "Enter a number: ";
    cin >> number;
    if (isPalindrome(number))
    {
        cout << number << " is a palindrome." << endl;
    }
    else
    {
        cout << number << " is not a palindrome." << endl;
    }
}