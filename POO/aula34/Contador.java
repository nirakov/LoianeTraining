package aula34;
public class Contador {

    private static int contador;

    Contador(){
        contador++;
    }

    public static void zerarContador(){
        contador = 0;
    }

    public int getContador(){
        return contador;
    }

    public static void incrementarContador(){
        assert contador > 0;
        contador++;
    }
    
}
