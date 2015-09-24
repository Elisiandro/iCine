package br.com.elisiandro.iCine.bean;

import br.com.elisiandro.iCine.entidade.Filme;
import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Elisiandro
 */
@ManagedBean(name = "filmeMB")
//@RequestScoped
@SessionScoped
public class FilmeMB {

    private Filme filme; 
    private List<Filme> filmes;

    public FilmeMB() {
        inicializacao();
    }

    public FilmeMB(Filme filme, List<Filme> filmes) {
        this.filme = filme;
        this.filmes = filmes;
        
        inicializacao();
    }

    public void inicializacao()
    {
        filme = new Filme();
        filmes = new ArrayList<>();
        
        if (this.filmes.size() == 0)
        {
            filmes = new ArrayList<>();            
            Filme filmeAux;
            for (int i = 0; i < 10; i++) {
                filmeAux = new Filme(i+1, "Nome "+ (i+1), "Acao", "texto sinopse "+ (i+1));
                filmes.add(filmeAux);
            }            
        }
    }

    public void adicionar() 
    {
        this.filmes.add(this.filme);
        this.filme = new Filme();
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
