package aula36;
import java.util.Scanner;
public class TesteAgenda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Agenda iphone = new Agenda();
        System.out.print("Nome para a agenda: ");
        iphone.setNome(sc.next());

        Contato[] listinha = new Contato[3];
        String nome = "";
        String email = "";
        String telefone = "";

        for(int i = 0; i < 3; i++){
            Contato contatinho = new Contato();
            System.out.println("Nome: ");
            nome = sc.next();
            contatinho.setNome(nome);        
            System.out.println("E-mail: ");
            email = sc.next();
            contatinho.setEmail(email);
            System.out.println("Telefone: ");
            telefone = sc.next();
            contatinho.setTelefone(telefone);
            listinha[i] = contatinho;
        }
        iphone.setContatos(listinha);

        System.out.print(iphone.obterInfo());

        sc.close();      
    }   
}
