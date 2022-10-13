package exercicio1.product;

import exercicio1.Comprar;

public class BoloChocolate extends BoloDecorator implements Comprar{
  

    public BoloChocolate(Comprar bolo) {
        super(bolo);
    }

    @Override
    public String adicionarProduto() {
        return super.adicionarProduto() + "Cobertura de Chocolate, ";
            
    }
    @Override
    public double ValorCompra() {
        return super.ValorCompra() + 20;      
    }
    
    @Override
    public String ListarProdutos() {
        return("Preco:" + ValorCompra() + ", Items: , " + adicionarProduto());
        
    }
}
