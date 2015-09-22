package br.com.elisiandro.iCine.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Elisiandro
 */
@ManagedBean(name="salaMB")
@RequestScoped
public class SalaMB {

    private int sala;
    private int quantidadeAssentos;
    
    public SalaMB() {
    }

    public SalaMB(int sala, int quantidadeAssentos) {
        this.sala = sala;
        this.quantidadeAssentos = quantidadeAssentos;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.sala;
        hash = 79 * hash + this.quantidadeAssentos;
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
        final SalaMB other = (SalaMB) obj;
        if (this.sala != other.sala) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SalaMB{" + "sala=" + sala + ", quantidadeAssentos=" + quantidadeAssentos + '}';
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public int getQuantidadeAssentos() {
        return quantidadeAssentos;
    }

    public void setQuantidadeAssentos(int quantidadeAssentos) {
        this.quantidadeAssentos = quantidadeAssentos;
    }
    
}
