package exercicio3;

public class Main1 {
    public static void main(String[] args) {
        Usuario1 Maria = new Usuario1();

        Google google = new Google();
        Maria.setLogin(google);

        System.out.println("---- MARIA ----");
        Maria.LogarGoogle();


        Usuario2 Luana = new Usuario2();

        Formulario formulario = new Formulario();
        Luana.setLogin(formulario);

        System.out.println("----LUANA ----");
        Luana.LogarFormulario();

        Usuario2 Joao = new Usuario2();


        iCloud icloud = new iCloud();
        Joao.setLogin(icloud);

        System.out.println("----JOAO----");
        Joao.LogariCloud();

        Usuario1 Jose = new Usuario1();

        Facebook facebook = new Facebook();
        Jose.setLogin(facebook);

        System.out.println("---- JOSE----");
        Jose.LogarFacebook();

        System.out.println("  \n");






        System.out.println("Alterando futuros login  \n");
        Maria.setLogin(LogarFormulario());
        Luana.setLogin(LogariCloud());
        Joao.setLogin(LogarGoogle());
        Jose.setLogin(LogariCloud());

        System.out.println("---MARIA --- ");
        Maria.LogarFormulario();

        System.out.println("--Luana--- ");
        Luana.LogariCloud();

        System.out.println("---JOAO--- ");
        Joao.LogarGoogle();

        System.out.println("--JOSE --- ");
        Maria.LogariCloud();


        
        
    }

    private static Formulario LogariCloud() {
        return null;
    }

    private static Formulario LogarGoogle() {
        return null;
    }

    private static Login LogarFormulario() {
        return null;
    } 
}
