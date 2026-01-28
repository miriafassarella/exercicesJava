package exceptions;

import exceptions.myExceptions.InvalidEmailException;

public class UsuarioService {

    boolean emailValid;

    public void cadastrarUsuario(String mail) throws InvalidEmailException {
        for(int i = 0; i <= mail.length() - 1; i++){

            if(mail.charAt(i) == '@'){
                emailValid = true;
            }
        }
        if(emailValid == true){
            System.out.println("Email válido !");
        }else{
            throw new InvalidEmailException("Email invalido !");
        }

    }
}
