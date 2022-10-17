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

    public void metodoAcesso(Login login){
        login.logar(acesso);
        

    }

    public void logar(){
        
    }

    public void metodoLogin(Login login) {
        login.logar(acesso);

    }
    public void setMetodoLogin(Login login){

    }


    
 

    }

    
    
    

