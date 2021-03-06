package Model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luiz-
 */
public class Usuario {
    public Long id;
    public String userName;
    public String password;
    public boolean logado;

    public Usuario() {
    }
//getters e setters para usuário
    public Usuario(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public Usuario(Long id, String userName, String password, boolean logado) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.logado = logado;
    }

    public boolean isLogado() {
        return logado;
    }

    public void setLogado(boolean logado) {
        this.logado = logado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
