/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author patrick.shapiro
 */
public class SwitchExample
{

    public static void main(String[] args)
    {
        int grade, category;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a numeric grade (0 to 100): ");
        grade = scan.nextInt();
        category = grade / 10;
        System.out.print("That grade is ");
        
        
        switch (category)
            //this checks 'catagory' to see what case it should meet
        {
            case 10:
                System.out.println("a perfect score. Well done.");
                break;
            case 9:
                System.out.println("well above average. Excellent.");
                break;
            case 8:
                System.out.println("above average. Nice job.");
                break;
            case 7:
                System.out.println("average.");
                break;
            case 6:
                System.out.println("below average. You should see the");
                System.out.println("instructor to clarify the material "
                        + "presented in class.");
                break;
                
            default:
                System.out.println("not passing.");
                //this is done if no conditions match the cases
        }
    }
}
//To put a usual case, use (case: )