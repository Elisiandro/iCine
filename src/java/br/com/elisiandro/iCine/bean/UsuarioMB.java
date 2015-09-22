package br.com.elisiandro.iCine.bean;



import br.com.elisiandro.iCine.entidade.Usuario;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Elisiandro
 */
@ManagedBean(name="usuarioMB")
//@RequestScoped
@SessionScoped
public class UsuarioMB {

    private List<Usuario> listaUsuarios;
    private Usuario usuario;
    private boolean logado;
    
    public UsuarioMB() {
         listaUsuarios = new ArrayList<Usuario>();
        
         listaUsuarios.add(new Usuario("admin","admin","Administrador", new Date(), false));
         listaUsuarios.add(new Usuario("rodrigo","123","Rodrigo da Silva", new Date(), false));
         listaUsuarios.add(new Usuario("marcia","321","Marcia de Souza", new Date(), false));
         listaUsuarios.add(new Usuario("jose","111","Jose Duarte", new Date(), false));
         
         usuario = new Usuario();
    }
    
    public boolean estaLogado()
    {
        return logado;
    }
    
    public String realizaLogout()
    {
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        logado = false;
        return("login?faces-redirect=true");
    }
    
    public String verificaLogin()
    {
        if (listaUsuarios.contains(usuario))
        {
            logado = true;
            return "principal?faces-redirect=true";
            //return "usuario";
            
        }
        else
        {
            FacesContext context = FacesContext.getCurrentInstance();
            FacesMessage mensagem = new FacesMessage(
                    FacesMessage.SEVERITY_ERROR,
                    "Login invalido",
                    "Usuario ou senha invalido");
            
            context.addMessage("mensagemLogin", mensagem);
            
            return "login";
        }
        
    }
    
    
    
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    
}
