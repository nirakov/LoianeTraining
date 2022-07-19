package aula35;

public class Somatorio {
    public static int somatorio(int n){
        if (n == 0){
            return 0;
        }
        return n + somatorio(n-1);
    }
}
