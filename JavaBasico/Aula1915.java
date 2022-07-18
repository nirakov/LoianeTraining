import java.util.Scanner;
public class Aula1915{
	public static void main(String[]args){
		
		int a[] = new int [10];
		
		int contadorPar = 0;
		int contadorImpar = 0;
		
		int num = 3;
		
		for(int i = 0; i < 10; i++){
			
			a[i] = num;
			
			num++;
			
			if((a[i] % 2) != 0){
				
				contadorImpar++;
				
				
				}else{
					
					contadorPar++;
					
					}
			
			}
			
			int total = contadorPar + contadorImpar;
			
			double pares = (contadorPar * 100) / total; 
			double impares = (contadorImpar * 100) /total;
			System.out.print("Percentual de pares: " + pares + "%");
			System.out.print("Percentual de impares: " + impares + "%");
			
		
		}
}
