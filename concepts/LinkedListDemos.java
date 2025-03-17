package sample3;

public class LinkedListDemos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Linkedlist1<Integer> l = new Linkedlist1<Integer>();
            l.insertatbig(23);
            l.insertatbig(56);
            l.insertatbig(78);
            l.display();
            l.insertatpos(1, 45);
            
            System.out.println(" \n");
            l.deletatpos(2);
            l.display();
            System.out.println(" this is reversed ------------------\n");
            l.reverselist();
            l.display();
            System.out.println(" this is reversed ------------------\n");
            l.reverselist();
            l.display();
	}

}
