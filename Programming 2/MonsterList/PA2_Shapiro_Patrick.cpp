/******************************
   Patrick Shapiro
   9/13/2019
   MonsterList
   Provides a UI to the user so they 
   may select and display information 
   on monsters in a .dat file
********************************/

// Headers
#include <iostream>
#include <cstdlib>
#include <string>
#include <vector>
#include <fstream>
#include <algorithm>
using namespace std;

// Global variables
const int CREATURE_NAME_SIZE = 30;			// Max length of a creature name
const int CREATURE_TYPE_SIZE = 26;			// Max length of a creature type
const string FILENAME = "creatures.dat";	// Name of file that contains the data

// struct used to create records in file
struct Creature
{
	char name[CREATURE_NAME_SIZE];				// Name of the creature
	char creatureType[CREATURE_TYPE_SIZE];		// Type of creature
	int hp;										// Hit points for creature
	int armor;									// Armor class for creature
	int speed;									// Speed of creature
};

// This function returns true if the name of the left creature is less than the name of the right creature
// Use this function when running the sort function
bool sortByName(const Creature& lhs, const Creature& rhs)
{
	string name1(lhs.name), name2(rhs.name);
	return name1 < name2;
}

// Function declarations
int getCreatureNumber(int numCreatures);
void displayCreature(fstream& file, int num);
void displaySorted(fstream& file);

int main()
{
	char choice;			// choice made by user for menu
	fstream creatureFile;	// file stream for input file
	int numCreatures = 0;   // the number of creatures saved to the file. Set to 0 to avoid initial errors

	// Open the creatureFile for input and binary (one statement of code)
	creatureFile.open(FILENAME, ios::in |ios::binary);
	//	Test for open
	if (creatureFile.fail())
	{
		cout << "Unable to open file\n";
		system("PAUSE");
		exit(EXIT_FAILURE);
	}

	// Get the number of creatures in the file (two statements of code)
	creatureFile.clear();
	creatureFile.seekg(0L, ios::end); //moved file cursor to end
	//get the position of the file cursor and divide by the size of a single creature
	numCreatures = creatureFile.tellg() / sizeof(Creature);




	do
	{
		cout << "Menu" << endl;
		cout << "1. Display a specific creature\n";
		cout << "2. Display all creatures sorted by name\n";
		cout << "3. Quit\n";
		cout << "Enter your choice (1, 2, 3): ";
		cin >> choice;

		while (cin.get() != '\n');

		switch (choice)
		{
		case '1':	// Display a specific creature
			displayCreature(creatureFile, getCreatureNumber(numCreatures));
			break;

		case '2':	// Display all the creatures in order
			displaySorted(creatureFile);
			break;

		case '3':	// Quit			
			break;

		default:
			cout << "Invalid option.\n";
			break;
		}

		if (choice != '3')
		{
			system("PAUSE");
			system("CLS");
		}

	} while (choice != '3');

	creatureFile.close();


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

/*******************************************************************
getCreatureNumber gets and returns the record number from the file that the user would like to be displayed
PARAM:	numCreatures should be the value of the total number of records (creatures) in the file
PRE:	numCreatures contains a value that is equal to the number of records in the file
POST:	A value between 1 and numCreatures is returned as selected by the user
NOTE:	Do not allow a value less than 1 or greater than numCreatures to be returned
********************************************************************/
int getCreatureNumber(int numCreatures)
{
	int creNum = 0; //Creature number


	//Get the creature number from the user
	while (creNum < 1 || creNum > numCreatures)
	{
		cout << "\nEnter the record number from 1 to " << numCreatures << ": ";
		cin >> creNum;
	}

	return creNum;
}

/*******************************************************************
displayCreature displays record number num from file
PARAM:	file is a fstream that should be open for input and binary
		num contains the record number that is to be read in file
PRE:	file is a fstream that is open for input and binary
		num is a value between 1 and the number of records in file
POST:	The record number num is displayed to the monitor
********************************************************************/
void displayCreature(fstream& file, int num)
{
	Creature current; //Creature to display
	file.clear();
	file.seekg((num - 1) * sizeof(current), ios::beg);
	if (file.fail())
	{
		cout << "Error locating creature\n";
		return;
	}
	//Red the record
	file.read(reinterpret_cast<char*>(&current), sizeof(current));
	//Display Record
	cout << endl;
	cout << "* * * * * Creature Report * * * * *\n";
	cout << "Name: " << current.name << endl;
	cout << "Type: " << current.creatureType << endl;
	cout << "HP: " << current.hp << endl;
	cout << "Armor Class: " << current.armor << endl;
	cout << "Speed:  " << current.speed << endl;
	cout << "* * * * * * * * * * * * * * * * * *\n";

}

/*******************************************************************
displaySorted should read file into a vector. It should then sort the vector by
the name of the creature. Last it should display the vector
PARAM:	file is a fstream that should be open for input and binary
PRE:	file is open for input and binary
POST:	Each record is displayed sorted by the name of the creature
********************************************************************/
void displaySorted(fstream& file)
{
	Creature currentCreature;		//Current Creature in focus
	vector<Creature> MonsterManual;	//	Collection of all creatures

	//	read a record from the file
	file.clear();
	file.seekg(0L, ios::beg);
	file.read(reinterpret_cast<char*>(&currentCreature), sizeof(Creature));

	//	Process the file
	while (!file.eof())
	{
		MonsterManual.push_back(currentCreature); //save the creature in vector
		file.read(reinterpret_cast<char*>(&currentCreature), sizeof(Creature)); //Read next Creature
	}
	//Sort the vector
	sort(MonsterManual.begin(), MonsterManual.end(), sortByName);

	
		for (auto current : MonsterManual)
		{
			cout << "* * * * * * * * * * * * * * * * * *\n";
			cout << "Name: " << current.name << endl;
			cout << "Type: " << current.creatureType << endl;
			cout << "HP: " << current.hp << endl;
			cout << "Armor Class: " << current.armor << endl;
			cout << "Speed:  " << current.speed << endl;
		}
		cout << "* * * * * * * * * * * * * * * * * *\n";


}

