
package br.com.elisiandro.iCine.bean;

import br.com.elisiandro.iCine.entidade.Filme;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Elisiandro
 */
@ManagedBean(name="filmeMB")
@RequestScoped
public class FilmeMB {
    
    private Filme filme;
    private List<Filme> filmes;
    
    public FilmeMB() {
    }

    public FilmeMB(Filme filme, List<Filme> filmes) {
        this.filme = filme;
        this.filmes = filmes;
    }
    
    public void adicionar()
    {
        if (filmes != null)
            filmes = new ArrayList<>();
        
        filmes.add(filme);
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public List<Filme> getFilmes() {
        return filmes;
    }

    public void setFilmes(List<Filme> filmes) {
        this.filmes = filmes;
    }
    
    
    
}
