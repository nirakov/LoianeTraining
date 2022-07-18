import java.util.Scanner;
public class Aula1510{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual turno voce estuda ");
		String turno = sc.next();
		switch (turno){
			case "M":
			case "m": System.out.print("bom dia!"); break;
			case "T":
			case "t": System.out.print("boa tarde!"); break;
			case "N":
			case "n": System.out.print("boa noite!"); break;
			default: System.out.print("Letra invalida!"); 

			}
	}}
		
