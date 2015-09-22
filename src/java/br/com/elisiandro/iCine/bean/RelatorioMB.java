package br.com.elisiandro.iCine.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Elisiandro
 */
@ManagedBean(name="relatorioMB")
@RequestScoped
public class RelatorioMB {

    private FilmeMB filme;
    private SalaMB sala;
    private SecaoMB secao;
    private VendaIngressoMB vendaingresso;
    
    public RelatorioMB() {
    }
    
}
