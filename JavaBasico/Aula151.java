import java.util.Scanner;
public class Aula151{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite dois numeros:");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		if (num1 > num2){
			System.out.print(num1 + " e maior que" + num2);	
			} else if (num2 > num1 ){
				System.out.print(num2 + " e maior que " + num1);
				}else{
					System.out.print("Os numeros são iguais");
					}
		
		}
	}
