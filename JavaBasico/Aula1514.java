import java.util.Scanner;
public class Aula1514{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite suas notas: ");
		double nota1 = sc.nextDouble();
		double nota2 = sc.nextDouble();
		double m = (nota1 + nota2) / 2;
		
		if (m >= 0 && m < 4){
			System.out.print("E");
			}	
			
		if (m > 4 && m <= 6){
			System.out.print("D");
			}
			
		if (m > 6 && m <= 7.5){
			System.out.print("C");
			}
			
		if (m > 7.5 && m < 9){
			System.out.print("B");
			}
		if (m > 9 ){
			System.out.print("A");
			}					
		}
}
