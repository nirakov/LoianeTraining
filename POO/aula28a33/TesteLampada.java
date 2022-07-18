public class TesteLampada {
    public static void main(String[] args) {
        Lampada sala = new Lampada("sala");
        sala.setNome("salinha");
        sala.desligar();
        System.out.println(sala.getStatus());
        sala.ligar();
        System.out.println(sala.getStatus());
        System.out.println(sala.getNome());


        
    }
    
}
