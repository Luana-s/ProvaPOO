package pag;

import java.math.BigDecimal;

public class Pix implements Pagamento{
    
    @Override
    public void Pagar(BigDecimal preco) {
        System.out.println("Efetuando pagamento atraves do Pix ");
        
    }

    @Override
    public void setMetodoPagamento(Boleto boleto) {
       
    }
    
}
