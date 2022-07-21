package aula37a43;

public class JardimZoologico {
    public static void main(String[] args) {
        Mamifero camelo = new Mamifero("Camelo", 150, "Amarelo", 2.0, "");
        Peixe tubarao = new Peixe("Tubarao", 300, 1.5);
        Mamifero ursoDoCanada = new Mamifero("Urso do Canada", 180, "Vermelho", 0.5, "Mel");


        System.out.print(camelo.getInfo());
        System.out.print(tubarao.getInfo());
        System.out.print(ursoDoCanada.getInfo());


    }
    
}
