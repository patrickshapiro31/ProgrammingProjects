// ClassActivity4.cpp : This file contains the 'main' function. Program execution begins and ends there.


#include "pch.h"
#include <iostream>
#include <iomanip>

using namespace std;
int main() {
	int day = 1;
	double totalpay = 0;
	int maxdays;
	double pay = .20;

	cout << "Enter the number of days you will be working: ";
	cin >> maxdays;
	cout << "\nDay Pay\n";
	cout << "=================\n";

	while (day <= maxdays)
	{
		cout << day << " $" << setprecision(2) << fixed << pay << "\n";

		totalpay += pay;
		pay *= 2;
		day++;
	}

	cout << setprecision(2) << fixed;
	cout << "Your total pay is $" << totalpay << "\n";


	system("pause");
	return 0;
}