import java.util.Scanner;
public class Aula1902{
	public static void main(String[]args){
		int a[] = new int [8];
		int b[] = new int [8];
		
		int elemento = 1;
		
		for (int i = 0; i < 8; i++){
			
			a[i] = elemento;
			b[i] = 2 * a[i];
			
			elemento++;
			
			System.out.println(a[i]);
			System.out.println(b[i]);
			
			}
		
		
		}
	
	}
