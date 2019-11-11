// Patrick Shapiro
// 11/7/2019
// HourlyEmployee.cpp


#include "HourlyEmployee.h"

HourlyEmployee::HourlyEmployee(std::string first, std::string last, std::string IDNumber, double wage) :
	Employee(first, last, IDNumber), hourlyWage(wage)
{}

double HourlyEmployee::calculatePay(double workHours)
{
	double pay = workHours * hourlyWage;
	return pay;
}
