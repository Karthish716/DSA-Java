package sample;
//import java.util.Iterator;
public class Demo  {

	public static void main(String[] args) {
          LinkedList<Integer> list = new LinkedList<Integer>();
                list.insertatbigin(1);      
                list.insertatbigin(2);  
	            list.insertatbigin(3);
	            list.insertatbigin(4);
	            list.insertatbigin(5);
	            list.insertatbigin(6);
	            list.insertatpos(3, 78);
	            list.deleteatpos(5);
                       list.display();
	            System.out.println(" ");
	            list.reverse();
	            list.display();
	         
	            System.out.println("\nThis is list ");
	            for(int a : list) {
	            	
	            	System.out.print(a+" ");
	            }
	            
	          
	            
	} 


}