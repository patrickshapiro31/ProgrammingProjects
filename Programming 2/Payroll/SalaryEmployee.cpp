#include "SalaryEmployee.h"

SalaryEmployee::SalaryEmployee(std::string first, std::string last, std::string IDNumber, double wage) :
	Employee(first, last, IDNumber), weeklySalary(wage) {}

double SalaryEmployee::calculatePay(double workHours)
{
	return weeklySalary;
}
