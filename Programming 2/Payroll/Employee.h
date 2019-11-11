// Patrick Shapiro
// 11/7/2019
// Employee.h

#ifndef _EMPLOYEE_H_
#define _EMPLOYEE_H_

#include <string>

class Employee // An abstract class meant to be inherited
{
private:
	std::string firstName;		// First Name
	std::string lastName;	// Last name
	std::string ID; //Employee ID
	double hoursWorked; //How long the employee worked

public:
	// Constructor
	Employee(std::string first, std::string last, std::string IDNumber);

	// Getters
	const std::string getFirstName();
	const std::string getLastName();
	const std::string getEmpID();

	const bool operator == (Employee& emp1);

	// Pure virtual function
	virtual double calculatePay(double hoursWorked) = 0;
};

#endif // !_EMPLOYEE_H_
