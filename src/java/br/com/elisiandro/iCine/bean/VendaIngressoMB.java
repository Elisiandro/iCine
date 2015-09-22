package br.com.elisiandro.iCine.bean;

import java.util.Objects;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Elisiandro
 */
@ManagedBean(name="vendaIngressoMB")
@RequestScoped
public class VendaIngressoMB {

    private SecaoMB secao;
    private SalaMB sala;
    
    public VendaIngressoMB() {
    }

    @Override
    public String toString() {
        return "VendaIngressoMB{" + "secao=" + secao + ", sala=" + sala + '}';
    }

    public VendaIngressoMB(SecaoMB secao, SalaMB sala) {
        this.secao = secao;
        this.sala = sala;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.secao);
        hash = 59 * hash + Objects.hashCode(this.sala);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final VendaIngressoMB other = (VendaIngressoMB) obj;
        if (!Objects.equals(this.secao, other.secao)) {
            return false;
        }
        if (!Objects.equals(this.sala, other.sala)) {
            return false;
        }
        return true;
    }

    public SecaoMB getSecao() {
        return secao;
    }

    public void setSecao(SecaoMB secao) {
        this.secao = secao;
    }

    public SalaMB getSala() {
        return sala;
    }

    public void setSala(SalaMB sala) {
        this.sala = sala;
    }
    
}
