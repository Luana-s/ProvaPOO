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


    public double valorCompra(){
        return boloDecorator.valorCompra(); 

    }

    public String listarProdutos(){
        return boloDecorator.listarProdutos();

    }
    
    public Comprar getBolo(){
        return boloDecorator;
    }  
}
