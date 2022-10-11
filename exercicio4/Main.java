import java.math.BigDecimal;

import pag.Boleto;
import pag.CartaoDeCredito;
import pag.Pix;

public class Main {
  
   
    public static void main(String []args) {
        Usuario maria = new Usuario("Maria");
        maria.Logar();

       
        BigDecimal preco =new BigDecimal("100");
        Compra compra=new Compra(preco);
        compra.MetodoPagamento(new Boleto());

        Usuario Luana = new Usuario("Luana");
        Luana.Logar();

       
        BigDecimal preco1 =new BigDecimal("50");
        Compra compra1=new Compra(preco);
        compra.MetodoPagamento(new Pix());

        System.out.println("\n");

        System.out.println("-----trocando metodo de Pagamento------" );
        System.out.println("\n");
        maria.Logar();
        compra.MetodoPagamento(new Pix());
        compra.MetodoPagamento(new CartaoDeCredito());

        System.out.println("\n");
        Luana.Logar();
        compra.MetodoPagamento(new CartaoDeCredito());



        
    }

    

    
    
}
