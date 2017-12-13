/*
Numbers.cpp
Purpose: To create a program that outputs the largest number. ascending order, and various permuations of 3 inputed numbers.
*/


#include <iostream>
using namespace std;

int a;
int b;
int c;
int option;



void displayMenu() {
	cout << endl;
	cout << "================== MENU ====================" << endl;
	cout << " 1. Output the largest" << endl;
	cout << " 2. Get the next permuatation" << endl;
	cout << " 3. Sort in ascending order" << endl;
	cout << "Enter your choice(1 - 3), Q to quit : ";

}

void largest(int a, int b, int c)
{


	if (a > b)
	{
		if (a > c) {
			cout << endl;
			cout << "The largest number among the three is : " << a << endl;
		}
		else {
			cout << endl;
			cout << "The largest number among the three is :" << c << endl;
		}
	}
	else if (b > a)
	{
		if (b > c) {
			cout << endl;
			cout << "The largest number among the three is : " << b << endl;

		}
		else {
			cout << endl;
			cout << "The largest number among the three is : " << c << endl;
		}

	}
}


void myPermutation(int& a, int& b, int& c) {
	int first;
	int second;
	int third;

	first = a;
	second = b;
	third = c;


	swap(a, c);
	first = a;
	swap(b, c);
	third = c;
	second = b;


	cout << endl;
	cout << "After one permutation: " << first << " " << second << " " << third << endl;



}


void mySort(int& a, int& b, int& c) {
	int first;
	int second;
	int third;

	if (a > c && a > b)
	{
		third = a;
		if (b > c)
		{
			second = b;
			first = c;
		}
		else
		{
			second = c;
			first = b;
		}
	}
	if (b > a && b > c)
	{
		third = b;
		if (a > c)
		{
			second = a;
			first = c;
		}
		else
		{
			second = c;
			first = a;
		}
	}
	if (c > a && c > b)
	{
		third = c;
		if (a > b)
		{
			second = a;
			first = b;
		}
		else
		{
			second = b;
			first = a;
		}
	}
	cout << endl;

	cout << "After sorting: " << first << " " << second << " " << third << endl;

}

int main()
{


	cout << "Enter your three integer numbers :" << endl;
	cin >> a;
	cin >> b;
	cin >> c;


	while (!cin.fail())
	{
		displayMenu();

		cin >> option;

		if (cin.fail()) {
			cout << endl;
			cout << "Exit the Menu   " << endl;
			break;
		}
		else if (option == 1) {

			largest(a, b, c);

		}

		else if (option == 2) {
			myPermutation(a, b, c);

		}

		else if (option == 3) {

			mySort(a, b, c);
		}

	}


	return 0;
}