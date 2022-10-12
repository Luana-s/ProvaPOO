package exercicio1;

public abstract class BoloDecorator {
    private final Bolo boloDecorator;


    public BoloDecorator(Bolo bolo){
        this.boloDecorator=bolo;

    }
    public String adicionarItem(){
        return boloDecorator.adicionarItem(); 
    }

    public String adicionarCarrinho(){
        return boloDecorator.adicionarCarrinho();
    }

    public double ValorCompra(){
        return boloDecorator.ValorCompra(); 

    }

    public String ListarProdutos(){
        return ListarProdutos();

    }

    
}
