// Patrick Shapiro
// 11/7/2019
// Employee.cpp

#include <iostream>

#include "Employee.h"




	//Constructor
	Employee::Employee(std::string first, std::string last, std::string IDNumber)
	{
		 Employee::firstName = first;
		 Employee::lastName = last;
		 Employee::ID = IDNumber;
	}


	const std::string Employee::getFirstName() { return Employee::firstName; }
	const std::string Employee::getLastName() { return Employee::lastName; }
	const std::string Employee::getEmpID() { return Employee::ID; }


	const bool Employee::operator == (Employee& emp1)
	{
		if (emp1.getEmpID() == Employee::ID)
			return true;
		else
			return false;
	}

	double Employee::calculatePay(double hoursWorked)
	{
		return 0.0;
	}

	// Pure virtual function

