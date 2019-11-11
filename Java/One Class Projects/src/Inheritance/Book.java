/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author patrick.shapiro
 */
//********************************************************************
// Book.java Author: Lewis/Loftus
//
// Represents a book. Used as the parent of a derived class to
// demonstrate inheritance.
//********************************************************************
public class Book
{

    protected int pages = 1500;
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
