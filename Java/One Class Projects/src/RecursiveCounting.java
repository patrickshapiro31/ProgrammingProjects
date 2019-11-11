/**
 *
 * @author steve.smiley
 * Counts from 1 to 10 recursively 
 */
public class RecursiveCounting
{
    public static void main(String[] args)
    {
        // Count to 10
        
        count(10);
    }
    
    public static void count(int myNum)
    {
        if( myNum > 0)
        {
            count(--myNum);
            System.out.println(myNum + 1);
        }
    }  
            
}
