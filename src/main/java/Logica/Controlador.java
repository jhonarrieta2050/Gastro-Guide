
package Logica;
import IGU.Inicio;
import IGU.UserAdmin;
import java.util.ArrayList;

public class Controlador {
    
    private static final ArrayList<Usuario> usuarios = new ArrayList<>();
    
    public void insert(Usuario usuario){                            
        usuario.setIndex(usuarios.size());
        usuarios.add(usuario);
        

    }
    
    public Usuario searchByUserName(String username){
        Usuario userFound = new Usuario();
        if (!usuarios.isEmpty()){
            for (Usuario usu : usuarios) {
                if(usu.getUsername().equals(username)){
                    userFound = usu;
                    return userFound;
                    
                }
            }
        }else{
            System.out.print("Usuario no existe");
        }
        return userFound;
    
    }
    
    public void edit(int index , Usuario usuario){
        usuarios.set(index, usuario);
        
    }
        
        
  }
     

