import java.util.Scanner;
public class Aula1523{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println(" qual o tipo de carne? ");
		String tipo1 = sc.next();
		String tipo2 = sc.next();	
		double total = 0;
		double totalfile = 0; 
		double totalalcatara = 0; 
		double totalpicanha = 0;
		
		
		
		if (tipo1 == "file duplo"  || tipo2 == "file duplo" ){
			System.out.println(" quantos kg de file duplo? ");	
		    double kgfileduplo = sc.nextDouble();
			 if (kgfileduplo < 5){
				 
				totalfile = 4.9 * kgfileduplo;
				 
				 }else{
					 
				totalfile = 5.8 * kgfileduplo;
					 
					 }
			
			}
			
		if (tipo1 == "alcatara"  || tipo2 == "alcatara" ){
			
			System.out.println(" quantos kg de alcatara? ");	
		    double kgalcatara = sc.nextDouble();
			 if (kgalcatara < 5){
				 
				totalalcatara = 5.9 * kgalcatara;
				 
				 }else{
					 
					totalalcatara = 6.8 * kgalcatara;
			
			}
			
		if (tipo1 == "picanha"  || tipo2 == "picanha" ){
			
			System.out.println(" quantos kg de picanha? ");	
		    double kgpicanha = sc.nextDouble();
			 if (kgpicanha < 5){
				 
				totalpicanha = 6.9 * kgalcatara;
				 
				 }else{
					 
					  totalpicanha = 7.8 * kgalcatara;		
			}
			
			}
					
	    total = totalfile + totalalcatara + totalpicanha;
		System.out.print("Cartao tabajara?");
		boolean cartao = sc.nextBoolean();	
			if (cartao == true ){
				total = total * 0.95;
				System.out.print("Seu total e de: " + total);	
				}else{
				System.out.print("Seu total e de: " + total);	
					}
		
		}
}}
