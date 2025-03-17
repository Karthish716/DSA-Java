package sample;

public class QueueLinkedListDemo {

	public static void main(String[] args) {
          QueueLinkedList ql = new QueueLinkedList();
          ql.Enqueue(23);
          ql.Enqueue(78);
          ql.Enqueue(43);
          ql.Enqueue(32);
          System.out.println(ql.Dequeue());
          System.out.println(ql.Dequeue());
          System.out.println(ql.Dequeue());
          System.out.println(ql.Dequeue());
          System.out.println(ql.Dequeue());
	}

}
