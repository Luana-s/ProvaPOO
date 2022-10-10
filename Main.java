public class Main {

    public static void main(String[]args){

        
        Usuario usuario1 = new Usuario("Joao", "673467367");
        Formulario login1 = new Formulario(usuario1);
        System.out.println(usuario1.getNome()); 
        login1.Logar();


        Usuario usuario2 = new Usuario("maria", "maria@mail.com");
        Google login2=new Google(usuario2);
        System.out.println(usuario2.getNome());
        login2.Logar();

        Usuario usuario3 = new Usuario("luana","jose23459569");
        Facebook login3=new Facebook(usuario3);
        System.out.println(usuario3.getNome());
        login3.Logar();

        Usuario usuario4 = new Usuario("vitoria","894899");
        iCloud login4=new iCloud(usuario4);
        System.out.println(usuario4.getNome());
        login4.Logar();



        System.out.println("----Alterando tipo de login-----  ");

    }
}
