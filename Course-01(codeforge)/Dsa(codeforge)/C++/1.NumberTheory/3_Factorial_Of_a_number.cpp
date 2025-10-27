#include <bits/stdc++.h>
#define ll long long int
using namespace std;

void logic();

int main()
{

    logic();
}

//* Iterative solution
void logic()
{
    ll n, res = 1;
    cin >> n;

    while (n > 0)
    {

        res = res * n;
        n--;
    }
    cout << res << "\n";
}
