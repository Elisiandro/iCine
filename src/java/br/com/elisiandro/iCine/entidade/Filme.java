
package br.com.elisiandro.iCine.entidade;

import java.util.Objects;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Elisiandro
 */
public class Filme {
    private int codigo;
    private String nome;
    private String genero;
    private String sinopse;
    
    public Filme() {
    }

    public Filme(int codigo, String nome, String genero, String sinopse) {
        this.codigo = codigo;
        this.nome = nome;
        this.genero = genero;
        this.sinopse = sinopse;
    }

    @Override
    public String toString() {
        return "Filmes{" + "codigo=" + codigo + ", nome=" + nome + ", genero=" + genero + ", sinopse=" + sinopse + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + this.codigo;
        hash = 31 * hash + Objects.hashCode(this.nome);
        hash = 31 * hash + Objects.hashCode(this.genero);
        hash = 31 * hash + Objects.hashCode(this.sinopse);
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
        final Filme other = (Filme) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }
    
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }
    
}
