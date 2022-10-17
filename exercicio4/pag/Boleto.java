package pag;

import java.math.BigDecimal;

public class Boleto implements Pagamento{

    @Override
    public void pagar(BigDecimal preco) {
        System.out.println("Efetuando pagamento atraves do Boleto");
        
    }   
}
