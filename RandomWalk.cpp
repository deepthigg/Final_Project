/*
randomWalk.cpp
Purpose: To create a program that outputs the random movements of a robot on a [−5, 5] × [−5, 5] grid. The program will indicate when the robot hits a boundary or returns back to the origin. 
Name- Lakshmi Deeepthi Gangiredla

*/

#include <iostream>
#include <cmath>
#include <iomanip>
#include <cstdlib>
#include <ctime>
using namespace std;

int x = 0;
int y = 0;


void makeMove(int move)
{

	if (move == 1) //move up
	{
		y++;
		cout << "Up   " << fixed << setw(8) << "(" << x << " , " << y << ")" << endl;
	}
	else if (move == 2)//move down
	{
		y--;
		cout << "Down " << fixed << setw(8) << "(" << x << " , " << y << ")" << endl;

	}
	else if (move == 3) //move left
	{
		x--;
		cout << "Left " << fixed << setw(8) << "(" << x << " , " << y << ")" << endl;
	}
	else { //move right

		x++;
		cout << "Right" << fixed << setw(8) << "(" << x << " , " << y << ")" << endl;


	}


}

int main()
{
	srand(time(0));

	while (1)
	{

		int move = rand() % 4 + 1;


		makeMove(move);
		if (y == 5 || y == -5 || x == 5 || x == -5)
		{
			cout << "Hit the boundary!" <<endl;
			break;
		}

		if (x == 0 && y == 0)
		{
			cout << "Back to the origin!"<< endl;
			break;
		}

	}

	return 0;
}

