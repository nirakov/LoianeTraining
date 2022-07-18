import java.util.Scanner;
public class Aula1520{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int score = 0;		
		System.out.println("Telefou para a vitma?");
		boolean q1 =sc.nextBoolean();
		if (q1 == true){
			score++;
			}
		System.out.println("esteve no local do crime?");
		boolean q2 =sc.nextBoolean();
		if (q2 == true){
			score++;
			}
		System.out.println("mora perto da vitma?");
		boolean q3 =sc.nextBoolean();
		if (q3 == true){
			score++;
			}
		System.out.println("devia para a vitma?");
		boolean q4 =sc.nextBoolean();
		if (q4 == true){
			score++;
			}
		System.out.println("ja trabalhou com a vitma?");
		boolean q5 =sc.nextBoolean();
		if (q5 == true){
			score++;
			}
			
	   switch (score){
		   case 0:
		   case 1: System.out.println("Inocente"); break;
		   case 2: System.out.println("Suspeita"); break;
		   case 3: 
		   case 4: System.out.println("Cumplice"); break;
		   case 5: System.out.println("Assasino"); break;
		   }
			
			
	
		}
}
