import java.util.Scanner;
public class Aula173{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		//nome

		boolean validadeN = false;

		do{
			
			System.out.println("Name: ");
			String nome = sc.next();
			
			int tamanho = nome.length();
			
			if (tamanho > 3){
				
				validadeN = true; 
				}else{
					System.out.println("Invalid name, must have more then 3 characters! ");
					System.out.println("Try again!");
					System.out.println("      ");
				}
					
			}while (validadeN == false);


//idade
			boolean validadeI = false;

		do{
			
			System.out.println("Digite sua idade: ");
			int idade = sc.nextInt();		
			if (idade > 0 && idade < 150) {
				
				validadeI = true; 
				}else{
					System.out.println(" Idade invalida, tente novamente! ");
					System.out.println("      ");
				}
					
			}while (validadeI == false);

// salário 

	boolean validadeS = false;

		do{
			
			System.out.println("Salario: ");
			double salario = sc.nextDouble();
			
			if (salario > 0){
				
				validadeS = true; 
				
				}else{
					System.out.println("Invalid input! ");
					System.out.println("Try again!");
					System.out.println("      ");
				}
					
			}while (validadeS == false);

// genero 

	boolean validadeG = false;

		do{
			
			System.out.println("Gender: ");
			String genero = sc.next();
			
			switch (genero){
				 case "f":
				 case "m":
				 validadeG = true;
				 break;
				 default: 
					System.out.println("Invalid input! ");
					System.out.println("Try again!");
					System.out.println("      ");
					break;
				}	 
				
				}while (validadeG == false); 
			
// Estado Civil

			boolean validadeEC = false;

		do{
			
			System.out.println("Estado civil: ");
			String estadoC = sc.next();
			
			switch (estadoC){
				 case "s":
				 case "c":
				 case "v":
				 case "d":
				 validadeEC = true;
				 break;
				 default: 
					System.out.println("Invalid input! ");
					System.out.println("Try again!");
					System.out.println("      ");
					break;
				}	 
				
				}while (validadeEC == false); 
				
				
				System.out.println("");
				System.out



		}
	
	}
