package br.com.elisiandro.iCine.bean;

import br.com.elisiandro.iCine.entidade.Filme;
import br.com.elisiandro.iCine.entidade.Sala;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Elisiandro
 */
@ManagedBean(name = "salaMB")
@RequestScoped
public class SalaMB {

    private Sala sala;
    private List<Sala> salas;

    public SalaMB() {
        inicializacao();
    }

    public SalaMB(Sala sala, List<Sala> salas) {
        this.sala = sala;
        this.salas = salas;

        inicializacao();
    }

    public void inicializacao() {
        sala = new Sala();
        salas = new ArrayList<>();

        if (this.salas.size() == 0) {
            salas = new ArrayList<>();
            Sala salaAux;
            for (int i = 0; i < 10; i++) {
                salaAux = new Sala(i, 10);
                salas.add(salaAux);
            }
        }
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public List<Sala> getSalas() {
        return salas;
    }

    public void setSalas(List<Sala> salas) {
        this.salas = salas;
    }

     public void adicionar() 
    {
        this.salas.add(this.sala);
        this.sala = new Sala();
    }
    
}
