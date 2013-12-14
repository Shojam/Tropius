/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quagsire;

/**
 *
 * @author Roberto
 */
public class Usuario {
    
    String nombre;
    String username;
    String password;

    public Usuario(String nombre, String username, String password) {
        this.nombre = nombre;
        this.username = username;
        this.password = password;
    }
    
    public boolean verifUsuario(String user, String pass){
        if(this.username.contentEquals(nombre)&&this.password.contentEquals(nombre)){
            return true;
        }else{
            return false;
        }
    }
    
}
