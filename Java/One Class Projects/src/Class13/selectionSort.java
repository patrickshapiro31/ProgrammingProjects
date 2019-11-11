/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class13;
//-----------------------------------------------------------------
// Sorts the specified array of objects using the selection
// sort algorithm.
//-----------------------------------------------------------------
public class selectionSort<T>
{

//-----------------------------------------------------------------
// Sorts the specified array of objects using the selection
// sort algorithm.
//-----------------------------------------------------------------
    public void selectionSort(Comparable<T>[] list)
    {
        int min;
        Comparable<T> temp;
        for (int index = 0; index < list.length - 1; index++)
        {
            min = index;
            for (int scan = index + 1; scan < list.length; scan++)
            {
                if (list[scan].compareTo((T) list[min]) < 0)
                {
                    min = scan;
                }
            }
// Swap the values
            temp = list[min];
            list[min] = list[index];
            list[index] = temp;
        }
    }
}
