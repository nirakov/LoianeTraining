import java.util.Scanner;
public class Aula152{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um numero:");
		int num1 = sc.nextInt();
		if (num1 > 0){
			System.out.print("O numero é positivo");	
				}else{
					System.out.print("O numero é negativo");
					}
	}
}
