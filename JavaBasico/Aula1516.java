import java.util.Scanner;

public class Aula1516{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("QUAL O VALOR DE A?");
		int a = sc.nextInt();
		System.out.println("QUAL O VALOR DE B?");
		int b = sc.nextInt();
		System.out.println("QUAL O VALOR DE C?");
		int c = sc.nextInt();
		double r1, r2, rdelta;
		
		if (a == 0){
			System.out.println("A equação não é de segundo grau");
					
			}else{
				
				int delta = (b*b)+ (4*a*c);
				rdelta = Math.sqrt(delta);
				
				if (delta < 0){
					System.out.println("A equação nao possui raies reais"); 
					
					}else if (delta == 0){
						System.out.print("A equação possui uma raizes reais: ");
						r1 = (-b + rdelta) / 2;
						System.out.print(r1);
						
						}else{
							System.out.println("A equação possui uma raizes reais: ");
						r1 = (-b + rdelta) / 2;
						System.out.println(r1);
						r2 = (-b - rdelta) / 2;
						System.out.print(r2);
							}
				
				
				
				}
			
		}
}
