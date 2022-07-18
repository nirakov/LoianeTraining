import java.util.Scanner;
public class Aula1716{
	public static void main(String[]args){
			
		int n =  500;
		
		int primeiro = 1;
		int segundo = 1;
		int proximo;
		
		System.out.print("1, 1, ");

				
		
		for(int i =3; i <= n; i++){
			
			proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;
			
			System.out.print(proximo + ", ");
			
			}
		
				
		
		}
	
	}
