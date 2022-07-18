import java.util.Scanner;
public class Aula1731{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Contratado em: ");
		int ano = sc.nextInt();
		System.out.print("Salario inicial: ");
		double inicial = sc.nextDouble();
		
		double novo = inicial;
		double p = 0.0015;
		double aumento = 0;


		 do{
		 
		 if (ano < 1997){
			 
			 aumento = p * novo;
			 novo = novo + aumento;		 
			 
			 }
			 
		 if (ano > 1996){
			 
			 p *= 2;
			 aumento = p * novo;
			 novo = novo + aumento;	
			
			
			}	 
		
		ano++; 	
		
		DecimalFormat format = new DecimalFormat("####,####.##");
		
		System.out.println(ano + " " + format.format(salario) + novo);
			
		}while (ano <= 2020);	
		 
		 
		
			
					
		}
	}
