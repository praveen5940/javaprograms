import java.io.*;
import java.util.*;
public class SampleExample{
		public static void main(String[] args) throws IOException{
		
			Scanner sc=new Scanner(System.in);  
			System.out.print("Enter the number of elements you want to store: ");  
			int n=sc.nextInt();  

			int[] array = new int[n];  
			System.out.println("Enter the integer elements of the array: ");  
			for(int i=0; i<n; i++){  			 
				array[i] = sc.nextInt();  
			} 

			String[] array2 = new String[n];
			System.out.println("Enter the string elements of the array: ");
			for(int j = 0; j<n;j++){
				array2[j] = sc.nextLine();
			}
			 
			System.out.println("Array integer elements are: ");  
			for (int a=0; a<n; a++)	{  
				System.out.println(array[a]);  		
			}
			 
			System.out.println("Array string elements are: ");  
			for (int b=0; b<n; b++)	{  
				System.out.println(array2[b]);  		
			}		

	 }
}



