import java.util.Scanner;
public class Aula153{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Qual seu gênero? ");
		String gen = sc.next();
		switch(gen){
			case "f": 
			System.out.print("F para Feminino");break;
			case "m": 
			System.out.print("M para Masculino");break;
			default: 
			System.out.print("Sexo Inválido"); 
			}
		
		}

}
