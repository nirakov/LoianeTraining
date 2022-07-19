package aula36;

public class Agenda {
    String nome;
    Contato[] contatos;

    public Contato[] getContatos() {
        return contatos;
    }
    public void setContatos(Contato[] contatos) {
        this.contatos = contatos;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String obterInfo(){
        String info = " ";
        for(Contato c : contatos){
            info += c.obterInfo() + "\n";
        }
        return info;
    }
    
}
