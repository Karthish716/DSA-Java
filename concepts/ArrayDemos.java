package sample3;
import java.util.*;
class Listofarray{
	static final int initialize =  16;
	 int size;
	 int arr[];
	 int capacity;
	
         Listofarray(){	
        	 	size =0;
        	 	arr=new int[initialize];
                 capacity = initialize;
         }
         public void add(int val) {
        	 if(size==capacity) {
        		 expand();
        	 }
        	 arr[size++]= val;
        	 
         }
         
         private void expand(){
        	 capacity *= 2;
        	 arr=java.util.Arrays.copyOf(arr, capacity);
        	 
         }
         
         public void display() {
        	 System.out.println("Elements in the lis : \n");
        	 for(int i=0;i<size;i++) {
        		 System.out.print(arr[i] + " ");
        	 }
         }
         
         public void insertatpos(int pos,int val) {
        	 if(size==capacity) {
        		 expand();
        	 }
        	 for(int i=size-1;i>=pos;i--) {
        		 arr[i+1]=arr[i];
        	 }
        	 arr[pos]=val;
        	 size++;
         }
         private void shrinkArray() {
        	 capacity /=2;
          arr= java.util.Arrays.copyOf(arr, capacity);
         }
         
         public void deleteatpos(int pos) {
        	 for(int i=pos+1;i<size;i++) {
        		 arr[i-1]=arr[i];
        		 size--;
        		 if(capacity >initialize && capacity > 3*size)
        			 shrinkArray();
        		 
        	 }
         }  
         
         
}

public class ArrayDemos {
	public static void main(String[] args) {
		int val,pos;
		Listofarray a = new Listofarray();
		Scanner s = new Scanner(System.in);
		while(true) {
		System.out.println("\n 1.add to end ");
		System.out.println("2.display the list ");
		System.out.println("3.add at position ");
		System.out.println("4.delete at position ");
		System.out.println("5.exit");
		System.out.println("enter the list number   :   ");
		
		
		int enter=s.nextInt();
		
		switch(enter) {
		case 1:{
			System.out.println("enter tne number : ");
			val = s.nextInt();
			if(val<0)
				break;
			
			a.add(val);
			break;
		}
			case 2:{
				a.display();
			break;
			}
			case 3:{
				System.out.println("enter the pos ");
				pos=s.nextInt();
				System.out.println("enter the value");
				val =s.nextInt();
				if(pos<0) {
					System.out.println("invalid pos ");
					break;
				}
                  a.insertatpos(pos, val);
	             break;
				}	
			
			case 4:{
				System.out.println("enter the Delete postion");
			      pos = s.nextInt();
			      if(pos<0) {
			    	  System.out.println("Invalide Position ");
			    	  break;
			      }
			     a.deleteatpos(pos);
			     break;
			}
			case 5:
			{
		     System.exit(0);
				break;
			} 
		default : System.out.println("Invalid position ");
		break;
		
		}
	s.close();
		}

	}

}
