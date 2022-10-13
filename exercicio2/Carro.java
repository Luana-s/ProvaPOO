class Carro{
    int quantpessoas;
    String tipocarro;
    int quantmaxima;

    public Carro(int quantpessoas, int quantmaxima, String tipocarro){      
        if (quantpessoas > quantmaxima){
            this.quantpessoas = quantpessoas;
            this.quantmaxima = quantmaxima;
            this.tipocarro = tipocarro;
            System.out.println("Não é permitido essa quantidade de pessoas no carro");
        }
    }
    public int getQuantpessoas(){
        return quantpessoas;
    }
    public int getQuantmaxima(){
        return quantmaxima;
    }
    public String getTipocarro(){
        return tipocarro;
    }
    public void setQuantpessoas(int quantpessoas){
        this.quantpessoas = quantpessoas;
    }
    public void setQuantmaxima(int quantmaxima){
        this.quantmaxima = quantmaxima;
    }
    public void setTipocarro(String tipocarro){
        this.tipocarro = tipocarro;
    }
    public String toString(){
        return "Quantidade de Pessoas: " + quantpessoas + ",\n quantidade maxima: " + quantmaxima + ",\n Tipo do carro: \n" + tipocarro;
    }
}