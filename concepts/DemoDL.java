package sample;

public class DemoDL {

	public static void main(String[] args) {
		DoublyLinkedList<Integer> dl = new DoublyLinkedList<Integer>();
		dl.insertatbigin(45);
		dl.insertatbigin(23);
		dl.insertatbigin(65);
		dl.insertatbigin(78);
		dl.display();
		dl.insertatpos(4, 655);
		System.out.println(" ");
		dl.deleteatpos(0);
		dl.displayRev();
	
	
	}

}
