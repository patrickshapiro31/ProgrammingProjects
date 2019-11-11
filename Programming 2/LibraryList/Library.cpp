/******************************
   Patrick Shapiro
   10/13/19
   Library.cpp
********************************/

#include "Book.h"
#include "Library.h"
#include <iostream>
#include <iomanip>
#include <fstream>
#include <string>
#include <vector>
#include <algorithm>

Library::Library()
{
}

Library::Library(std::string fileName)
{
	loadBooks(fileName);
}

//loads books into the vector
void Library::loadBooks(std::string fileName)
{
	//temporary strings for the books
	std::string ISBN = "";
	std::string title = "";
	std::string fullname = "";
	std::string last = "";
	std::string first = "";

	std::ifstream file;
	file.open(fileName);
	
	while (!file.eof())
	{
		getline(file, ISBN);
		getline(file, title);
		getline(file, fullname);

		//find the whitespace and divide the name
		std::string::size_type position = fullname.find(" ");
		first = fullname.substr(0, position);
		last = fullname.substr(position + 1);

		Book tempbook(ISBN, title, last, first);
		addBook(tempbook);
	}

	file.close();
}

void Library::addBook(Book book)
{
	books.push_back(book);

}

void Library::checkBookOut(std::string ISBN)
{
	bool found = false;

	for (auto& elem : books)
	{
		if (elem.getISBN() == ISBN)
		{
			if (!elem.isCheckedOut())
			{
				std::cout << "Book Checked out: '" << elem.getTitle() << "'";
				elem.setCheckedOut(true);
				found = true;
			}
			else
			{
				std::cout << "Book: '" << elem.getTitle() << "' is currently unavailable.";
				found = true;
			}
		}
	}
	if (!found)
		std::cout << "Book not found";

}

void Library::checkBookIn(std::string ISBN)
{
	bool found = false;

	for (auto& elem : books)
	{
		if (elem.getISBN() == ISBN)
		{
			if (elem.isCheckedOut())
			{
				std::cout << "Book Checked in: '" << elem.getTitle() << "'";
				elem.setCheckedOut(false);
				found = true;
			}
			else
			{
				std::cout << "Book: '" << elem.getTitle() << "' is already checked in.";
				found = true;
			}
		}
	}
	if (!found)
		std::cout << "Invalid ISBN";
}

void Library::printBookList()
{
	
	
	sortBooks();

	std::string printedname;
	std::cout << std::left << std::setw(18) << "Author Name" << std::setw(40) << "Book Title"  << std::setw(12) << "ISBN"  << "In/Out";
	std::cout << "\n------------------------------------------------------------------------------\n";

	for (auto current : books)
	{
		printedname = current.getAuthorLastName() + ", " + current.getAuthorFirstName();

		std::cout << std::setw(18) << printedname <<  std::setw(40) << current.getTitle() << std::setw(12) << current.getISBN();

		if (current.isCheckedOut())
			std::cout  << "Out\n";
		else
			std::cout  << "In\n";
	}
	
}

//Two functions to sort the books by author last name
//Taken from the example
bool sortFunc(Book& lhs, Book& rhs)
{
	return lhs.getAuthorLastName() < rhs.getAuthorLastName();
}


void Library::sortBooks()
{
	sort(books.begin(), books.end(), sortFunc);	
}







