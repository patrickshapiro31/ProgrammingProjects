/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class13;

/**
 *
 * @author patrick.shapiro
 */
public class StringTree 
{
    int height = 255;

    public StringTreeNode root;

    public StringTree() 
    {
        root = null;
    }

    public StringTreeNode returnRoot() 
    {
        return root;
    }

    public boolean isEmpty() 
    {
        return root == null;
    }

    public void add(String value) 
    {
        if (isEmpty()) 
        {
            root = new StringTreeNode(value);
        } 
        else 
        {
            root.add(value);
        }
    }


    // using the function ...

    public void preOrder(StringTreeNode root) 
    {
        if (root != null) 
        {
            System.out.println(root.getName());   // root
            preOrder(root.getLeft());        // left
            preOrder(root.getRight());       // right
        }
    }
    


/* Function to line by line print level order traversal a tree*/
void printLevelOrder() 
{ 
    int h = height; 
    int i; 
    for (i=1; i<=h; i++) 
    { 
        print(root, i); 
    } 
} 
/* Print nodes at a given level */
void print(StringTreeNode root, int level) 
{ 
    if (root == null) 
        return; 
    if (level == 1) 
        System.out.println(root.getName()); 
    else if (level > 1) 
    { 
        print(root.getLeft(), level-1); 
        print(root.getRight(), level-1); 
    } 
} 




    
    
    
}

