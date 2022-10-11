package pag;

import java.math.BigDecimal;

public class CartaoDeCredito implements Pagamento {

    @Override
    public void Pagar(BigDecimal preco) {
        System.out.println("Efetuando pagamento atraves do Cartao de Credito");
        
    }

    @Override
    public void setMetodoPagamento(Boleto boleto) {
       
    }
    
}
