import java.util.Scanner;
public class Aula1519{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("entre com um numero: ");
		int num1 = sc.nextInt();
		System.out.println("entre com outro numero: ");
		int num2 = sc.nextInt();
		System.out.println("qual operacao voce deseja realizar? ");
		String op = sc.next();
		int resultado;
		boolean okay = true;
		
		switch (op){
			case "+":
			resultado = num1 + num2;
			break;		
				
			case "-":
			resultado = num1 - num2;
			break;	
				
			case "*":
			resultado = num1 * num2;
			break;	
					
			case "/":
			resultado = num1 / num2;
			break; 
			
			default: System.out.println("Operacao invalida!");
			okay = false;
			resultado = 0;
			
			}
			
			if (okay == true){
			System.out.println("O resultado e: " + resultado);
			if (resultado < 0 ){
				System.out.println("O resultado e negativo");
				}else if (resultado == 0){
					System.out.println("O resultado e igual a zero");
					}else{
						System.out.println("O resultado é positivo");
						}
			if ((resultado % 2)==0 && resultado != 0){
				System.out.println("O resultado e par");
				}else{
					System.out.println("o resultado e impar");
					}		
				}	
						
		}
}
