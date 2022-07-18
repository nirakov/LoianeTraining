import java.util.Scanner;
public class Aula1513{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero");
		int num = sc.nextInt();
		
		switch(num){
			case 1: System.out.print("dom"); break;
			case 2: System.out.print("seg"); break;
			case 3: System.out.print("ter"); break;
			case 4: System.out.print("qua"); break;
			case 5: System.out.print("qui"); break;
			case 6: System.out.print("sex"); break;
			case 7: System.out.print("sab"); break;
			default: System.out.print(" numero invalido ");
			
			}
		
		
		
		}
}
