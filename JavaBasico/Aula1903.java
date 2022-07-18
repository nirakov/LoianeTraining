import java.util.Scanner;
public class Aula1903{
	public static void main(String[]args){
		
		int a[] = new int [15];
		int b[] = new int [15];
		
		int num = 1;
		
		for (int i = 0; i < 15; i++){
			
			a[i] = num;
			
			num++;
			
			b[i] = a[i] * a[i];
			
			System.out.println("Este e o a em " + i + " == " + a[i]);
			System.out.println("Este e o b em " + i + " == " + b[i]);
		
			
			
			}
		
		}
	
	}
