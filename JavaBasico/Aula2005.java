import java.util.Scanner;

public class Aula2005{
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[][][] agenda = new String[31][12][24];
		
		System.out.print("DIA: ");
		int dia = sc.nextInt();
		System.out.print("MES: ");
		int mes = sc.nextInt();
		System.out.print("HORA: ");
		int hora = sc.nextInt();
		
		if(agenda[dia][mes][hora] == null){
			System.out.println("NADA AGENDADO");
			System.out.print("DESEJA AGENDAR? ");
			String selector = sc.next();
			if (selector.equals("sim")){
				System.out.print("DIGITE O QUE DEVE SER AGENDADO: ");
				agenda[dia][mes][hora] = sc.next();
				System.out.println(agenda[dia][mes][hora] + " FOI AGENDADO, PARA O DIA " + dia + " DO MES "+ mes +" AS "+ hora + " HORAS! ");
				}
			
			}
		
		
	}
}

