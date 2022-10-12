package exercicio3;

import exercicio3.log.Login;

public  class App {
    private String acesso;

    public App(String acesso){
        this.acesso=acesso;
    }

    public String getAcesso() {
        return acesso;
    }

    public void setAcesso(String acesso) {
        this.acesso = acesso;
    }

    public void MetodoAcesso(Login login){
        login.Logar(acesso);
        

    }


   

    public void Logar(){
        
    }

    public void MetodoLogin(Login login) {
        login.Logar(acesso);

    }


    
 

    }

    
    
    

