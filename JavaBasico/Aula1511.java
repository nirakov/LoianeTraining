import java.util.Scanner;
public class Aula1511{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu salario");
		double sal = sc.nextDouble();
		double nsal; 
		double ajuste;
		double aumento;
		
		
		
		if (sal <= 280){
			System.out.println("Seu salario atual e:");
			System.out.println(sal);
			
			ajuste = 0.2;
		    System.out.println("Ajusde de: ");
			System.out.println(ajuste);
			aumento = sal * ajuste;
			
			System.out.println(aumento);
			System.out.println("Aumento de: ");
			
			nsal = sal + aumento;
			System.out.println("Novo salário: ");
			System.out.println(nsal);
			
			
			}
		if ( 280 < sal && sal < 700){
			
			System.out.println("Seu salario atual e:");
			System.out.println(sal);
			
			ajuste = 0.15;
			System.out.println("Ajusde de: ");
			System.out.println(ajuste);
			
			aumento = sal * ajuste;
			System.out.println("Aumento de: ");
			System.out.println(aumento);
			
			nsal = sal + aumento;
			System.out.println("Novo salário: ");
			System.out.println(nsal);
			
			
			}
		if (700 <= sal && sal < 1500){
			
			System.out.println("Seu salario atual e:");
			System.out.println(sal);
			
			ajuste = 0.1;
			System.out.println("Ajusde de: ");
			System.out.println(ajuste);
			
			
			aumento = sal * ajuste;
			System.out.println("Aumento de: ");
			System.out.println(aumento);
			
			nsal = sal + aumento;
			System.out.println("Novo salário: ");
			System.out.println(nsal);			
			
			
			}else if(sal >= 1500){
				
			System.out.println("Seu salario atual e:");	
			System.out.println(sal);
			
			ajuste = 0.05;
			System.out.println("Ajusde de: ");
			System.out.println(ajuste);
			
			aumento = sal * ajuste;
			System.out.println("Aumento de: ");
			System.out.println(aumento);
			
			
			nsal = sal + aumento;
			System.out.println("Novo salário: ");
			System.out.println(nsal);				
				
				}		
		
	}}
	
