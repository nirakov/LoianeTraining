import java.util.Scanner;
public class Aula1916{
	public static void main(String[]args){
		
		int a[] = new int [10];		
		int num = 10;
		int soma = 0;
		int contador = 0;
		int somaiores = 0;
		int mediamaior = 0;
		int contadormaior = 0;
		
		
		
		
		for (int i = 0; i < 10; i++){
			
			a[i] = num;
			num++;
			
			if (a[i] < 15){
				
				soma = soma + a[i];
				contador++;
				
				}else{
					
					somaiores = somaiores + a[i];
					contadormaior++; 
					
					}
			
			}		
		
		  
		  mediamaior = somaiores / contadormaior;
		  
		  System.out.println(" Menores que 15 ... Soma: " + soma + " .... Quantos: " + contador);
		   System.out.println(" Maiores que 15 ... media:  " + mediamaior);
		  
				
				
		
		}
}
