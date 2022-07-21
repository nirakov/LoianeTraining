package aula37a43;

public class Peixe extends Animal {
    private String caracteristicas;

    public Peixe(String nome, double comprimento, double velocidade){
        super(nome,comprimento,0,"cinza","Agua",velocidade);
        caracteristicas = "Barbatanas e cauda";
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }
        
    public String getInfo(){
        return super.getInfo() +
        "Caracteristicas: " + caracteristicas + "\n";
    }
}
