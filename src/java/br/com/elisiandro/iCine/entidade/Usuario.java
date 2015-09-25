package br.com.elisiandro.iCine.entidade;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Elisiandro
 */
public class Usuario {
    public final static int MASCULINO = 1;
    public final static int FEMININO = 2;
    
    private String user;
    private String pass;
    
    private String name;
    private String email;
    private Date dataNascimento;
    private String telefone;
    private int sexo;
    private String estado;
    private boolean admin;

    public Usuario(String user, String pass, String name, String email, Date dataNascimento, String telefone, int sexo, String estado, boolean admin) {
        this.user = user;
        this.pass = pass;
        this.name = name;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.sexo = sexo;
        this.estado = estado;
        this.admin = admin;
    }
    
    public Usuario() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
    
    public String getAdminString(){
        if(admin) return "SIM";
        else return "NAO";
    }

}
