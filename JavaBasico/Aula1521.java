import java.util.Scanner;
public class Aula1521{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double total;
		
		System.out.println("Deseja gasolina (g) ou alcool (a)?");
		String tipo = sc.next();
		System.out.println("Quantos litros voce deseja?");
		double litros = sc.nextDouble();
		
		switch (tipo){
			case "g":
			 if (litros < 20){
				 
				 total = (2.5 * litros) - (0.04 * litros);
				 
				 }else{
					 
					  total = (2.5 * litros) - (0.06 * litros);
					 }
			System.out.print(total);
			break;
			
			case "a":
			
			if (litros < 20){
			
			total = (1.9 * litros) - (0.03 * litros);
				 
				 }else{
					 
					  total = (1.9 * litros) - (0.05 * litros);
					 }
			
			System.out.print(total);
			
			break;
			
			default: System.out.print("");
			}

}
}
