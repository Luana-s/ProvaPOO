public class Principal2 {
    public static void main(String[] args) {
        Estacionamento es = new Estacionamento();
        Carro c = new Carro(5, 5, "Uno");
        Carro c2 = new Carro(4, 4, "ferrari");
        es.estacionar(c);
        es.estacionar(c2);
        es.quantpessoascarro();
        es.quantcarros();
    }
}
