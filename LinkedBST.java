// Kenia Hale Binary Search TRee

import java.util.ArrayList;
import java.util.List;
public class LinkedBST
{
	private TreeNode root;
	
	public LinkedBST()
	{
		root = null;
	}
	
	// PART 1 -- ADD
	public boolean addNode(Comparable obj)
	{
		if(root == null)
		{
			root = new TreeNode(obj);
			return true;
		}
		else
			return addNodeRecursive(obj,root);
			
	}
	private boolean addNodeRecursive(Comparable obj, TreeNode temp)
	{
		if(obj.compareTo(temp.getValue()) == 0)// if duplicates, false
			return false;
		else if(obj.compareTo(temp.getValue()) > 0)// if object > value, put it right
		{
			if(temp.getRight() == null)// if nothing at right, set it at right
			{
				temp.setRight(new TreeNode(obj));
				return true;
			}
			else
				return addNodeRecursive(obj,temp.getRight());//else run it again
				
		}	
		else// else object < value, set left
		{
			if(temp.getLeft() == null)// if nothing left, set it left
			{
				temp.setLeft(new TreeNode(obj));
				return true;
			}
			else
				return addNodeRecursive(obj,temp.getLeft());// else run again
		}
			
		
	}
	
	// PART 2 -- TRAVERSALS
	
	public List preOrder()
	{
		ArrayList<Comparable> list = new ArrayList<Comparable>();
		if(root == null)// check if empty
			return list;
		else
			preOrderTraverse(root,list);
		return list;
	}
	public List inOrder()
	{
		ArrayList<Comparable> list = new ArrayList<Comparable>();
		if(root == null)
			return list;
		else
			inOrderTraverse(root,list);
		return list;
					
	}
	public List postOrder()
	{
		ArrayList<Comparable> list = new ArrayList<Comparable>();
		if(root == null)
			return list;
		else
			postOrderTraverse(root,list);
		return list;		
	}
	
	// RECURSIVE
	private void preOrderTraverse(TreeNode current, List list)// start with root, add as far left as possible, then add right
	{
		TreeNode temp = current;// don't need
		list.add(temp.getValue());// add root first
		if(temp.getLeft() != null)// if has left, run again for that left (will add left)
			preOrderTraverse(temp.getLeft(),list);
		if(temp.getRight() != null)// will work back up on right
			preOrderTraverse(temp.getRight(),list);
	}
	private void inOrderTraverse(TreeNode current, List list)
	{
		TreeNode temp = current;// don't need
		if(temp.getLeft() != null)// if has left, run again for that left, go as far left as possible
			inOrderTraverse(temp.getLeft(),list);
		list.add(temp.getValue());// add root next (must have root)
		if(temp.getRight() != null)// will work back up on right
			inOrderTraverse(temp.getRight(),list);
	}
	private void postOrderTraverse(TreeNode current, List list)
	{
		TreeNode temp = current;// don't need
		if(temp.getLeft() != null)// get as far left as possible
			postOrderTraverse(temp.getLeft(),list);
		if(temp.getRight() != null)// will work back up on right
			postOrderTraverse(temp.getRight(),list);
		list.add(temp.getValue());// add root last
	}
	
	
	// PART 3 -- DELETE
	public boolean deleteNode(Comparable find)
	{
		if(root == null || !search(find)) // if tree empty or find not in tree
			return false;
		else if(numKids(findNode(root,find)) == 0) // if it's a leaf, delete like a leaf, works!!!!
			return noKids(root,find);
		else if(numKids(findNode(root,find)) == 1) // if it's got one kid, delete accordingly, works!!!
		{
//			System.out.println(find + " has 1 kid");
			return oneKid(root,find);
		}		
		else
			return twoKids(root,find);
			
	}
	
	// RECURSIVE	
	public boolean search(Comparable key) // done
	{
		if(root == null)
			return false;
		else
			return search(root, key);
	}
	private boolean search(TreeNode current, Comparable key) // done
	{
		if(key.compareTo(current.getValue()) == 0)// if found, true
			return true;
		else if(key.compareTo(current.getValue()) > 0)// if key > value, search right
		{
			if(current.getRight() == null)// if nothing at right, must not be there
				return false;
			else
				return search(current.getRight(),key);//else run it again
				
		}	
		else// else object < value, search left
		{
			if(current.getLeft() == null)// if nothing left, false
				return false;
			else
				return search(current.getLeft(),key);/// else run again
		}
	}
	
	public int countLeaf() // done
	{
		if(root == null)
			return 0;
		else
			return countLeaf(root);// will return proper #
	}
	private int countLeaf(TreeNode current) // done
	{
		if(current == null)// if empty, return 0
			return 0;
		else if(current.getRight() == null && current.getLeft() == null)// if not leaves, must be leaf
			return 1;
		else
			return countLeaf(current.getRight()) + countLeaf(current.getLeft());// return the count leaf of right + of left
	}
	
	public int findPath(Comparable find) // done
	{
		if(root == null)
			return 0;
		else if(search(find))
			return findPath(root,find); // ensure thast it's in there 
		else
			return -1; // if not there, return -1
	}
	private int findPath(TreeNode current, Comparable find) // done
	{
		if(find.compareTo(current.getValue()) == 0)// if found, return 0
			return 0;
		else if(find.compareTo(current.getValue()) > 0)// if object > value, check right
		{
			return 1 + findPath(current.getRight(),find);
		}	
		else// else object < value, check left
		{
			return 1 + findPath(current.getLeft(),find);// else run again
		}
	}
	
	public int countNode()// done
	{
		if(root == null)
			return 0;
		else
			return countNode(root);// will return proper #
	}
	private int countNode(TreeNode current)// done
	{
		if(current == null || (current.getRight() == null && current.getLeft() == null)) // if empty or no leaves
			return 0;
		else if(current.getLeft() != null || current.getRight() != null) // if has at least one leaf, it's a node
		{
			System.out.println(current.getValue() + " is a node");
			return 1 + countNode(current.getLeft()) + countNode(current.getRight());
		}
		else
			return 0;
	}
	
	
	// HELPER METHODS	
	private TreeNode findNode(TreeNode current, Comparable find)// finds the node, so found node is now current
	{
		if(find.compareTo(current.getValue()) == 0)// if found, return the node
			return current;
		else if(find.compareTo(current.getValue()) > 0)// if object > value, check right
			return findNode(current.getRight(),find);	
		else// else object < value, check left
			return findNode(current.getLeft(),find);// else run again
	}
	private int numKids(TreeNode current)// finds number of kids
	{
		if(current.getRight() != null && current.getLeft() != null)// 2 kids
			return 2;
		else if(current.getRight() != null || current.getLeft() != null)// one kid
			return 1;
		else
			return 0;
	}
	private boolean noKids(TreeNode current,Comparable find)// done
	{
		if(((Comparable)root.getValue()).compareTo(find) == 0)// tree with only one node, works
		{
			root = null;
			return true;
		}
		else if( current.getLeft() != null && ((Comparable)current.getLeft().getValue()).compareTo(find) == 0)// delete node @ left, set left == null
		{
			current.setLeft(null);
			return true;
		}
		else if( current.getRight() != null &&((Comparable)current.getRight().getValue()).compareTo(find) == 0) // delete node @ right, set right == null
		{
			current.setRight(null);
			return true;
		}
		else if(current.getRight() != null && find.compareTo(current.getValue()) > 0)// if object > value, check right
			return noKids(current.getRight(),find);	
		else// else object < value, check left
			return noKids(current.getLeft(),find);// else run again
			
		
	}
	private boolean oneKid(TreeNode current, Comparable find)// done
	{
		if(find.compareTo(current.getValue()) == 0) // MUST BE REMOVING ROOT, set equal to next value (either on left or right)
		{
			if(current.getRight() != null)
				root = current.getRight();
			else
				root = current.getLeft();
			return true;
		}
		else if(current.getLeft() != null && ((Comparable)current.getLeft().getValue()).compareTo(find) == 0)// delete node @ left, set left == del's child
		{
			TreeNode del = current.getLeft();
			if(del.getLeft() == null)
				current.setLeft(del.getRight());
			else
				current.setLeft(del.getLeft());
			return true;
		}
		else if(current.getRight() != null && ((Comparable)current.getRight().getValue()).compareTo(find) == 0) // delete node @ right, set right == del's child
		{
			TreeNode del = current.getRight();
			if(del.getLeft() == null)
				current.setRight(del.getRight());// if no left, set current's right == del's right
			else
				current.setRight(del.getLeft());// if no right, set equal to del's left
			return true;
		}
		else if(find.compareTo(current.getValue()) > 0)// if object > value, check right
			return oneKid(current.getRight(),find);	
		else// else object < value, check left
			return oneKid(current.getLeft(),find);// else run again
	}
	private boolean twoKids(TreeNode current, Comparable find)
	{
		if(((Comparable)current.getValue()).compareTo(find) == 0)// if current is equal to what needs to be deleted
		{
			if(current.getLeft().getRight() == null) // if the left doesn't have any kids, no need to find max, set current to left
			{
				current.setValue(current.getLeft().getValue());
				current.setLeft(null);
			}
			else
				current.setValue(findMax(current.getLeft()));// find the highest value, first go to left then go far right
			return true;
		}
		else if(find.compareTo(current.getValue()) > 0)// if object > value, check right
			return twoKids(current.getRight(),find);	
		else// else object < value, check left
			return twoKids(current.getLeft(),find);// else run again
	}
	private Object findMax(TreeNode current)
	{
		if(current.getRight() != null) // current == prev
		{
			if(current.getRight().getRight() == null) // if nothing else @ right, must be max
			{
				Object big = current.getRight().getValue();
				deleteNode((Comparable)current.getRight().getValue()); // set the place where the biggest value was to null
				return big;
			}
			else
				return findMax(current.getRight());
		}
		else // impossible to get here, gaurenteed to get here in 2 kids
			return null;
			
	}		
}