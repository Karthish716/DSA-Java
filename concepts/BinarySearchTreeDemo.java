package sample2;

public class BinarySearchTreeDemo {

	public static void main(String[] args) {
		BinarySearchTree bst=new BinarySearchTree(50);
		
           bst.insert(bst.root, 20);
           bst.insert(70);
           bst.insert(10);
           bst.insert(25);
           bst.insert(60);
           bst.insert(90);
           bst.inOrder(bst.root);
           
           if(bst.search(bst.root, 45)==null) {
        	   System.out.println("NOT Found");
           }
           else {
        	   System.out.println("Found");
           }
           
           bst.delete(bst.root, 25);
           
           
           bst.inOrder(bst.root);
           
           
           
	}

}
