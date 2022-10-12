public class main1 {
    public static void main(String[] args) {
        Cliente nome = new Cliente("Luana");
        ContaCorrente contac = new ContaCorrente("Peter", 12313);
        ContaEspecial contae = new ContaEspecial("Teobaldo", 500, 55456);
        nome.cliente("Luana");
        contac.Depositar(500);
        contac.transferir(550);
        contac.Sacar(400);

        
        System.out.println(contac.toString());
        System.out.println(contae.toString());
    }
}
