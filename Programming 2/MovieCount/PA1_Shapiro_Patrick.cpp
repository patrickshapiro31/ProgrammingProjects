/******************************
   Name Patrick Shapiro
   Date 8/3/2019
   File Name DataReaderSorter
   Program reads data from a file as integers then
   sorts them, displays them and calculates mean
   median and mode.
********************************/

// Headers
#include <iostream>
#include <cstdlib>
#include <string>
#include <fstream>
#include <iomanip>
using namespace std;

// Global variables;
const string FILENAME = "moviecount.txt";

// Function declarations
int readMovieData(int*& movies, string fileName);
double calculateAverage(int* movies, int size);
double calculateMedian(int* movies, int size);
int* calculateMode(int* movies, int size, int& numModes);
void sort(int* movies, int size);
void swap(int* a, int* b);

int main()
{
	int numStudents;			// number of students who watch movies
	int* movieCounts = nullptr;	// an array of integers to store counts of movies for each student
	int* sortedMovies;

	// Read in the movie data
	try
	{
		numStudents = readMovieData(movieCounts, FILENAME);		// call to first prototype
		sortedMovies = movieCounts;
		sort(sortedMovies, numStudents);
	}
	catch (const char* message) // if file cannot be opened then catch the thrown exception
	{
		cout << message << endl;
		system("PAUSE");
		exit(EXIT_FAILURE);
	}

	cout << setprecision(2) << fixed << showpoint;	// set decimal places to two for average and median
	cout << "Total number of students who watched movies is " << numStudents << endl;
	cout << "The average number of movies watched by all students is " << calculateAverage(movieCounts, numStudents) << endl;
	cout << "The median number of movies watched by all students is " << calculateMedian(sortedMovies, numStudents) << endl;

	int numModes = 0;	// number of modes in the list, there could be more than one
	int* modes = calculateMode(sortedMovies, numStudents, numModes); // list of modes is returned and stored in modes
	cout << "The mode number of movies watched by all students is ";
	if (numModes >= 1)
	{
		cout << *modes;	// output the first mode
	}
	for (int i = 1; i < numModes; i++) // if there is more than one, output the remaining modes
	{
		cout << ", " << *(modes + i);
	}
	cout << endl;

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

/***********************************************************
Reads data in from fileName and stores in movies. movies will point to a dynamic array of integers
PARAM:	movies is a reference to a pointer to int
		fileName is a string that contains the name of the file to be read
PRE:	The file fileName exist in the project folder. The first value in the file is the number of values
		after the first value
POST:	movies points to a dynamic array of integers with the size equal to the first value in the file
		Each element in movies array corresponds to a value in the file
NOTE:	Throws an exception if cannot open the file
************************************************************/
int readMovieData(int*& movies, string fileName)
{
	ifstream textFile(fileName);


	string currentline;
	int index, currentvalue;
	int size;
	textFile >> size;
	int* arr = new int[size];


	
	if (textFile.is_open())
	{
		index = 0;

		while (getline(textFile, currentline)) //record values and increment index
		{
			textFile >> currentvalue;
			*(arr + index) = currentvalue;
			index++;
		}
	}
		movies = arr;

	textFile.close();
	return size;
}


/***********************************************************
Calculates the average of the elements in dynamic array movies
PARAM:	movies points to a dynamic array
		size is the number of elements in array pointed to by movies
PRE:	movies points to an array of size elements
POST:	average is calculated and the value returned
NOTE:
************************************************************/
double calculateAverage(int* movies, int size)
{
	double average = 0;

	for (int i = 0; i < size; i++)
	{
		average += (double)(*(movies + i));
	}
	average = average / size;
	return average;
}

/***********************************************************
Calculates the median of the elements in the dynamic array movies
PARAM:	movies points to a dynamic array
		size is the number of elements in array pointed to by movies
PRE:	movies points to an array of size elements
POST:	median is calculated and the value returned
NOTE:	To make it easier to find the center (or two center) values, movies is sorted
************************************************************/
double calculateMedian(int* movies, int size)
{
	int median = 0;
	int half = size / 2; //Due to how odd integers divide, this lines up with the needed index

	if (size % 2 == 0) //evens (Averages the two medians)
	{
		median = (*(movies + half)) + (*(movies + (half - 1)));
		median = median / 2;
	}
	if (size % 2 == 1) //odds
	{
		median = *(movies + half);
	}

	return median;
}

/***********************************************************
Description
PARAM:	movies points to a dynamic array
		size is the number of elements in array pointed to by movies
		numModes is a reference variable used to return the number of modes found in movies
PRE:	movies points to an array of size elements
POST:	Each mode value is stored in a dynamic array of integers with size of size
		The dynamic array of modes is returned
NOTE:	std::fill was used to clear the array when a new mode larger than other modes was found
		To make it easier to determine the number of like values, movies is sorted
************************************************************/
int* calculateMode(int* movies, int size, int& numModes) //Movies need to be sorted for this function
{
	int currentNum = *movies; // Current number being looked at
	int occurances = 0; //number of times current number has occured
	int highScore = 1; //required number of times a number has to occur to become a mode
	int* modeArray = new int[size]; //array for the modes
	int modeArrayindex = 0; //current slot to record a mode
	int numberOfModes = 0; //number of elements that are modes
	
	for (int i = 0; i < size; i++)
	{
		if (currentNum == *(movies + i)) //Checks if the number that occured last is occuring again
		{
			occurances++;
			if (highScore == occurances) //If a number occurs and equal amount of times to current modes
			{
				numberOfModes++;
				*(modeArray + modeArrayindex) = *(movies + i);
				modeArrayindex++;
				
			}
			else if (highScore < occurances) //If a number occurs more than all current modes
			{
				highScore = occurances;
				numberOfModes = 1;
				modeArrayindex = 0;
				*(modeArray) = *(movies + i);
				modeArrayindex++;
			}
		}
		else //This is if the current number changes
		{
			currentNum = *(movies + i);
			occurances = 1;
			if (highScore == occurances) //This is a contingency for if every element is different. Occurances is 1.
			{
				numberOfModes++;
				*(modeArray + modeArrayindex) = *(movies + i);
				modeArrayindex++;
			}
		}

	}

	numModes = numberOfModes;
	return modeArray;


}

/***********************************************************
Bubble sort
PARAM:	movies points to a dynamic array
		size is the number of elements in array pointed to by movies
PRE:	movies points to an array of size elements
POST:	movies is sorted in ascending order
NOTE:
************************************************************/
void sort(int* movies, int size)
{
	int startScan; // start search
	int minIndex; // index of the smallest element
	int* ptrMinElem; //pointer of the smallest element

	for (startScan = 0; startScan < size; startScan++)
	{
		minIndex = startScan;
		ptrMinElem = (movies + startScan);
		for (int index = startScan + 1; index < size; index++)
		{
			if (*(movies + index) < *ptrMinElem)
			{
				ptrMinElem = (movies + index);
				minIndex = index;
			}
		}//inner for loop

		swap(*(movies + minIndex), *(movies + startScan));
		

	}//outer for loop

}

/***********************************************************
Swap to values
PARAM:	a is a pointer to an int
		b is a pointer to an int
PRE:	a and b point to valid memory locations
POST:	the values that a and b point to are swapped
NOTE:
************************************************************/
void swap(int* a, int* b)
{
	int* temp;
	temp = a;
	a = b;
	b = temp;
	delete[] temp;
}