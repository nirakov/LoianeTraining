
public class Lampada {
    private String nome;
    private boolean status;
    private String local;
    
    Lampada( String local){
        this.local = local;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getLocal(){
        return local;
    }

    public void desligar(){
        status = false;
    }

    public void ligar(){
        status = true;
    }

    public boolean getStatus(){
        return status;
    }
    
}
