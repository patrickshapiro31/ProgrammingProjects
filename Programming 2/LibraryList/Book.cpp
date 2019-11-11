#include "Book.h"
#include <functional>

Book::Book(std::string ISBN, std::string title, std::string authorLastName, std::string authorFirstName)
{
	this->ISBN = ISBN;
	this->title = title;
	this->authorLastName = authorLastName;
	this->authorFirstName = authorFirstName;
	checkedOut = false;
}

const std::string Book::getISBN()
{
	return ISBN;
}

const std::string Book::getTitle()
{
	return title;
}

const std::string Book::getAuthorLastName()
{
	return authorLastName;
}

const std::string Book::getAuthorFirstName()
{
	return authorFirstName;
}

bool Book::isCheckedOut()
{
	return checkedOut;
}

void Book::setCheckedOut(bool checkedOut)
{
	this->checkedOut = checkedOut;
}
