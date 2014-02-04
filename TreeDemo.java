package learn;

class treeNode {
	public int data;
	public treeNode left;
	public treeNode right;

	treeNode(){}
	treeNode(int n) {
		data = n;
		left = null;
		right = null;
	}

	/*public void nextNode(Node n) {
		left = n;
	}
	*/

}

class Tree {
	
	public treeNode root;
	
	Tree(int d)
	{
		root = new treeNode();
		root.left = null;	
		root.right = null;
		root.data = d;
		System.out.println("Inserted root successfully.");
	}
	
	void insertChild(int n, int d, boolean direction)
	{
		treeNode temp = root;
		while(temp.data!=n || temp == null)
		{
			temp = temp.left;
		}
		
		if(temp != null)
		{
			treeNode temp1 = new treeNode();
			temp1.data = d;
			temp1.right = null;
			temp1.left = null;
			if(direction)
				temp.left = temp1;
			else
				temp.right = temp1;
			System.out.println("Inserted successfully.");
		}
	}
	
	void printLeftSubTree()
	{
		treeNode temp = root;
		while(temp!=null)
		{
			//System.out.println(temp.data);
			temp = temp.left;
		}
	}
	
	void printTree(treeNode r, int height)
	{
		for(int i = 0;i <= height;i++)
		{
			printTreeAtLevel(r, i);
			System.out.println("");
		}
	}
	
	void printTreeAtLevel(treeNode r, int height)
	{
		if(r==null)
			return;
		if(height == 0)
		{
			System.out.print(r.data+" ");
			return;
		}
		printTreeAtLevel(r.left,height-1);
		printTreeAtLevel(r.right,height-1);
		
	}
	
	
	
}

public class TreeDemo
{
	public static void main(String a[])
	{
		Tree t = new Tree(1);
		t.insertChild(1, 2, true);
		t.insertChild(2, 3, true);
		t.insertChild(2, 4, false);
		t.insertChild(1, 5, false);
		
		//Does not work. WORK IN PROGRESS.
		//t.insertChild(5, 7, false);
		//t.insertChild(5, 6, true);
		t.printLeftSubTree();
		t.printTree(t.root, 3);
	}
}


