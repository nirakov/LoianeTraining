package aula25a27;

public class JogoDaVelha {
    String jogada;
    int linha;
    int coluna;
    String[][] tabuleiro = new String[3][3] ;
    int numJogadas = 0;

    // criar tabuleiro
   void criaTabuleiro(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j<3;j++){
                tabuleiro[i][j] = "[ ]";
            }
        }    
    }

    //printTabuleiro
    void printTabuleiro(){
        for(int i = 0; i < 3; i++){
            System.out.printf("%n");
            for(int j = 0; j<3;j++){
                System.out.print(tabuleiro[i][j]);
            }
        }
        System.out.printf("%n");
    }    

    // verificar jogada
    boolean verificarJogada(String jogada){
        jogada.toUpperCase();
        assert jogada == "X" || jogada == "O";
        return true;
    }

    // fazer jogada
    void fazerJogada(int linha, int coluna, String jogada){
        assert numJogadas < 9;
        verificarJogada(jogada);
        assert linha <= 3 && coluna <= 3;
        tabuleiro[linha-1][coluna-1] = "[" + jogada + "]";
        numJogadas++;
        printTabuleiro();
        verificarVencedor();
    }

    // verificar vencedor
    void verificarVencedor(){
        if((tabuleiro[0][0] == "[X]" && tabuleiro [0][1] == "[X]" && tabuleiro[0][2] == "[X]") || 
		   (tabuleiro[1][0] == "[X]" && tabuleiro [1][1] == "[X]" && tabuleiro[1][2] == "[X]") ||
		   (tabuleiro[2][0] == "[X]" && tabuleiro [2][1] == "[X]" && tabuleiro[2][2] == "[X]") ||			
		   (tabuleiro[0][0] == "[X]" && tabuleiro [1][0] == "[X]" && tabuleiro[2][0] == "[X]") ||			
		   (tabuleiro[0][1] == "[X]" && tabuleiro [1][1] == "[X]" && tabuleiro[2][1] == "[X]") ||			
		   (tabuleiro[0][2] == "[X]" && tabuleiro [1][2] == "[X]" && tabuleiro[2][2] == "[X]") ||			
		   (tabuleiro[0][0] == "[X]" && tabuleiro [1][1] == "[X]" && tabuleiro[2][2] == "[X]") ||
		   (tabuleiro[1][2] == "[X]" && tabuleiro [2][1] == "[X]" && tabuleiro[2][0] == "[X]")){		
			System.out.println("JOGADOR 1 VENCEU!! ");			
				}else if((tabuleiro[0][0] == "[O]" && tabuleiro [0][1] == "[O]" && tabuleiro[0][2] == "[O]") ||
		                 (tabuleiro[1][0] == "[O]" && tabuleiro [1][1] == "[O]" && tabuleiro[1][2] == "[O]") ||
		                 (tabuleiro[2][0] == "[O]" && tabuleiro [2][1] == "[O]" && tabuleiro[2][2] == "[O]") ||			
		                 (tabuleiro[0][0] == "[O]" && tabuleiro [1][0] == "[O]" && tabuleiro[2][0] == "[O]") ||			
		                 (tabuleiro[0][1] == "[O]" && tabuleiro [1][1] == "[O]" && tabuleiro[2][1] == "[O]") ||			
		                 (tabuleiro[0][2] == "[O]" && tabuleiro [1][2] == "[O]" && tabuleiro[2][2] == "[O]") ||			
		                 (tabuleiro[0][0] == "[O]" && tabuleiro [1][1] == "[O]" && tabuleiro[2][2] == "[O]") ||
		                 (tabuleiro[1][2] == "[O]" && tabuleiro [2][1] == "[O]" && tabuleiro[2][0] == "[O]")){
						System.out.println("JOGADOR 2 VENCEU!! ");
				}else if (numJogadas == 9){
                    System.out.print("EMPATE!");
                }
    }
}