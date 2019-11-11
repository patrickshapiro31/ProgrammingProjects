// Patrick Shapiro
// 11/7/2019
// HourlyEmployee.h

#ifndef _HOURLYEMPLOYEE_H_
#define _HOURLYEMPLOYEE_H_

#include <string>
#include "Employee.h"

// HourlyEmployee class
class HourlyEmployee : public Employee
{
private:
	double hourlyWage;	// payrate

public:
	// Constructor
	HourlyEmployee(std::string first, std::string last, std::string IDNumber, double wage);

	double calculatePay(double workHours) override;
};

#endif // !_HOURLYEMPLOYEE_H_


