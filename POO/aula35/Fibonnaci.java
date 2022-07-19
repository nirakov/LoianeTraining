package aula35;

public class Fibonnaci {

    public static int fibonnaci(int n){
        int[] sequencia = new int[n];
        sequencia[0] = 0;
        sequencia[0] = 1;
        sequencia[1] = 2;
        for(int i = 2; i < n; i++){
            sequencia[i] = sequencia[i-1] + sequencia[i-2];
        }
        return sequencia[n-1];
    }

    public static int fibonnaciRecursivo(int n){
        if(n < 2){
            return 1;
        }
        return fibonnaciRecursivo(n-1) + fibonnaciRecursivo(n-2);
    }
    
}
