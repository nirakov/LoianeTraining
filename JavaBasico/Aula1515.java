import java.util.Scanner;
public class Aula1515{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("DIGITE OS LADOS: ");
		int lado1 = sc.nextInt();
		int lado2 = sc.nextInt();
		int lado3 = sc.nextInt();
		
		if (lado1 == lado2 && lado2 == lado3 ){
			System.out.print("Equilatero");
		 } else if (lado1 != lado2 && lado2 != lado3 && lado3 != lado1){
			System.out.print("Escaleno");
		 }else{
			 System.out.print("Isoceles");
			 }
		 
		
		
		
		
		}
}
