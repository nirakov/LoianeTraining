package aula2527;

import java.util.Scanner;
public class RunJogoDaVelha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        JogoDaVelha jogo = new JogoDaVelha();
        jogo.criaTabuleiro();
        int linha;
        int coluna;
        int jogadas = 0;
        String letra = "";

        while (jogadas <= 9){  
            if(jogadas % 2 == 0){
                System.out.println(" JOGADOR 1 - X");
                letra = "X";
            }else{
                System.out.println(" JOGADOR 2 - O");
                letra = "O";
            }
            System.out.print("LINHA: ");
            linha = sc.nextInt();
            System.out.print("COLUNA: ");
            coluna = sc.nextInt();
            jogo.fazerJogada(linha,coluna,letra);
            jogadas++;
        }
    sc.close();
}
}
