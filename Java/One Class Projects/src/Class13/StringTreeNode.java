/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class13;

public class StringTreeNode 
{

    private String data;    // The data in this node.
    private StringTreeNode left;   // Pointer to the left subtree.
    private StringTreeNode right;  // Pointer to the right subtree.

    public StringTreeNode(String s) 
    {
        data = s;
        left = null;
        right = null;
    }


        public void add(String value) 
    {
        boolean goleft = true;
        int testnum = 1;
        int increment = 2;
        int righty = 0;
        
        while (countNodes(left) >= testnum)
        {
        righty = testnum;
        testnum += increment;
        increment *= 2;
        }
        
        if (countNodes(left) >= testnum && countNodes(right) <= righty)
            goleft = false;
        else if (countNodes(left) >= testnum && countNodes(left) <= countNodes(right))
            goleft = true;
        else
            goleft = true;
        
        
        
        
        if (left == null) 
        {
            left = new StringTreeNode(value);
        } 
        else if (right == null) 
        {
            right = new StringTreeNode(value);
        } 
        else 
        {
            if (goleft) 
            {
                left.add(value);
            } 
            else 
            {
                right.add(value);
            }
        }
    }

    //Count the nodes in the binary tree to which root points, and
    public int countNodes(StringTreeNode root) 
    {
        if (root == null) 
        {
            // The tree is empty.  It contains no nodes.
            return 0;
        } 
        else 
        {
            // Start by counting the root.
            int count = 1;
            // Add the number of nodes in the left subtree.
            count += countNodes(root.left);
            // Add the number of nodes in the right subtree.
            count += countNodes(root.right);
            return count;  // Return the total.
        }
    }

    public StringTreeNode getLeft() 
    {
        return left;
    }

    public StringTreeNode getRight() 
    {
        return right;
    }

    public String getName() 
    {
        return data;
    }
}
    

    
    
    
    
 
    
    
    

    
    
    
    
    
    


