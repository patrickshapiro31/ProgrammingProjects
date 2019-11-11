//Patrick Shapiro
//10/12/19
//Library.h

#ifndef _LIBRARY_H_
#define _LIBRARY_H_ //Library.h

#include <string>
#include <vector>
#include "Book.h"

class Library
{
private:
	std::vector<Book> books;

public:
	//Constructors
	Library();
	Library(std::string fileName);

	//Methods
	void loadBooks(std::string fileName);
	void addBook(Book book);
	void checkBookOut(std::string ISBN);
	void checkBookIn(std::string ISBN);
	void printBookList();
	void sortBooks();

};


#endif //End of Library.h