import java.util.Scanner;
public class Aula1517{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("informe um ano: ");
		int ano = sc.nextInt();
		
		if ((ano % 4) == 0 && (ano % 100) !=0){
			System.out.print("O ano e bissexto");
			}else if ((ano % 400) == 0){
				System.out.print("O ano e bissexto");
				}else{
					System.out.print("O ano nao e bissexto");
					}
				}
}
