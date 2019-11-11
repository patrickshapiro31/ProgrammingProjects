/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinaryTrees;

/**
 *
 * @author patrick.shapiro
 */
public class IntTree
{

    private IntTreeNode overallRoot; // null for an empty tree
    private int height;

    IntTree tree = new IntTree(5);

    private IntTree(IntTreeNode overallRoot)
    {
        this.overallRoot = overallRoot;
    }

    public IntTree(int height)
    {
        this.height = height;
    }

    public void print()
    {
        print(overallRoot);
        System.out.println(); // end the line of output
    }

    private void print(IntTreeNode root)
    {
        if (root != null)
        {
// recursive: print left, center, right
            print(root.left);
            System.out.print(root.data + " ");
            print(root.right);
        }
    }

    public void add(IntTreeNode currentNode, IntTreeNode newNode)
    {
        if (currentNode == null)
        {
            currentNode = newNode;
        } else if (currentNode.left == null)
        {
            currentNode.left = newNode;
        } else if (currentNode.right == null)
        {
            currentNode.right = newNode;
        } else
        {
            add(currentNode.left, newNode);
        }

    }

    public boolean contains(int value)
    {
        return contains(overallRoot, value);
    }

    private boolean contains(IntTreeNode node, int value)
    {
        if (node == null)
        {
            return false; // not found here
        } 
        else
        {
            if (node.data == value)
            {
                return true; // found here
            } 
            else
            {
// recursive: search left/right subtrees
                return contains(node.left, value) || contains(node.right, value);
            }
        }

    }
}
