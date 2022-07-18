import java.util.Scanner;

public class Aula2006{
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[][] jogada = new String[3][3];
		

		int turn = 1;
		String sinal = new String();
		boolean proximo = true;

	
		System.out.println("Jogador 1 = x ");
		System.out.println("Jogador 2 = o ");
		System.out.println("---------------");
		
		
		
		// DEFAULT STATE
		
		for(int	i = 0; i < jogada.length; i++){
			for(int j = 0; j < jogada[i].length; j++){
				jogada[i][j] = " ";				
				}
			}
		
		
		// GAME STATE // RECEIVE GAME DATA 
		while(turn < 10 || proximo == false ){
			 		boolean pvalido = false;
					  if((turn % 2 ) == 0){
						  System.out.println("Vez do jogador 2!");	
						  sinal = "o";	  	  
						  } else{
							  System.out.println("Vez do jogador 1!");
							  sinal = "x";
							  }
					    while(!pvalido){
							System.out.print("QUAL LINHA DESEJA JOGAR? ");
							int linha = sc.nextInt();
							System.out.print("QUAL COLUNA DESEJA JOGAR? ");
							int coluna = sc.nextInt();
							if(jogada[linha-1][coluna-1].equals(" ")){
								jogada[linha-1][coluna-1] = sinal;
								pvalido = true;
								turn++;
								
								
								
								
								
System.out.println(" ____  ____  ____ 		");
System.out.println("|    ||    ||	 |		");
System.out.println("| " + jogada[0][0] + "  ||  "+ jogada[0][1] +" || "+ jogada[0][2] +"  |		");
System.out.println("|____||____||____|		");
System.out.println(" ____  ____  ____		");
System.out.println("|    ||    ||    |		");
System.out.println("| "+ jogada[1][0] +"  ||  "+ jogada[1][1] +" ||  "+ jogada[1][2] +" |		");
System.out.println("|____||____||____|		");
System.out.println(" ____  ____  ____		");
System.out.println("|    ||    ||    |		");
System.out.println("|  "+ jogada[2][0] +" ||  "+ jogada[2][1] +" ||  "+ jogada[2][2] +" |		");
System.out.println("|____||____||____|		");
System.out.println("                   		");		

								
								}else{
									System.out.print("JOGADA INVALIDA! TRY AGAIN! ");
									}	
									

									
								
							
			}
			
			
					if((jogada[0][0] == "x" && jogada [0][1] == "x" && jogada[0][2] == "x") ||
		   (jogada[1][0] == "x" && jogada [1][1] == "x" && jogada[1][2] == "x") ||
		   (jogada[2][0] == "x" && jogada [2][1] == "x" && jogada[2][2] == "x") ||			
		   (jogada[0][0] == "x" && jogada [1][0] == "x" && jogada[2][0] == "x") ||			
		   (jogada[0][1] == "x" && jogada [1][1] == "x" && jogada[2][1] == "x") ||			
		   (jogada[0][2] == "x" && jogada [1][2] == "x" && jogada[2][2] == "x") ||			
		   (jogada[0][0] == "x" && jogada [1][1] == "x" && jogada[2][2] == "x") ||
		   (jogada[1][2] == "x" && jogada [2][1] == "x" && jogada[2][0] == "x")){
				
				System.out.println("JOGADOR 1 VENCEU!! ");
				proximo = false;
				break;
				
				}
		if((jogada[0][0] == "o" && jogada [0][1] == "o" && jogada[0][2] == "o") ||
		   (jogada[1][0] == "o" && jogada [1][1] == "o" && jogada[1][2] == "o") ||
		   (jogada[2][0] == "o" && jogada [2][1] == "o" && jogada[2][2] == "o") ||			
		   (jogada[0][0] == "o" && jogada [1][0] == "o" && jogada[2][0] == "o") ||			
		   (jogada[0][1] == "o" && jogada [1][1] == "o" && jogada[2][1] == "o") ||			
		   (jogada[0][2] == "o" && jogada [1][2] == "o" && jogada[2][2] == "o") ||			
		   (jogada[0][0] == "o" && jogada [1][1] == "o" && jogada[2][2] == "o") ||
		   (jogada[1][2] == "o" && jogada [2][1] == "o" && jogada[2][0] == "o")){
				
				System.out.println("JOGADOR 2 VENCEU!! ");
				proximo = false;
				break;
				
				}
		}
		

		
		

		
		
	}
}

