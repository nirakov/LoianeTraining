import java.util.Scanner;
public class Aula1905{
	public static void main(String[]args){
		
		int a[] = new int [10];
		int b[] = new int [10];
		
		int num = 5;
		
		for(int i = 0; i < 10; i++){
			
			a[i] = num;
			num = num * 5;
			
			b[i] = a[i] * i; 
			
			System.out.println("Este é o A em " + i + "      " + a[i]);
			System.out.println("Este é o B em " + i + "      " + b[i]);
			System.out.println(" -------- ");
			
			
			}
		
		}
	}
