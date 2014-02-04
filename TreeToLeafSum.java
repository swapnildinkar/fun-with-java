/*
Given a binary tree, where every node value is a Digit from 1-9 .Find the sum of all the numbers which are formed from root to leaf paths.

For example consider the following Binary Tree.

                                          6
                                      /      \
                                    3          5
                                  /   \          \
                                 2     5          4  
                                      /   \
                                     7     4
  There are 4 leaves, hence 4 root to leaf paths:
   Path                    Number
  6->3->2                   632
  6->3->5->7               6357
  6->3->5->4               6354
  6->5>4                    654   
Answer = 632 + 6357 + 6354 + 654 = 13997 
*/


package learn;

public class TreeToLeafSum {

	static int sum;
	
	public static void main(String[] args) {
		Tree t = new Tree(1);
		t.insertChild(1, 2, true);
		t.insertChild(2, 3, true);
		t.insertChild(2, 4, false);
		t.insertChild(1, 5, false);
		TreeToLeafSum ts = new TreeToLeafSum();
		ts.recurse(t.root,0);
		
		System.out.println("sum"+sum);
	}
	
	void recurse(treeNode n, int value)
	{
		if(n==null)
		{
			return;
		}
		value = (value*10) + n.data;		
		recurse(n.left, value);
		if(n.right == null)
		{	sum += value;
			return;
		}
		recurse(n.right, value);	
	}
}
