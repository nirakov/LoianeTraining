import java.util.Scanner;
public class Aula172{
	public static void main(String[]args){
	
	Scanner sc = new Scanner(System.in);
	boolean igual = true;
	
	do{
		System.out.println("USER: ");
		String user = sc.next();
		System.out.println("PASS: ");
		String pass = sc.next();
		
				
		if (pass.equalsIgnoreCase(user)){
			igual = true;
			System.out.println("USER = PASS");
			System.out.println("Digite novamente...");
			
		}else{
				igual = false;
				System.out.println("OKAY!");
				}
			
				
		}while (igual == true);

















	
		}
	
	}
