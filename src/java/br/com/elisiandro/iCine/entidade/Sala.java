package br.com.elisiandro.iCine.entidade;

/**
 *
 * @author Elisiandro
 */
public class Sala {

    private int sala;
    private int quantidadeAssentos;
    
    public Sala() {
    }

    public Sala(int sala, int quantidadeAssentos) {
        this.sala = sala;
        this.quantidadeAssentos = quantidadeAssentos;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.sala;
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
        final Sala other = (Sala) obj;
        if (this.sala != other.sala) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Sala{" + "sala=" + sala + ", quantidadeAssentos=" + quantidadeAssentos + '}';
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
