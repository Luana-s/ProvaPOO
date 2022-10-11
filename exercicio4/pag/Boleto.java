package pag;

import java.math.BigDecimal;

public class Boleto implements Pagamento{

    @Override
    public void Pagar(BigDecimal preco) {
        System.out.println("Efetuando pagamento atraves do Boleto");
        
    }

    @Override
    public void setMetodoPagamento(Boleto boleto) {
        
    }
        
    
}
