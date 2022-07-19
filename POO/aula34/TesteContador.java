package aula34;
public class TesteContador {
    public static void main(String[] args) {
        Contador c1 = new Contador();
        System.out.println(c1.getContador());
        Contador.incrementarContador();
        Contador c2 = new Contador();
        System.out.println(c2.getContador());
        Contador.zerarContador();

    }
    
}
