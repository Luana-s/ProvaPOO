package exercício6;

public class ContaEspecial extends ContaCorrente{
    private float limite;

    public void ContaEspeciall(float saldo, float limite){
        this.limite = limite;
    }
    public float getLimite(){
        return limite;
    }
    public void setLimite(float limite){
        this.limite = limite;
    }
    @Override
    public boolean Sacar(float valor){
        if(valor <= this.limite){
            this.setSaldo(saldo-valor);
            return Sacar(this.getSaldo());
        }
        return false;
    }
    public String toString(){
        return this.toString();
        
    }
}
