
package br.com.elisiandro.iCine.bean;

import br.com.elisiandro.iCine.entidade.Usuario;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.primefaces.context.RequestContext;


/**
 *
 * @author Elisiandro
 */
@ManagedBean(name = "loginMB")
@SessionScoped
public class LoginMB implements Serializable{
    
    
    private List<Usuario> listaUsuarios;
    private Usuario usuario;
    private boolean logado;
    
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public LoginMB() {
        
        listaUsuarios = new ArrayList<Usuario>();
        
         listaUsuarios.add(new Usuario("admin","admin","Administrador", new Date(), false));
         /*listaUsuarios.add(new Usuario("rodrigo","123","Rodrigo da Silva", new Date(), false));
         listaUsuarios.add(new Usuario("marcia","321","Marcia de Souza", new Date(), false));
         listaUsuarios.add(new Usuario("jose","111","Jose Duarte", new Date(), false));*/
         
         usuario = new Usuario();
    }

    public String autenticacao()
    {
        if (this.usuario.getUser().equalsIgnoreCase("admin") && this.usuario.getPass().equalsIgnoreCase("admin")) 
        {
            return "view/home.xhtml?faces-redirect=true";
        }
        
        RequestContext.getCurrentInstance().update("growl");
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "Usuário ou Senha inválido!" ));        
        return "";
    }
   
}
