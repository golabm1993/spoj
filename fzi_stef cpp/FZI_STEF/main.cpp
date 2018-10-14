#include <iostream>

using namespace std;

int main() {
    int numberOfCities;
    int sumOfProfits = 0;
    int maxProfits = 0;

    cin >> numberOfCities;
    int profits[numberOfCities];

    for (int i = 0; i < numberOfCities; i++) {
        cin >> profits[i];
    }

    for (int j = 0; j < numberOfCities; j++) {
        if(profits[j] >= 0)
            sumOfProfits += profits[j];
        else
        {
            if(sumOfProfits > maxProfits) {
                maxProfits = sumOfProfits;
            }
            sumOfProfits = 0;
        }
    }

    if(maxProfits > sumOfProfits)
    cout << maxProfits;
    else cout << sumOfProfits;

    return 0;
}