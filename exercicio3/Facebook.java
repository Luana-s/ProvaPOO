package exercicio3;

public class Facebook implements Login{

    
    @Override
    public void LogarFacebook() {
        System.out.println("logando pelo Facebook!");
        
    }

    
    @Override
    public void LogarGoogle() {
        System.out.println("logando pelo Google!");

    }

    @Override
    public void LogarFormulario() {
        System.out.println("logando pelo Formulario!");
    }

    @Override
    public void LogariCloud() {
        System.out.println("logando pelo iCloud!");
      
    }

    
}
