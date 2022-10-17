class Carro{
    int quantPessoas;
    String tipoCarro;
    int quantMaxima;

    public Carro(int quantPessoas, int quantMaxima, String tipoCarro){ 
        this.quantPessoas = quantPessoas;
            this.quantMaxima = quantMaxima;
            this.tipoCarro = tipoCarro;     
        if (quantPessoas > quantMaxima){
            
            System.out.println("Não é permitido essa quantidade de pessoas no carro!");
            
           
        }
          
    }
    public int getQuantPessoas(){
        return quantPessoas;
    }
    public int getQuantMaxima(){
        return quantMaxima;
    }
    public String getTipoCarro(){
        return tipoCarro;
    }
    public void setQuantPessoas(int quantPessoas){
        this.quantPessoas = quantPessoas;
    }
    public void setQuantMaxima(int quantMaxima){
        this.quantMaxima = quantMaxima;
    }
    public void setTipoCarro(String tipoCarro){
        this.tipoCarro = tipoCarro;
    }
    public String toString(){
       return "Quantidade de Pessoas dentro do carro: " + quantPessoas + ",\n quantidade maxima de pessoas dentro do carro: " + quantMaxima + ",\n Tipo do carro: " + tipoCarro;
    }
}