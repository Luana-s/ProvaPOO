import java.math.BigDecimal;

import pag.Boleto;
import pag.CartaoDeCredito;
import pag.Pix;

public class Main {
  
   
    public static void main(String []args) {
        Usuario maria = new Usuario("Maria");
        maria.logar();

       
        BigDecimal preco = new BigDecimal("100");
        Compra compra = new Compra(preco);
        compra.metodoPagamento(new Boleto());

        Usuario Luana = new Usuario("Luana");
        Luana.logar();

       
        BigDecimal preco1 = new BigDecimal("50");
        Compra compra1 = new Compra(preco1);
        compra1.metodoPagamento(new Pix());

        System.out.println("\n");

        System.out.println("-----trocando metodo de Pagamento------" );
        System.out.println("\n");
        maria.logar();
        compra.metodoPagamento(new Pix());
        compra.metodoPagamento(new CartaoDeCredito());

        System.out.println("\n");
        Luana.logar();
        compra.metodoPagamento(new CartaoDeCredito());



        
    }

    

    
    
}
