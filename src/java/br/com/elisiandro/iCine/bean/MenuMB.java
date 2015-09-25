/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.elisiandro.iCine.bean;

import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Elisiandro
 */
@ManagedBean(name = "menuMB")
@SessionScoped
public class MenuMB {

    private String layout;
    private boolean isAfterdark;

    public boolean isIsAfterdark() {
        return isAfterdark;
    }

    public void setIsAfterdark(boolean isAfterdark) {
        this.isAfterdark = isAfterdark;
    }

    public MenuMB() {
        this.layout = "";
    }

    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    public String troca() {
        if (this.layout.equalsIgnoreCase("afterdark")) {
            this.layout = "bootstrap";
            this.isAfterdark = false;
        } else {
            this.layout = "afterdark";
            this.isAfterdark = true;
        }
        
        System.out.printf("------ verifica mudaTitulo() [ %s ] ", 11);

        return "";
    }

    public void mudaTitulo() {
        Map<String, String> params = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
        String titulo = params.get("primefaces.THEME");
        //this.setTituloProcessamento(titulo);
        //System.out.printf("------ verifica mudaTitulo() [ %s ] ", getTituloProcessamento());
        
        
        
    }
}
