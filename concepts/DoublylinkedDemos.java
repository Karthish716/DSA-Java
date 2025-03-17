package sample3;

public class DoublylinkedDemos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DoublyLinked dl=new DoublyLinked();
		dl.insertatbig(23);
		dl.insertatbig(34);
		dl.insertatbig(45);
		dl.insertatbig(67);
		dl.insertatbig(89);
		dl.displayd();
		System.out.print("\n");
		
		dl.insertatpos(2, 100);
		dl.displayd();
	    
	}

}
