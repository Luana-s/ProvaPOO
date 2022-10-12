public class ContaEspecial extends ContaCorrente{

    private float limite;
    public ContaEspecial(String nome, int agencia, int limite) {
        super(nome, agencia);
        this.limite = limite;
    }
    

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
    public void Depositar(float valor){
        this.saldo = valor;
    }
    @Override
    public boolean Sacar(float valor){
        if(valor <= this.getLimite()){
            this.setSaldo(this.saldo - valor);
            return super.Sacar(this.getSaldo());
        }
        return false;
    }
    @Override
    public String toString() {
        return super.toString();
    }
}