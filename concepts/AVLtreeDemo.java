package sample2;

public class AVLtreeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AVLtree avl = new AVLtree(50);
		avl.insert(20);
         avl.insert(60);
         avl.insert(10);
         avl.insert(30);
         avl.insert(40);
         avl.inOrder(avl.root);
	}

}
