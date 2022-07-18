import java.util.Scanner;
public class Aula1906{
	public static void main(String[]args){
		
		int a[] = new int [10];
		int b[] = new int [10];
		int c[] = new int [10];
		
		int num = 2;
		
		for(int i = 0; i < 10; i++){
			
			a[i] = num;
			num++;
			
			b[i] = a[i] * i; 
			
			c[i] = a[i] + b [i];
			
			System.out.println("Este é o A em " + i + "      " + a[i]);
			System.out.println("Este é o B em " + i + "      " + b[i]);
			System.out.println("Este é o C em " + i + "      " + c[i]);
			System.out.println(" -------- ");
			
			
			}
		
		}
	}
