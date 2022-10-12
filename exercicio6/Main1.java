public class Main1 {
    public static void main(String[] args) {
        
        ContaCorrente conta1 = new ContaCorrente("Peter", 12313);
        ContaEspecial conta2 = new ContaEspecial("Teobaldo", 500, 55456);
    
        conta1.Depositar(500);
        conta1.transferir(550);
        conta1.Sacar(400);

        conta2.Depositar(1500);
        conta2.transferir(550);
        conta2.Sacar(500);

        
        System.out.println(conta1.toString());
        System.out.println(conta2.toString());
    }

    
}
