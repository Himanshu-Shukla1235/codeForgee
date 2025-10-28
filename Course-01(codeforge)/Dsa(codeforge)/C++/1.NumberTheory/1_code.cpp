#include <bits/stdc++.h>
#define ll long long int
using namespace std;

void logic(); // logic function

int main()
{

    logic();
    return 0;
}

void logic()
{
    int number;
    cin >> number;

    int res = 0;

    while (number > 0)
    {
        res++;
        number /= 10;
    }

    cout << res << "\n";
}