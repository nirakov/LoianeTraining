package aula37a43;

public class TesteImpostoRenda {
    public static void main(String[] args) {
        PessoaJuridica pj1 = new PessoaJuridica("Silvia", 200000);
        PessoaJuridica pj2 = new PessoaJuridica("Ana", 900);
        PessoaJuridica pj3 = new PessoaJuridica("Carmem", 8765);

        PessoaFisica pf1 = new PessoaFisica("Jassinto", 10000);
        PessoaFisica pf2 = new PessoaFisica("Emanoel", 90);
        PessoaFisica pf3 = new PessoaFisica("Olindo",1409);

        pf1.calcularImposto();
        pf2.calcularImposto();
        pf3.calcularImposto();

        pj1.calcularImposto();
        pj2.calcularImposto();
        pj3.calcularImposto();
       
        System.out.println(pj1.getInfo());
        System.out.println(pj2.getInfo());
        System.out.println(pj3.getInfo());

        System.out.println(pf1.getInfo());
        System.out.println(pf2.getInfo());
        System.out.println(pf3.getInfo());


    }
}
