//Patrick Shapiro
//10/12/19
//Book.h

#ifndef _BOOK_H_
#define _BOOK_H_ //Book.h

#include <string>

class Book
{
private:
	std::string ISBN;
	std::string title;
	std::string authorLastName;
	std::string authorFirstName;
	bool checkedOut;

public:
	//Constructor
	Book(std::string ISBN, std::string title, std::string authorLastName, std::string authorFirstName);

	//Methods
	const std::string getISBN();
	const std::string getTitle();
	const std::string getAuthorLastName();
	const std::string getAuthorFirstName();
	bool isCheckedOut();
	void setCheckedOut(bool checkedOut);
	bool sortFunc(const Book& lhs, const Book& rhs);

};

#endif //End of Book.h
