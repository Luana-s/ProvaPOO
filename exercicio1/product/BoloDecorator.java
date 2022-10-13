package exercicio1.product;

import exercicio1.Comprar;

public abstract class BoloDecorator {
    private final Comprar boloDecorator;


    public BoloDecorator(Comprar bolo){
        this.boloDecorator=(Comprar) bolo;

    }
    public String adicionarProduto(){
        return boloDecorator.adicionarProduto(); 
    }


    public double ValorCompra(){
        return boloDecorator.ValorCompra(); 

    }

    public String ListarProdutos(){
        return boloDecorator.ListarProdutos();

    }

    
    public Comprar getBolo(){
        return boloDecorator;
    }  
}
