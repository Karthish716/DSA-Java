package sample2;

public class AVLtree {
	
	Node root;
	class Node{
		int key;
		Node left,right;
		int height;
	public Node(int val){
		key=val;
	    left=right=null;
	    height =0;
	}		
	}
	
	
	public AVLtree(int val){
		root=new Node(val);
	}
	
	public AVLtree() {
		   root=null;
		}
	public int getheight(Node node) {
		if(node==null) {
			return -1;
		}
		return node.height;
	}
	
	public void insert(int val) {
        root=insert(root,val);
     }
  
	public int max(int a,int b) {
		   return a>b?a:b;
	}
	
	public Node insert(Node node,int val) {
		if(node==null) {
			return new Node(val);
		}
		
		
		if(val<node.key) {
			node.left=insert(node.left,val);
		}
		else if(val>node.key){
			node.right=insert(node.right,val);
		}
		else {
		return node;
		}
		node.height=1+max(getheight(node.left),getheight(node.right));
		int balfactor=getbalfactor(node);
		//LL case 
		if(balfactor>1 && val<node.left.key) {
			return rightrotate(node);
		}
		//LR case
		if(balfactor>1 && val > node.right.key) {
			node.left= leftrotate(node.left);
			return rightrotate(node);
		}
		// RR case
		if(balfactor<-1 && val > node.right.key) {
			return leftrotate(node);
		}
		//RL case
		if(balfactor<-1 && val<node.right.key) {
			node.right=rightrotate(node.right);
			return leftrotate(node);
		}
		return node;
	}
	
	private Node rightrotate(Node z) {
		Node y = z.left;
		Node t3=y.right;
		
		y.right=z;
		z.left=t3;
		z.height =1+ max(getheight(z.left),getheight(z.right));
		y.height=1+ max(getheight(y.left),getheight(y.right));
		
		return y;
	}
	
	private Node leftrotate(Node z) {
		Node y=z.right;
		Node t3=y.left;
		
		y.left=z;
		z.right=t3;
		z.height =1+ max(getheight(z.left),getheight(z.right));
		y.height=1+ max(getheight(y.left),getheight(y.right));
		
		return y;
		
	}
	
	
	private int getbalfactor(Node node) {
		if(node==null) {
			return 0;
		}
		return getheight(node.left)-getheight(node.right);
	}
	

	public void inOrder(Node root) {
		if(root!=null) {
			inOrder(root.left);
			System.out.print(root.key+" ");
		    inOrder(root.right);
		}
	}
	

}
