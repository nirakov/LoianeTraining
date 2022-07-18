import java.util.Scanner;
public class Aula1914{
	public static void main(String[]args){
		
		int a[] = new int [10];
		
		int contador = 0;
		
		int soma = 0;
		
		for(int i = 0; i < 10; i++){
			
			a[i] = i;
			
			if((a[i] % 2) != 0){
				
				contador++;
				
				soma = soma + a[i];
				
					
				}
			
			}
			double media = soma / contador;
			System.out.print(media);
		
		
		}
}
