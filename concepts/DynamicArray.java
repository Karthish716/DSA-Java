package sample;
import java.util.Scanner;


class Dyarray{
	private static final int initial= 16;
	private int arr[];
	private int size;
	private int capacity;
	
	Dyarray()
	{
		size =0;
		arr = new int[initial];
		capacity = initial;
		
	}
	
	public void insertadd(int val){
		if (size==capacity)
			expandarray();
		    arr[size++]=val;
		    
		 
	}
		
		private void expandarray()
		{
			capacity *=2;
			arr= java.util.Arrays.copyOf(arr,capacity);
			
		}
		
		public void display()
		{
			System.out.println("Elements are ");
			for(int i=0;i<=size;i++)
			{
				System.out.println(arr[i]+" ");
			}
		}
		
		public void insertposition(int pos,int val)
		{
			if (size==capacity)
				expandarray();
			for(int i= size-1;i>=pos;i--)
			{
			arr[i+1] = arr[i];
			}
			arr[pos]=val;
			size++;
			
		}
		public void Deleteposition(int pos)
		{
			for(int i= pos+1;i<size;i++)
				arr[i-1] =arr[i];
			size--;
			if(capacity > initial && capacity > 3*size )
				shrinkarray();
		}
		
		private void shrinkarray()
		{
			capacity /=2;
			arr = java.util.Arrays.copyOf(arr,capacity);
		}
		
	}
		
	

public class DynamicArray {

	public static void main(String[] args) {
		int val;
		int pos;
		try (Scanner k = new Scanner(System.in)) {
			Dyarray list = new Dyarray();
			while(true) {
			System.out.println("--------List the Menu-----------\n");
			System.out.println("1.Insert at end\n");
			System.out.println("2.Display the list");
			System.out.println("3.Insert at specific position\n");
			System.out.println("4.Delet from specific position\n");
			System.out.println("5.Exit\n");
			System.out.println("Enter your list number\t");
			int n= k.nextInt();
			switch(n)
			{
			case 1:
				System.out.println("Enter your insert ");
				val= k .nextInt();
				list.insertadd(val);
				break;
			case 2:
				list.display();
				break;
			case 3:
				
				System.out.println("Enter your insert positon start from 0 : ");
				pos = k.nextInt();
				if(pos<0)
				{
					System.out.println("Invalide position");
				}
				else {
				System.out.println("Enter the data: ");
				val = k.nextInt();
				list.insertposition(pos,val);
				}
				break;
			case 4:
				System.out.println("Enter your Delete positon start from 0 : ");
				pos = k.nextInt();
				if(pos<0)
				{
					System.out.println("Invalide position");
				}
				else {
				list.Deleteposition(pos);
				}
				break;
			case 5:
				System.exit(0);
				default: System.out.println("INvalid choise ");			
			
			}
			}
		}

	}

}
