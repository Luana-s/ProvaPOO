import java.math.BigDecimal;

import pag.Pagamento;

public  class Compra {
    private BigDecimal preco;


    public Compra(BigDecimal preco){
        this.preco=preco;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco= preco;
    }


    public void MetodoPagamento(Pagamento pagamento){
        pagamento.Pagar(preco);
        

    }

    
} 
