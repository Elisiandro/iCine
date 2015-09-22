package br.com.elisiandro.iCine.entidade;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Elisiandro
 */
public class Usuario {
    private String user;
    private String pass;
    
    private String name;
    private Date dataNascimento;
    private boolean logado;

    public Usuario() {
    }

    public Usuario(String user, String pass, String name, Date dataNascimento, boolean logado) {
        this.user = user;
        this.pass = pass;
        this.name = name;
        this.dataNascimento = dataNascimento;
        this.logado = logado;
    }

    @Override
    public String toString() {
        return "Usuario{" + "user=" + user + ", password=" + pass + ", name=" + name + ", dataNascimento=" + dataNascimento + ", logado=" + logado + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.user);
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
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.user, other.user)) {
            return false;
        }
        return true;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public boolean isLogado() {
        return logado;
    }

    public void setLogado(boolean logado) {
        this.logado = logado;
    }

    
}
