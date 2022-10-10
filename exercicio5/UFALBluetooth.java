package exercicio5;

public class UFALBluetooth {

    public UFALBluetooth(){
        AbrirConexao();
        FecharConexao();
        ProcessarDados();

    }

    public void  AbrirConexao(){
        System.out.println("Abrindo conexao ao Bluetooth ");
    }

    public void  FecharConexao(){
        System.out.println(" Fechando conexao ao Bluetooth ");
    }

    public void ProcessarDados(){
        System.out.println(" Processando dados do Bluetooth ");

    }
    
}
   

    