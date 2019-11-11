// Patrick Shapiro
// 11/7/2019
// SalaryEmployee.h

#ifndef _SALARYEMPLOYEE_H_
#define _SALARYEMPLOYEE_H_

#include <string>
#include "Employee.h"

// HourlyEmployee class
class SalaryEmployee : public Employee
{
private:
	double weeklySalary; // payrate

public:
	// Constructor
	SalaryEmployee(std::string first, std::string last, std::string IDNumber, double wage);

	double calculatePay(double workHours) override;

};

#endif // !_SALARYEMPLOYEE_H_
