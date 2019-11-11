/******************************
   Patrick Shapiro
   11/7/2019
   main.cpp
   Reads the salries, and hours worked of employees, and determines how much they should be paid, outputting data to a txt.
********************************/

// Headers
#include <iostream>
#include <cstdlib>
#include <string>
#include <vector>
#include <fstream>
#include <cstring>
#include <algorithm>
#include <iomanip>
using namespace std;

#include "Employee.h"
#include "HourlyEmployee.h"
#include "SalaryEmployee.h"

// Global variables
const int EMPID_LENGTH = 7;			// length of id is 6
const int FIRSTNAME_LENGTH = 12;	// length of first name is less than 21
const int LASTNAME_LENGTH = 12;		// length of last name is less than 21
const string EMPDATA_FILENAME = "employees.dat";
const string TIMEDATA_FILENAME = "emp_time.dat";
const string PAYROLL_REPORT_FILENAME = "payroll.txt";

struct EmployeeRecord
{
	char employeeType;					// H for hourly employee, S for salary employee
	char id[EMPID_LENGTH];				// Id of employee
	char firstName[FIRSTNAME_LENGTH];	// Employee's first name
	char lastName[LASTNAME_LENGTH];		// Employee's last name
	double salary;						// Employee's weekly or hourly salary depending on type of employee
};

struct EmployeeTime
{
	char id[EMPID_LENGTH];				// ID of employee
	double hours;						// Hours worked for week
};

// Function declarations
void loadEmployees(vector<Employee*>& employees, string fileName);
void loadEmployeeTime(vector<EmployeeTime>& empTime, string fileName);
void createPayrollReport(const vector<Employee*>& employees, const vector<EmployeeTime>& empTime, string fileName);
vector<Employee*>::const_iterator findEmployee(const vector<Employee*>& employees, string id);

int main()
{

	vector<Employee*> employees;		// vector of pointers to Employee
	vector<EmployeeTime> timeCards;		// vector of EmployeeTime structs

	loadEmployees(employees, EMPDATA_FILENAME);
	loadEmployeeTime(timeCards, TIMEDATA_FILENAME);
	createPayrollReport(employees, timeCards, PAYROLL_REPORT_FILENAME);

	//	Make sure we place the end message on a new line
	cout << endl;

	//	The following is system dependent.  It will only work on Windows
	system("PAUSE");

	/*
	// A non-system dependent method is below
	cout << "Press any key to continue";
	cin.get();
	*/
	return 0;
}

/***************************************************************
Loads the employees from the file
employees is a vector of pointers to Employee class
fileName is the name of the file to read the data from
****************************************************************/
void loadEmployees(vector<Employee*>& employees, string fileName)
{
	EmployeeRecord current;

	fstream empFile; //file stream for employee file
	empFile.open(fileName, ios::in | ios::binary);

	//test if it opened
	if (empFile.fail())
	{
		cout << "Unable to open " + fileName + ".";
		system("PAUSE");
		exit(EXIT_FAILURE);
	}

	//Set cursor to start of the file
	empFile.clear();
	empFile.seekg(0L, ios::beg);

	do
	{
		empFile.read(reinterpret_cast<char*>(&current), sizeof(EmployeeRecord));

		if (!empFile.eof())
		{
			if (current.employeeType == 'H') //Hourly
			{
				HourlyEmployee* temp = new HourlyEmployee(current.firstName, current.lastName, current.id, current.salary);
				employees.push_back(temp);
			}
			else if (current.employeeType == 'S') //Salary
			{
				SalaryEmployee* temp = new SalaryEmployee(current.firstName, current.lastName, current.id, current.salary);
				employees.push_back(temp);
			}
			else //In case of invalid identifiers
			{
				cout << "Error, invalid identifier\n";
			}
		}
	} 
	while (!empFile.eof());

	empFile.close(); //Close File

}

/***************************************************************
Loads the employee time data from the file
empTime is a vector of EmployeeTime struct
fileName is the name of the file to read the data from
****************************************************************/
void loadEmployeeTime(vector<EmployeeTime>& empTime, string fileName)
{
	EmployeeTime current;

	fstream timeFile; //file stream for time file
	timeFile.open(fileName, ios::in | ios::binary);

	//test if it opened
	if (timeFile.fail())
	{
		cout << "Unable to open " + fileName + ".";
		system("PAUSE");
		exit(EXIT_FAILURE);
	}

	timeFile.clear();
	timeFile.seekg(0L, ios::beg);

	while (!timeFile.eof())
	{
		timeFile.read(reinterpret_cast<char*>(&current), sizeof(EmployeeTime));
		empTime.push_back(current);
	}

	timeFile.close(); //Close file


}

/***************************************************************
Creates a payroll report and writes it out to a file
employees is a vector of pointers to Employee class
empTime is a vector of EmployeeTime struct
fileName is the name of the file to write the data to
****************************************************************/
void createPayrollReport(const vector<Employee*>& employees, const vector<EmployeeTime>& empTime, string fileName)
{
	double tempPay;
	string fullname;
	string lastID;

	ofstream outputFile; //file stream for output file
	outputFile.open(fileName);
	if (outputFile.fail())
	{
		cout << "Unable to open " + fileName + ".";
		system("PAUSE");
		exit(EXIT_FAILURE);
	}


	outputFile << "Employee Time Record\n\n";
	outputFile << "ID         Name                          Hours          Payment\n";
	outputFile << "_________________________________________________________________\n\n";


	for (auto et : empTime)
	{
		
		auto it = findEmployee(employees, et.id);

		if (lastID != et.id) //This stops the vector from repeating the final element
		{
			tempPay = (*it)->calculatePay(et.hours);
			fullname = (*it)->getLastName() + ", " + (*it)->getFirstName();

			outputFile << left << setw(4) << (*it)->getEmpID() << "\t" << setw(30) << fullname << setw(15) <<
				fixed << setprecision(2) << et.hours << tempPay << endl;
		}

		lastID = et.id;
	}


	// close the file
	outputFile.close();
	
}

/***************************************************************
findEmployee searchs for id in vector employees
if id is found it returns an iterator to the employee in the vector
if id is not found it returns an iterator pointing to end
****************************************************************/
vector<Employee*>::const_iterator findEmployee(const vector<Employee*>& employees, string id)
{
	vector<Employee*>::const_iterator it;
	for (it = employees.begin(); it != employees.end(); it++)
		if ((*it)->getEmpID() == id) return it;
	return it;
}