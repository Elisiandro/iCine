
package br.com.elisiandro.iCine.bean;

import br.com.elisiandro.iCine.entidade.Usuario;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.primefaces.context.RequestContext;


/**
 *
 * @author Elisiandro
 */
@ManagedBean(name = "loginMB")
@ApplicationScoped
public class LoginMB implements Serializable{
    
    private List<Usuario> listaUsuarios;
    private Usuario usuarioLogado;
    private Usuario usuarioSelecionado;

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    public Usuario getUsuarioLogado() {
        return usuarioLogado;
    }

    public void setUsuarioLogado(Usuario usuarioLogado) {
        this.usuarioLogado = usuarioLogado;
    }

    public Usuario getUsuarioSelecionado() {
        return usuarioSelecionado;
    }

    public void setUsuarioSelecionado(Usuario usuarioSelecionado) {
        this.usuarioSelecionado = usuarioSelecionado;
    }
    
    
    
    
    public LoginMB() {
        
        listaUsuarios = new ArrayList<Usuario>();
        usuarioSelecionado = new Usuario();
        
        //listaUsuarios.add(new Usuario("admin","admin","Administrador", new Date(), false));
        /*listaUsuarios.add(new Usuario("rodrigo","123","Rodrigo da Silva", new Date(), false));
        listaUsuarios.add(new Usuario("marcia","321","Marcia de Souza", new Date(), false));
        listaUsuarios.add(new Usuario("jose","111","Jose Duarte", new Date(), false));*/         
        
    }

    public String autenticacao()
    {
        if (this.usuarioSelecionado.getUser().equalsIgnoreCase("admin") && this.usuarioSelecionado.getPass().equalsIgnoreCase("admin")) 
        {
            usuarioLogado = usuarioSelecionado;
            return "view/home.xhtml?faces-redirect=true";
        }
        
        RequestContext.getCurrentInstance().update("growl");
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "Usuário ou Senha inválido!" ));        
        return "";
    }
   
    
    
}
