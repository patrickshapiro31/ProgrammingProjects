/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1;
/**
 *
 * @author Patrick is a pimp
 */
//seperating numbers from strings and strings from numbers
public class Test 
{
    public static void main (String[] args)
    {
        String problem, solution, numstring;
        int number;
        
        
        problem = "master_sword001";
        
        number = Integer.parseInt(problem.replaceAll("[^0-9]", ""));
        //Converts the numerical values in problem to an int
        solution = problem.replaceAll("[^A-Za-z_]","");
        //Removes the numerical value from problem, preserving the chars in parenthasis
        solution = solution.replace('_', ' ');
        //replaces underscores with blank space
        
        
        System.out.println(number);
        System.out.println(solution);
        
        
    }
    
}
