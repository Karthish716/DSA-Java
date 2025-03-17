package sample;

public class QueueArraydemo1 {

	public static void main(String[] args) {
		QueueArray qa = new QueueArray();
		QueueArray2 qa2 = new QueueArray2();
		qa.Enqueue(32);
		qa.Enqueue(89);
		qa.Enqueue(31);
		qa.Enqueue(43);
	
		System.out.println(qa.Dequeue());
qa2.Enqueue(23);
qa2.Enqueue(45);
qa2.Enqueue(899);
System.out.println(qa2.Dequeue());
	}

}
