package pag;

import java.math.BigDecimal;

public interface Pagamento{
    public void Pagar(BigDecimal preco);

    public void setMetodoPagamento(Boleto boleto);
}