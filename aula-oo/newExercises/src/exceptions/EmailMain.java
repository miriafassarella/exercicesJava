package exceptions;

import exceptions.myExceptions.InvalidEmailException;

public class EmailMain {

    public static void main(String[] args){

        UsuarioService usuarioService = new UsuarioService();

        try {
            usuarioService.cadastrarUsuario("leo@gmail.com");
        }catch(InvalidEmailException e){
            System.out.println(e.getMessage());
        }
    }
}
