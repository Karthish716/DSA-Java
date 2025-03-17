package sample3;

public class StacksDemos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stacks<Integer> s = new Stacks<Integer>();
		s.push(34);
		s.push(34);
		s.push(23);
		s.push(24);

		System.out.println(s.pop());
		System.out.println(s.peek());
		
	}

}
