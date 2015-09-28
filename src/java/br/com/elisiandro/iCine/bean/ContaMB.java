/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.elisiandro.iCine.bean;

import br.com.elisiandro.iCine.entidade.Conta;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.application.Application;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;



@ManagedBean
@SessionScoped
public class ContaMB implements Serializable {

    private Conta conta = new Conta();
    private List<Conta> lista = new ArrayList<Conta>();
    private Map<String, String> tipos = new HashMap<String, String>();

    public Map<String, String> getTipos() {
        tipos.put("Corrente", "C");
        tipos.put("Poupança", "P");

        return tipos;
    }
    public Conta getConta() {
        return conta;
    }
    public List<Conta> getLista() {
        
        
        
        return lista;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }
    public void setLista(List<Conta> lista) {
        this.lista = lista;
    }
    public void setTipos(Map<String, String> tipos) {
        this.tipos = tipos;
    }
    

    public String cancelar(){
        return "index";
    }

    public String limpar(){
        this.conta = null;
        this.conta = new Conta();

        return "contas";
    }

    public void reload(){
        FacesContext context = FacesContext.getCurrentInstance();
        Application application = context.getApplication();
        javax.faces.application.ViewHandler viewHandler = application.getViewHandler();
        UIViewRoot viewRoot = viewHandler.createView(context, context.getViewRoot().getViewId());
        context.setViewRoot(viewRoot);
        context.renderResponse();
    }

    public void salvar(ActionEvent actionEvent){
         try{
            FacesContext context = FacesContext.getCurrentInstance();

            if(this.conta.getIdConta() == 0){
                
                this.lista = null;
                limpar();
                context.addMessage(null, new FacesMessage("Sucesso", "Registro salvo com sucesso!"));
            }else{
                
                this.lista = null;
                limpar();
                context.addMessage(null, new FacesMessage("Sucesso", "Registro atualizado com sucesso!"));
            }
         }catch(Exception e){
            e.printStackTrace();
         }
         reload();   
    }

    public void editar(ActionEvent actionEvent){
        try{
            conta = (Conta)actionEvent.getComponent().getAttributes().get("conta");
            reload();
        }catch(Exception e){
            e.printStackTrace();
        }

    }

    public String excluir(ActionEvent actionEvent){
        try{
            FacesContext context = FacesContext.getCurrentInstance();

            conta = (Conta)actionEvent.getComponent().getAttributes().get("conta");
            
            this.lista = null;
            limpar();

            context.addMessage(null, new FacesMessage("Sucesso", "Registro excluído com sucesso!"));
            reload();
        }catch(Exception e){
            e.printStackTrace();
        }

        return "contas";
    }
}