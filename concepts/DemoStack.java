package sample;

public class DemoStack {

	public static void main(String[] args) {
             ArrayStack<Integer> stack = new ArrayStack<Integer>();
             stack.push(23);
             stack.push(45);
             stack.push(67);
             stack.push(65);
           for(int i=1;i<=4;i++) {
        	   System.out.println(stack.peek());
           }
           System.out.println(stack.pop());
           System.out.println(stack.peek());
	}

}
