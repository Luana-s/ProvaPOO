package pag;

import java.math.BigDecimal;

public class CartaoDeCredito implements Pagamento {

    @Override
    public void pagar(BigDecimal preco) {
        System.out.println("Efetuando pagamento atraves do Cartao de Credito");
        
    }
    
}
