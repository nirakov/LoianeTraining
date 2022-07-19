package aula35;

public class Potencia {
    
    public static int potencia(int n, int p){
        if(p == 0){
            return 1;
        }
        return n * potencia(n, p-1);
    }
    
}
