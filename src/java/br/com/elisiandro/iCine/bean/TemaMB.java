/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.elisiandro.iCine.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.faces.application.Application;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIViewRoot;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/**
 *
 * @author Elisiandro
 */
@ManagedBean(name = "themeMB")
@SessionScoped
public class TemaMB {

    private String layout;
    private List<String> lista;

    public TemaMB() {
        this.layout = "afterdark";

        lista = new ArrayList<>();
        lista.add("afterdark");
        lista.add("afternoon");
        lista.add("afterwork");
        lista.add("aristo");
        lista.add("black-tie");
        lista.add("blitzer");
        lista.add("bluesky");
        lista.add("bootstrap");
        lista.add("casablanca");
        lista.add("cruze");
        lista.add("cupertino");
        lista.add("dark-hive");
        lista.add("delta");
        lista.add("dot-luv");
        lista.add("eggplant");
        lista.add("excite-bike");
        lista.add("flick");
        lista.add("glass-x");
        lista.add("home");
        lista.add("hot-sneaks");
        lista.add("humanity");
        lista.add("le-frog");
        lista.add("midnight");
        lista.add("mint-choc");
        lista.add("pepper-grinder");
        lista.add("redmond");
        lista.add("rocket");
        lista.add("sam");
        lista.add("smoothness");
        lista.add("south-street");
        lista.add("start");
        lista.add("sunny");
        lista.add("swanky-purse");
        lista.add("themes-project");
        lista.add("trontastic");
        lista.add("ui-darkness");
        lista.add("ui-lightness");
        lista.add("vader");

    }

    public String refresh() {
        FacesContext context = FacesContext.getCurrentInstance();
        
        System.out.println("->  " + this.layout);
        
        return context.getViewRoot().getViewId() + "?faces-redirect=true";
        
        
    }

    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    public List<String> getLista() {
        return lista;
    }

    public void setLista(List<String> lista) {
        this.lista = lista;
    }
}
