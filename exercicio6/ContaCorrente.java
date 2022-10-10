package exercício6;

public class ContaCorrente {
    protected float saldo;

    public void Contal(){

    }
    public float getSaldo(){
        return saldo;
    }
    public void setSaldo(float saldo){
        this.saldo = saldo;
    }
    public void Conta(float saldo){
        this.saldo = saldo;
    }
    public void Depositar(float valor){
        this.saldo = valor;
    }
    public boolean Sacar(float valor){
        float extrato = this.saldo - valor;
        if(extrato > 0){
            this.setSaldo(extrato);
            return true;
        }
        return false;
    }
    @Override
    public String toString(){
        return ("saldo: " + saldo);
    }
    public boolean Trasnferir(ContaCorrente conta){
        return true;
    }
}
