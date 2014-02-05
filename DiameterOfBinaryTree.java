package learn;

public class DiameterOfBinaryTree {

	public static void main(String[] args) {
		Tree t = new Tree(1);
		t.insertChild(1, 2, true);
		t.insertChild(2, 3, true);
		t.insertChild(2, 4, false);
		t.insertChild(1, 5, false);
		t.insertChild(3, 9, false);
		t.insertChild(3, 10, true);
		t.insertChild(10, 11, true);
		DiameterOfBinaryTree s = new DiameterOfBinaryTree();
		System.out.println(s.calDiameter(t.root));
		t.printTree(t.root, 5);
	}

	int calDiameter(treeNode t) {
		if (t == null) {
			return 0;
		}
		return(Math.max((calDiameter(t.left)+1),(calDiameter(t.right)+1)));
	}
}
