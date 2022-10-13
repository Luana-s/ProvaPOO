public class Principal2 {
    public static void main(String[] args) {
        Estacionamento es = new Estacionamento();
        Carro c = new Carro(4, 4, "Uno");
        System.out.println("\n");
        Carro c2 = new Carro(3, 4, "ferrari");
       
        es.estacionar(c); 
        es.estacionar(c2);
        System.out.println("Total de pessoas  dentro do estacionamento: " + es.quantpessoascarro() );
        es.quantcarros();
      
        
    }
}
