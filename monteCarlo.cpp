/*
 monteCarlo.cpp
Purpose: To create a program that uses the Monte Carlo method to calcualte the area of an ellipse
Name- Lakshmi Deeepthi Gangiredla
*/


#include <iostream>
#include <cmath>
#include <iomanip>
#include <cstdlib>
#include <ctime>
using namespace std;

float getError(float input) {
	return abs(input - 2.22144146907918);
}


float getArea(float n) {

	float accuratehits = 0;

	for (int i = 0; i < n; i++) {
		float xrand = (rand() * 2.000000 / RAND_MAX) - 1; //generating random number between -1 and 1
		float yrand = (rand() * 2.000000 / RAND_MAX) - 1;


		if ((pow(xrand, 2) + (2 * pow(yrand, 2))) <= 1)
		{
			accuratehits++;
			// random point is in the eslipse... increase the count
		}

	}

	float ratioOfHits = accuratehits / n;

	float area = 4 * ratioOfHits; // area of the square times the ratio of hits

	return area;

}



int main() {

	srand(time(0));

	for (float n = 10; n <= 1000000; n *= 10)
	{

		float areaEstimate = getArea(n);


		cout << " n = " << setprecision(0) << fixed << left << setw(12) << n;
		cout << " area = " << setprecision(5) << setw(12) << areaEstimate ;
		cout << setprecision(5) << fixed << " error =  " <<  getError(areaEstimate) << endl;

	}
}