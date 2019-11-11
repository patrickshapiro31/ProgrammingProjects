/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance2SuperConstructor;

//********************************************************************
// Book2.java Author: Lewis/Loftus
//
// Represents a book. Used as the parent of a derived class to
// demonstrate inheritance and the use of the super reference.
//********************************************************************
public class Book2
{

    protected int pages;
//----------------------------------------------------------------
// Constructor: Sets up the book with the specified number of
// pages.
//----------------------------------------------------------------

    public Book2(int numPages)
    {
        pages = numPages;
    }
//----------------------------------------------------------------
// Pages mutator.
//----------------------------------------------------------------

    public void setPages(int numPages)
    {
        pages = numPages;
    }
//----------------------------------------------------------------
// Pages accessor.
//----------------------------------------------------------------

    public int getPages()
    {
        return pages;
    }
}
