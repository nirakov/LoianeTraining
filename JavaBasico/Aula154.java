import java.util.Scanner;
public class Aula154{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira uma letra: ");
		 String letra = sc.next();
		switch(letra){
			case "a": 
			case "e": 
			case "i": 
			case "o":
			case "u": 
			case "A": 
			case "E": 
			case "I": 
			case "O":
			case "U": 
			System.out.print("A letra inserida é uma vogal");break;
			default: 
			System.out.print("Consoante"); 
			}
		
		}

}
